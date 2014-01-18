package test;

import java.io.Serializable;

public class TestSageRemoteAPI {
	public static void main(String args[]) {
		printObject("Sean");
		printObject(new int[4]);
		printObject(new String[] { "Sean", "Stuckless" });
	}

	private static void printObject(Object o) {
		System.out.println("Object Class Name: " + o.getClass().getName());
		System.out.println("Object Class isPrimitive(): " + o.getClass().isPrimitive());
		System.out.println("Object Class isArray(): " + o.getClass().isArray());
		System.out.println("Object hashCode: " + o.hashCode());
		if (o.getClass().isArray()) {
			System.out.println("Object Array Member isPrimitive(): " + o.getClass().getComponentType().isPrimitive());
			System.out.println("Object Array Member Serializable: " + Serializable.class.isAssignableFrom(o.getClass().getComponentType()));
		}
		System.out.println("\n");
	}
}
