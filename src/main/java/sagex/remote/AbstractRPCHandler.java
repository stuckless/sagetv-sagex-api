package sagex.remote;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import sage.UserRecord;
import sage.Widget;
import sage.msg.SystemMessage;
import sagex.SageAPI;
import sagex.api.*;
import sagex.remote.RemoteRequest;
import sagex.remote.RemoteResponse;
import sagex.remote.rmi.IRCPHandler;
import sagex.util.ILog;
import sagex.util.LogProvider;

/**
 * Accepts RemoteRequest object and returns a RemoteResponse object.
 * 
 * The RemoteRequest is decoded and passed off to the SageAPI. The response from
 * sage is then placed into the RemoteResponse.
 * 
 * All native sage objects are converted into RemoteObjectRef objects, so they
 * are never sent back directly. All object arrays that are not serializable are
 * also sent back as RemoteObjectRef objects. Serializable Objects and Arrays
 * are sent back in full.
 * 
 * Local Object References are stored in a WeakHashMap so there is the change
 * that objects in the Map will disappear before they are accessed. This will
 * have undetermined results in the calling application.
 * 
 * @author seans
 * 
 */
public abstract class AbstractRPCHandler implements IRCPHandler {
	protected ILog log = LogProvider.getLogger(this.getClass()); 
	
	public AbstractRPCHandler() {
	}
	
	public void handleRPCCall(RemoteRequest request, RemoteResponse response) {
		try {
			// convert object references in the request into real sage references...
			Object oArr[] = request.getParameters();
			if (oArr != null && oArr.length > 0) {
				for (int i = 0; i < oArr.length; i++) {
					Object o = oArr[i];
					if (o==null) {
					    continue;
                    }
					if (o.getClass().isArray() && o.getClass().getComponentType().isInstance(RemoteRef.class)) {
						log.debug("Converting Remote Object Reference Array into a Sage Array.");
						// check if the incomming object parameter is an array of RemoteObjectReferences
						// if so, then convert the array, into a real array
						Object oo[] = (Object[])o;
						if (oo.length>0) {
							// arrays are stored under the same ref id as each of the children
							oArr[i] = convertRefArrayToSageArray(oo);
						} else {
							// empty object array;
							oArr[i] = new Object[0];
						}
					} else if (o instanceof RemoteRef) {
						log.debug("Converting Remote Object Reference into a Sage Reference.");
						// replace this reference with the real thing...
                        oArr[i] = convertRefToSageObject((RemoteRef) o);
					} else {
//					    if (o.getClass().isArray()) {
//					        dumpArray((Object[])o);
//                        }
                        oArr[i] = o;
                    }
				}
			}

			// invoke the server
			Object oreply = null;
			if (request.getContext() != null) {
				oreply = SageAPI.call(request.getContext(), request.getCommand(), oArr);
			} else {
				oreply = SageAPI.call(request.getCommand(), oArr);
			}

			// convert the sage reply to something serializable, ie, convert the
			// sage references to object references..
			// TODO: Broken for Lists and Maps because we need to check for sage types inside those lists/maps.
			Object finalReply = null;

			if (oreply != null) {
			    // Handle Sage Vector Replies
			    if (oreply instanceof Vector && ((Vector)oreply).size()>0 && !isSerializable(((Vector)oreply).get(0))) {
			        Vector v = (Vector)oreply;
			        Vector newV = new Vector(v.size());
			        for (Object o : v) {
			            newV.add(createSageObjectRef(o));
			        }
			        oreply = newV;
			    }
			    
				if (oreply.getClass().isArray()) {
					if (oreply.getClass().getComponentType().isPrimitive() || Serializable.class.isAssignableFrom(oreply.getClass().getComponentType()) || oreply.getClass().getComponentType().equals(String.class)) {
						// we can send back primitives and serialiable arrays
						finalReply = oreply;
					} else {
						log.debug("Converting Sage Object Array into a Remote Object Reference Array.");
						// our reply should be an array of remote object references
						finalReply = createSageObjecRefArray(((Object[]) oreply));
					}
				} else {
					// standard objects/etc
				    if (isSerializable(oreply)) {
                        log.debug("Setting Serializable Reply: " + oreply);
						// serializiable stuff... ok with that.
						finalReply = oreply;
					} else {
					    log.debug("Converting Sage Object into a Remote Object Reference.");
						// non primitive / non serializable objects - convert to
						// object reference
						finalReply = createSageObjectRef(oreply);
					}
				}
			}

			if (finalReply!=null) {
			    log.debug("FinalReply: " + finalReply);
            }

			// send back the data
			response.setData(finalReply);
		} catch (Throwable t) {
			log.warn(String.format("----------- Sage Handling of a Remote Command Failed: %s ---------\n", request), t);
			response.setError(404, "Command Failed: " + (request != null ? request.getCommand() : ""), t);
		}
	}

    private void dumpArray(Object[] o) {
        log.debug("Begin Dumping Array");
        for (Object i: o) {
            log.debug("   " + i);
        }
        log.debug("End Dumping Array");
    }

    private Object[] convertRefArrayToSageArray(Object[] oo) {
	    if (oo==null) return null;
	    Object reply[] = new Object[oo.length];
	    for (int i=0;i<oo.length;i++) {
	        if (oo[i] instanceof RemoteRef)
	            reply[i] = convertRefToSageObject((RemoteRef) oo[i]);
	        else {
	            log.debug("ref arrays should have ref objects but this one has: " + oo[i]);
	            reply[i] = oo[i];
            }
        }
        return reply;
    }

    private Object getFirst(Object collection) {
	    if (collection==null) return null;
	    return Utility.GetElement(collection, 0);
    }

    private Object convertRefToSageObject(RemoteRef ref) {
        if (ref==null || ref.getType()==null) {
            return null;
        } else if ("airing".equals(ref.getType())) {
            return AiringAPI.GetAiringForID(Integer.parseInt(ref.getId()));
        } else if ("album".equals(ref.getType())) {
            return getFirst(Database.FilterByMethod(AlbumAPI.GetAlbums(), "GetAlbumName", ref.getId(), true));
        } else if ("channel".equals(ref.getType())) {
            return ChannelAPI.GetChannelForStationID(Integer.parseInt(ref.getId()));
        } else if ("favorite".equals(ref.getType())) {
            return FavoriteAPI.GetFavoriteForID(Integer.parseInt(ref.getId()));
        } else if ("mediafile".equals(ref.getType())) {
            return MediaFileAPI.GetMediaFileForID(Integer.parseInt(ref.getId()));
        } else if ("playlist".equals(ref.getType())) {
            return getFirst(Database.FilterByMethod(PlaylistAPI.GetPlaylists(), "GetName", ref.getId(), true));
        } else if ("plugin".equals(ref.getType())) {
            return PluginAPI.GetAvailablePluginForID(ref.getId());
        } else if ("series".equals(ref.getType())) {
            return SeriesInfoAPI.GetSeriesInfoForID(ref.getId());
        } else if ("show".equals(ref.getType())) {
            return ShowAPI.GetShowForExternalID(ref.getId());
        } else if ("systemmessage".equals(ref.getType())) {
            return getFirst(Database.FilterByMethod(SystemMessageAPI.GetSystemMessages(), "hashCode", Integer.parseInt(ref.getId()), true));
        } else if ("userrecord".equals(ref.getType())) {
            String parts[] = ref.getId().split(":");
            return UserRecordAPI.GetUserRecord(parts[0],parts[1]);
        } else if ("widget".equals(ref.getType())) {
            return WidgetAPI.FindWidgetBySymbol(ref.getId());
        } else {
            log.warn("Unknown Ref Object: " + ref);
        }
        return null;
    }

    private Object createSageObjecRefArray(Object[] oreply) {
	    if (oreply == null) return null;
        Object newArr[] = new Object[oreply.length];
        for (int i=0;i<oreply.length;i++) {
            newArr[i] = createSageObjectRef(oreply[i]);
        }
        return newArr;
    }

    private RemoteRef createSageObjectRef(Object in) {
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
            id= ((UserRecord)in).getStore() + ":" + ((UserRecord)in).getKey();
        } else if (in instanceof Widget) {
            type="widget";
            id= WidgetAPI.GetWidgetSymbol(in);
        } else if (in instanceof RemoteRef) {
	        log.warn("we were passed a remote ref as a sage object.  Likely a programmer error.",  new Exception("*************"));
            type=((RemoteRef) in).getType();
            id= ((RemoteRef) in).getId();

        } else {
	        log.warn("Unknown Object: " + in);
	        type="unknown";
	        id=in.getClass().getName();
        }

        return new RemoteRef(type, id);
    }

    protected boolean isSerializable(Object oreply) {
	    if (oreply==null) return false;
	    if (oreply.getClass().isPrimitive()
                || Serializable.class.isAssignableFrom(oreply.getClass())
                || oreply instanceof String
                ) {
	        return true;
	    }
	    return false;
	}
}
