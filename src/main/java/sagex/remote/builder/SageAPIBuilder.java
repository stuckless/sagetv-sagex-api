package sagex.remote.builder;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import sagex.api.AiringAPI;
import sagex.api.AlbumAPI;
import sagex.api.ChannelAPI;
import sagex.api.FavoriteAPI;
import sagex.api.MediaFileAPI;
import sagex.api.PlaylistAPI;
import sagex.api.PluginAPI;
import sagex.api.SeriesInfoAPI;
import sagex.api.ShowAPI;
import sagex.api.SystemMessageAPI;
import sagex.api.Utility;

public class SageAPIBuilder {
    public static final SageAPIBuilder INSTANCE = new SageAPIBuilder();
    
    private Map<Class, Method[]>  reflectionMap = new HashMap<Class, Method[]>();
    
    public void build(String name, Object parent, BuilderHandler handler, boolean arrayItem, String[] filter) throws Exception {
        if (parent==null) {
            buildSimpleData(name, parent, handler);
        } else if (parent instanceof String || parent.getClass().isPrimitive() || Number.class.isAssignableFrom(parent.getClass()) || Boolean.class.isAssignableFrom(parent.getClass())) {
            if (arrayItem) {
                buildSimpleData("Item", parent, handler);
            } else {
                buildSimpleData(name, parent, handler);
            }
        } else if (parent instanceof Map) {
            buildMap(name, (Map) parent, handler, filter);
        } else if (parent instanceof Collection) {
            buildCollection(name, (Collection) parent, handler, filter);
        } else if (parent instanceof File) {
            if (arrayItem) {
                buildFile("File", (File)parent, handler);
            } else {
                buildFile(name, (File)parent, handler);
            }
        } else if (parent.getClass().isArray()) {
            buildArray(name, (Object[])parent, handler, filter);
        } else if (MediaFileAPI.IsMediaFileObject(parent)) {
            buildMediaFile(parent, handler, filter);
        } else if(ShowAPI.IsShowObject(parent)) {
            buildShow(parent, handler, filter);
        } else if(AiringAPI.IsAiringObject(parent)) {
            buildAiring(parent, handler, filter);
        } else if(AlbumAPI.IsAlbumObject(parent)) {
            buildAlbum(parent, handler, filter);
        } else if(FavoriteAPI.IsFavoriteObject(parent)) {
            buildFavorite(parent, handler, filter);
        } else if(ChannelAPI.IsChannelObject(parent)) {
            buildChannel(parent, handler, filter);
        } else if(SystemMessageAPI.IsSystemMessageObject(parent)) {
            buildSystemMessage(parent, handler, filter);
        } else if(PlaylistAPI.IsPlaylistObject(parent)) {
            buildPlaylist(parent, handler, filter);
        } else if(SeriesInfoAPI.IsSeriesInfoObject(parent)) {
            buildSeriesInfo(parent, handler, filter);
        } else if(Utility.IsMetaImage(parent)) {
            buildImage(name, parent, handler);
        } else if(parent.toString().contains("SageTVPlugin[")) {
            buildPlugin(name, parent, handler, filter);
        } else {
            handler.handleError("Cannot Serialize Reply", new BuilderException(name, parent));
        }
    }

	private void buildImage(String name, Object parent, BuilderHandler handler) {
        buildFile(name, Utility.GetMetaImageSourceFile(parent), handler);
	}

	private void buildSimpleData(String name, Object data, BuilderHandler handler) {
        handler.handleField(makeName(name), data);
    }

    public void buildFile(String name, File parent, BuilderHandler handler) {
        try {
        	if (parent==null) {
        		buildSimpleData(name, "", handler);
        	} else {
        		buildSimpleData(name, parent.getCanonicalPath(), handler);
        	}
        } catch (IOException e) {
            buildSimpleData(name, parent.getAbsolutePath(), handler);
        }
    }

    public void buildChannel(Object parent, BuilderHandler handler, String[] filter) throws Exception {
        buildObject("Channel", ChannelAPI.class, parent, handler, new String[] {"GetChannelLogo"}, filter);
    }

    public void buildFavorite(Object parent, BuilderHandler handler, String[] filter) throws Exception {
        buildObject("Favorite", FavoriteAPI.class, parent, handler, null, filter);
    }

    private void buildPlugin(String name, Object parent, BuilderHandler handler, String[] filter) throws Exception {
        buildObject("Plugin", PluginAPI.class, parent, handler, new String[] {"GetAllPluginVersions", "GetSageTVPluginRegistry", "GetPluginProgress", "GetPluginImplementation"}, filter);
	}

    private void buildSystemMessage(Object parent, BuilderHandler handler, String[] filter) throws Exception {
        buildObject("SystemMessage", SystemMessageAPI.class, parent, handler, new String[] {"DeleteSystemMessage"}, filter);
    }

    public void buildAlbum(Object parent, BuilderHandler handler, String[] filter) throws Exception {
        buildObject("Album", AlbumAPI.class, parent, handler, new String[] {"GetAlbumArt", "GetAlbumTracks"}, filter);
    }

    public void buildAiring(Object parent, BuilderHandler handler, String[] filter) throws Exception {
        buildObject("Airing", AiringAPI.class, parent, handler, new String[] {"GetMediaFileForAiring", "GetAiringOnAfter", "GetAiringOnBefore"}, filter);
    }

    public void buildShow(Object parent, BuilderHandler handler, String[] filter) throws Exception {
        buildObject("Show", ShowAPI.class, parent, handler, new String[] {"GetShowSeriesInfo", "IsShowFirstRun", "IsShowReRun"}, filter);
    }

    public void buildMediaFile(Object parent, BuilderHandler handler, String[] filter) throws Exception {
        buildObject("MediaFile", MediaFileAPI.class, parent, handler, new String[] {"GetFullImage", "GetThumbnail", "GetStartTimesForSegments"}, filter);
    }

    public void buildPlaylist(Object parent, BuilderHandler handler, String[] filter) throws Exception {
        buildObject("Playlist", PlaylistAPI.class, parent, handler, null, filter);
    }

    public void buildSeriesInfo(Object parent, BuilderHandler handler, String[] filter) throws Exception {
        buildObject("SeriesInfo", SeriesInfoAPI.class, parent, handler, new String[]{"GerSeriesInfoForID", "GetAllSeriesInfo", 
        	//TODO These next 2 only need to be excluded until Sage fixes the API documentation to reflect that they return String[]
        	//  so that the generated API signature can be corrected.
        	"GetSeriesActorList", "GetSeriesCharacterList"}, filter);
    }
    
    public void buildObject(String objectName, Class staticObjectClass, Object parent, BuilderHandler handler, String[] ignoreMethods, String[] filter) throws Exception {
        Method methods[] = getMethods(staticObjectClass, ignoreMethods);
        handler.beginObject(makeName(objectName));
        if(filter != null && filter.length > 0)
        	Arrays.sort(filter);
        else
        	filter = null;
        for (Method m : methods) {
        	if(filter != null && Arrays.binarySearch(filter, makeName(m.getName()))<0) { 
        		// System.out.println("SKIPPING: " + m.getName());
        		continue;
        	}
            try {
                Object result = m.invoke(null, parent);
                build(m.getName(), result, handler, false, filter);
            } catch (Exception e) {
                handler.handleError("Failed while Calling "+objectName+" Method: " + m.getName() + " on Object: " + objectName + "; (Sage Object: "+ parent+")", e);
            }
        }
        handler.endObject(makeName(objectName));
    }
    
    private Method[] getMethods(Class klass, String[] ignoreMethods) {
        Method m[] = reflectionMap.get(klass);
        
        if (m==null) {
            List<Method> methods = new LinkedList<Method>();
            m = klass.getDeclaredMethods();
            for (Method meth : m) {
                if (meth.getName().startsWith("Get") || meth.getName().startsWith("Is")) {
                    Class p[] = meth.getParameterTypes();
                    if (p!=null && p.length==1 && p[0].equals(Object.class) &&!ignoreMethod(meth.getName(), ignoreMethods)) {
                   		methods.add(meth);
                    }
                }
            }
            
            // hack because ShowAPI.IsShowFirstRun doesn't work on Show Object
            if (klass == MediaFileAPI.class || klass == AiringAPI.class) {
            	try {
					methods.add(ShowAPI.class.getMethod("IsShowFirstRun", Object.class));
					methods.add(ShowAPI.class.getMethod("IsShowReRun", Object.class));
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				}
            }
            
            m = methods.toArray(new Method[methods.size()]);
            reflectionMap.put(klass, m);
        }
        
        return m;
    }

    private boolean ignoreMethod(String name, String[] ignoreMethods) {
        if (ignoreMethods==null) return false;
        for (String s : ignoreMethods) {
            if (name.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public void buildArray(String name, Object[] parent, BuilderHandler handler, String[] filter) throws Exception {
        handler.beginArray(makeName(name), parent.length);
        for (Object o : parent) {
            build(name, o, handler, true, filter);
        }
        handler.endArray(makeName(name));
    }

    public void buildCollection(String name, Collection parent, BuilderHandler handler, String[] filter) throws Exception {
        handler.beginArray(makeName(name), parent.size());
        for (Object o : parent) {
            build(name, o, handler, true, filter);
        }
        handler.endArray(makeName(name));
    }

    private void buildMap(String name, Map parent, BuilderHandler handler, String[] filter) throws Exception {
        handler.beginObject(makeName(name));
        for (Object o: parent.entrySet()) {
        	Map.Entry me = (Entry) o;
        	build(String.valueOf(me.getKey()), me.getValue(), handler, false, filter);
        }
        handler.endObject(makeName(name));
	}

    
    public String makeName(String name) {
        if (name!=null) {
        	name=name.replaceFirst("^Get", "");
        	name=name.replaceAll("[^A-Za-z0-9]+", "");
        	if (name.length()==0) {
        		name="Item";
        	}
        	if (Character.isDigit(name.charAt(0))) {
        		name = "X" + name;
        	}
        }
        return name;
    }
}
