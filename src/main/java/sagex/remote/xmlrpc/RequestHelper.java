package sagex.remote.xmlrpc;

import java.io.File;

import sagex.api.AiringAPI;
import sagex.api.ChannelAPI;
import sagex.api.FavoriteAPI;
import sagex.api.MediaFileAPI;
import sagex.api.PlaylistAPI;
import sagex.api.PluginAPI;
import sagex.api.SeriesInfoAPI;
import sagex.api.ShowAPI;
import sagex.api.WidgetAPI;
import sagex.remote.RemoteObjectRef;
import sagex.remote.RemoteRequest;

public class RequestHelper {
	public static RemoteRequest createRequest(String context, String command, String[] args, Class... argTypes) {
		return new RemoteRequest(context, command, createParameters(args, (Class[]) argTypes));
	}

	public static Object[] createParameters(String[] args, Class... argTypes) {
		// if the signature doesn't have any args, then return null
		if (argTypes == null || argTypes.length == 0)
			return null;

		if (args == null || args.length < argTypes.length) {
			throw new RuntimeException(String.format("Too few args; Your Arg Count: %s; Required Arg Count: %s", (args==null) ? 0 : args.length, argTypes.length));
		}
		if (args.length > argTypes.length) {
			throw new RuntimeException(String.format("Too many args; Your Arg Count: %s; Required Arg Count: %s", args.length, argTypes.length));
		}

		int argLen = args.length;

		Object reply[] = new Object[argLen];

		for (int i = 0; i < argLen; i++) {
			reply[i] = makeTypedArg(args[i], argTypes[i]);
		}

		return reply;
	}

	private static Object makeTypedArg(String str, Class typeClass) {
		if (typeClass.isPrimitive()) {
			if (typeClass.equals(int.class) || typeClass.equals(Integer.class)) {
				return Integer.parseInt(str);
			} else if (typeClass.equals(boolean.class) || typeClass.equals(Boolean.class)) {
				return Boolean.parseBoolean(str);
			} else if (typeClass.equals(float.class) || typeClass.equals(Float.class)) {
				return Float.parseFloat(str);
			} else if (typeClass.equals(long.class) || typeClass.equals(Long.class)) {
				return Long.parseLong(str);
			} else if (typeClass.equals(double.class) || typeClass.equals(Double.class)) {
				return Double.parseDouble(str);
			}
		} else if (typeClass.equals(String.class)) {
			return str;
		} else  if (File.class.equals(typeClass)) {
		    return new File(str);
		} else {
		    Object retObj = makeSageObject(str);
		    if (retObj!=null) return retObj;

		    // else assume an array.
			int p = str.indexOf(":");
			if (p != -1) {
				// array index object ref
				String id = str.substring(0, p);
				int idx = Integer.parseInt(str.substring(p + 1));
				return new RemoteObjectRef(id, idx);
			} else {
				// object ref
				return new RemoteObjectRef(str);
			}
		}
		return null;
	}
	
	public static Object makeSageObject(String str) {
        if (str.startsWith("channel")){
            String cargs[] = str.split(":");
            Object retObj = new Object();
            try {
                retObj = ChannelAPI.GetChannelForStationID(Integer.parseInt(cargs[1]));
            } catch (Exception e) { }
            return retObj;
        } else if (str.startsWith("airing")){
            String cargs[] = str.split(":");
            Object retObj = new Object();
            try {
                retObj = AiringAPI.GetAiringForID(Integer.parseInt(cargs[1]));
            } catch (Exception e) { }
            return retObj;
        } else if (str.startsWith("mediafile")){
            String cargs[] = str.split(":");
            Object retObj = new Object();
            try {
                retObj = MediaFileAPI.GetMediaFileForID(Integer.parseInt(cargs[1]));
            } catch (Exception e) { }
            return retObj;
        } else if (str.startsWith("show")){
            String cargs[] = str.split(":");
            Object retObj = new Object();
            try {
                retObj = ShowAPI.GetShowForExternalID(cargs[1]);
            } catch (Exception e) { }
            return retObj;
        } else if (str.startsWith("series")){
            String cargs[] = str.split(":");
            Object retObj = new Object();
            try {
                retObj = SeriesInfoAPI.GetSeriesInfoForID(cargs[1]);
            } catch (Exception e) { }
            return retObj;
        } else if (str.startsWith("favorite")){
            String cargs[] = str.split(":");
            Object retObj = new Object();
            try {
                retObj = FavoriteAPI.GetFavoriteForID(Integer.parseInt(cargs[1]));
            } catch (Exception e) { }
            return retObj;
        } else if (str.startsWith("plugin")){
            String cargs[] = str.split(":");
            Object retObj = new Object();
            try {
                retObj = PluginAPI.GetAvailablePluginForID(cargs[1]);
            } catch (Exception e) { }
            return retObj;
        } else if (str.startsWith("playlist")){
            String cargs[] = str.split(":");
            Object retObj = new Object();
            try {
                Object all[] = PlaylistAPI.GetPlaylists();
                if (all==null) return retObj;
                for (Object o : all) {
                    String name = PlaylistAPI.GetName(o);
                    if (name.equals(cargs[1])) {
                        return o;
                    }
                }
                return retObj;
            } catch (Exception e) { }
            return retObj;
        } else if (str.startsWith("widget")){
            String cargs[] = str.split(":");
            Object retObj = new Object();
            try {
                retObj = WidgetAPI.FindWidgetBySymbol(cargs[1]);
            } catch (Exception e) { }
            
            return retObj;
        }
        return null;
	}
}
