package sagex.remote;

import java.io.Serializable;

/**
 * Wrapper class the wraps a remote object instance on the server. The id that
 * is provided should be unique across all objects on the server, the the server
 * must be able to resolve the object reference from the id that is stored.
 * 
 * All remote api calls that return a sage object will actually return an object
 * reference.
 * 
 * @author seans
 * 
 */
public class RemoteObjectRef implements Serializable {
	private static final long serialVersionUID = 2L;
	private String id;
	private int index = -1;
	private transient Object[] objectArray;

	/**
	 * created a standard remote object reference
	 */
	public RemoteObjectRef() {
		this.id = String.valueOf(hashCode());
	}

	/**
	 * creates a array remote object reference
	 * 
	 * @param arrayLen
	 */
	public RemoteObjectRef(Object[] array) {
		this.id = String.valueOf(hashCode());
		this.objectArray = array;
	}

	/**
	 * creates an array item remote object reference
	 * 
	 * @param r
	 *            parent object array reference
	 * @param index
	 *            index of this item in the parent object array reference
	 */
	public RemoteObjectRef(RemoteObjectRef r, int index) {
		this.id = r.getId();
		this.index = index;
	}
	
	/**
	 * Creates a remote object reference to a remote array item
	 * 
	 * @param id
	 * @param index
	 */
	public RemoteObjectRef(String id, int index) {
		this.id = id;
		this.index = index;
	}

	/**
	 * Create a remote object reference to a remote object
	 * @param id
	 */
	public RemoteObjectRef(String id) {
		this.id=id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIndex() {
		return index;
	}

	public String toString() {
		String v;
		if (index != -1) {
			v = getId() + ":" + getIndex();
		} else {
			v = getId();
		}
		return "RemoteObjectRef[" + v + "];";
	}

	/**
	 * Returns a RemoteObjectReference  array, if this object was instanciated using an object array;
	 * @return
	 */
	public RemoteObjectRef[] getRemoteObjectReferenceArray() {
		RemoteObjectRef[] arr = new RemoteObjectRef[objectArray.length];
		for (int i=0;i<arr.length;i++) {
			arr[i] = new RemoteObjectRef(this, i);
		}
		return arr;
	}
}
