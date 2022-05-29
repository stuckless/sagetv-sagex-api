package sagex.util;

import sagex.api.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Provides some basic Type conversion between String types and other concrete types
 * 
 * @author seans
 *
 */
public class TypesUtil {
    private static final ILog log = LogProvider.getLogger(TypesUtil.class);
    
    public static int toInt(String s, int defValue) {
        if (s==null) return defValue;
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return defValue;
        }
    }
    public static float toFloat(String s, float defValue) {
        if (s==null) return defValue;
        try {
            return Float.parseFloat(s);
        } catch (NumberFormatException e) {
            return defValue;
        }
    }
    public static long toLong(String s, long defValue) {
        if (s==null) return defValue;
        try {
            return Long.parseLong(s);
        } catch (NumberFormatException e) {
            return defValue;
        }
    }
    public static double toDouble(String s, double defValue) {
        if (s==null) return defValue;
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return defValue;
        }
    }
    public static boolean toBoolean(String s, boolean defValue) {
        if (s==null) return defValue;
        return Boolean.parseBoolean(s);
    }
    /**
     * Attempts to convert a String long value to a date.  If that fails, it will use a date
     * parsing mask and attempt to parse the date using that mask.  the default mask is
     * YYYY-MM-DD
     * 
     * @param s
     * @return
     */
    public static Date toDate(String s) {
        if (s==null||s.trim().length()==0) return null;
        try {
            long l = Long.parseLong(s);
            return new Date(l);
        } catch (NumberFormatException e) {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return f.parse(s);
            } catch (ParseException e1) {
                // we'll log it later
            }
        }
        log.warn("Failed to convert {" + s + "} to a valid date");
        return null;
    }
    
    /**
     * Given the input string attempt to convert it to the returnType or null.  For numeric types
     * if null, then the the return will be 0.  For boolean it will be false, and for all other
     * types it will be null.
     *  
     * @param value
     * @param returnType
     * @return
     */
    public static Object fromString(String value, Class returnType) {
        if (returnType == String.class) {
            return value;
        } else if (returnType == int.class || returnType == Integer.class) {
            return toInt(value, 0);
        } else if (returnType == long.class || returnType == Long.class) {
            return toLong(value, 0l);
        } else if (returnType == boolean.class || returnType == Boolean.class) {
            return toBoolean(value, false);
        } else if (returnType == float.class || returnType == Float.class) {
            return toFloat(value, 0.0f);
        } else if (returnType == double.class || returnType == Double.class) {
            return toDouble(value, 0.0d);
        } else if (returnType == Date.class) {
            return toDate(value);
        } else if (returnType == Object.class) {
            return value;
        } else {
            log.warn("Unhandled fromString() conversion, return null for type: " + returnType);
        }
        return null;
    }
    
    /**
     * Converts primitives and Date into a String.  For a date, the value is the Date.getTime() long value.
     * 
     * @param in
     * @return
     */
    public static String toString(Object in) {
        if (in==null) return null;
        Class type = in.getClass();
        if (type == String.class) {
            return (String) in;
        } else if (type == int.class || type == Integer.class) {
            return String.valueOf(in);
        } else if (type == long.class || type == Long.class) {
            return String.valueOf(in);
        } else if (type == boolean.class || type == Boolean.class) {
            return String.valueOf(in);
        } else if (type == float.class || type == Float.class) {
            return String.valueOf(in);
        } else if (type == double.class || type == Double.class) {
            return String.valueOf(in);
        } else if (type == Date.class) {
        	return String.valueOf(((Date)in).getTime());
        } else if (type == Object.class) {
        	return in.toString();
        } else {
            log.warn("Unhandled toString() conversion, return null for type: " + type);
        }
        return null;
    }

    /**
     * Given a string like sageobjecttype:sageobjectid, split it and return the parts in an
     * array of 2 elements or null, if the reference is not a valid reference format.
     * @param ref string
     * @return
     */
    public static String[] toSageRefParts(String ref) {
        int pos = ref.indexOf(":");
        if (pos<0) {
            // not a valid key
            return null;
        }
        return new String[] {ref.substring(0, pos), ref.substring(pos+1)};
    }

    /**
     * Converts to a sagetv object using a reference string.  A Reference string is in the format
     * <pre>sageobjectype:sageobjectid</pre> ie, <pre>mediafile:1234</pre>
     * @param ref
     * @return
     */
    public static Object toSageObject(String ref) {
        String parts[] = toSageRefParts(ref);
        if (parts==null || parts.length!=2) return null;
        return toSageObject(parts[0], parts[1]);
    }

    /**
     * Converts to sagetv object using a RemoteRefe instance
     * @param ref
     * @return
     */
    public static Object toSageObject(RemoteRef ref) {
        if (ref==null) return null;
        return toSageObject(ref.getType(), ref.getId());
    }

    /**
     * Converts a sage reference (type and id) into a sage tv object, by resolving the object type
     * with the id.
     *
     *
     * @param type one of airing,album,channel,favorite,mediafile,playlist,plugin,series,systemmessage,userrecord,widget
     * @param id primary object id for the type
     * @return
     */
    public static Object toSageObject(String type, String id) {
        if (type==null || id==null) {
            return null;
        } else if ("airing".equals(type)) {
            return AiringAPI.GetAiringForID(Integer.parseInt(id));
        } else if ("album".equals(type)) {
            return getFirst(Database.FilterByMethod(AlbumAPI.GetAlbums(), "GetAlbumName", id, true));
        } else if ("channel".equals(type)) {
            return ChannelAPI.GetChannelForStationID(Integer.parseInt(id));
        } else if ("favorite".equals(type)) {
            return FavoriteAPI.GetFavoriteForID(Integer.parseInt(id));
        } else if ("mediafile".equals(type)) {
            return MediaFileAPI.GetMediaFileForID(Integer.parseInt(id));
        } else if ("person".equals(type)) {
            return PersonAPI.GetPersonForID(Integer.parseInt(id));
        } else if ("playlist".equals(type)) {
            return getFirst(Database.FilterByMethod(PlaylistAPI.GetPlaylists(), "GetName", id, true));
        } else if ("plugin".equals(type)) {
            return PluginAPI.GetAvailablePluginForID(id);
        } else if ("series".equals(type)) {
            return SeriesInfoAPI.GetSeriesInfoForID(id);
        } else if ("show".equals(type)) {
            return ShowAPI.GetShowForExternalID(id);
        } else if ("systemmessage".equals(type)) {
            return getFirst(Database.FilterByMethod(SystemMessageAPI.GetSystemMessages(), "hashCode", Integer.parseInt(id), true));
        } else if ("userrecord".equals(type)) {
            String parts[] = id.split(":");
            return UserRecordAPI.GetUserRecord(parts[0],parts[1]);
        } else if ("widget".equals(type)) {
            return WidgetAPI.FindWidgetBySymbol(id);
        } else {
            log.warn("Unknown Sage Object Type: " + type);
        }
        return null;
    }

    /**
     * Given a sagetv object convert it into a RemoteRef object, which is a simple object holds the
     * type and id for the object.  It can later be converted back to a sagetv object using the
     * toSageObject(ref) method.  This will return an object reference type of 'unknown' if the passed
     * in object cannot be converted to reference
     *
     * @param in SageTV object
     * @return RemoteRef instance
     */
    public static RemoteRef toSageObjectRef(Object in) {
        String type, id;
        if (in == null) {
            return null;
        } else if (AiringAPI.IsAiringObject(in)) {
            type="airing";
            id=String.valueOf(AiringAPI.GetAiringID(in));
        } else if (AlbumAPI.IsAlbumObject(in)) {
            type="album";
            id=String.valueOf(AlbumAPI.GetAlbumName(in));
        } else if (ChannelAPI.IsChannelObject(in)) {
            type="channel";
            id=String.valueOf(ChannelAPI.GetStationID(in));
        } else if (FavoriteAPI.IsFavoriteObject(in)) {
            type="favorite";
            id=String.valueOf(FavoriteAPI.GetFavoriteID(in));
        } else if (MediaFileAPI.IsMediaFileObject(in)) {
            type="mediafile";
            id=String.valueOf(MediaFileAPI.GetMediaFileID(in));
        } else if (PersonAPI.IsPersonObject(in)) {
            type="person";
            id=String.valueOf(PersonAPI.GetPersonID(in));
        } else if (PlaylistAPI.IsPlaylistObject(in)) {
            type="playlist";
            id=String.valueOf(PlaylistAPI.GetName(in));
        } else if (PluginAPI.IsPluginObject(in)) {
            type="plugin";
            id=String.valueOf(PluginAPI.GetPluginIdentifier(in));
        } else if (SeriesInfoAPI.IsSeriesInfoObject(in)) {
            type="series";
            id=String.valueOf(SeriesInfoAPI.GetSeriesID(in));
        } else if (ShowAPI.IsShowObject(in)) {
            type="show";
            id=String.valueOf(ShowAPI.GetShowExternalID(in));
        } else if (SystemMessageAPI.IsSystemMessageObject(in)) {
            type="systemmessage";
            id=String.valueOf(in.hashCode());
        } else if (UserRecordAPI.IsUserRecordObject(in)) {
            type="userrecord";
            id= ((sage.UserRecord)in).getStore() + ":" + ((sage.UserRecord)in).getKey();
        } else if (in instanceof RemoteRef) {
            log.warn("we were passed a remote ref as a sage object.  Likely a programmer error.");
            type=((RemoteRef) in).getType();
            id= ((RemoteRef) in).getId();
        } else if (in instanceof sage.Widget) {
            type="widget";
            id= WidgetAPI.GetWidgetSymbol(in);
        } else {
            log.warn("Unknown Object: " + in);
            type="unknown";
            id=in.getClass().getName();
        }

        return new RemoteRef(type, id);
    }


    private static Object getFirst(Object collection) {
        if (collection==null) return null;
        return Utility.GetElement(collection, 0);
    }

}
