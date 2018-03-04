package sagex.remote;

import sagex.SageAPI;
import sagex.api.Utility;
import sagex.remote.rmi.IRCPHandler;
import sagex.util.ILog;
import sagex.util.LogProvider;
import sagex.util.RemoteRef;
import sagex.util.TypesUtil;

import java.io.Serializable;
import java.util.Vector;

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
        return TypesUtil.toSageObject(ref);
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
	    return TypesUtil.toSageObjectRef(in);
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
