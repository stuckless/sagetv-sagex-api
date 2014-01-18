package test;

import java.io.File;

import sagex.remote.xmlrpc.RequestHelper;

public class TestTypedHelper {
	public static void main(String args[]) {
		String sargs[] = new String[] { "12", "Sean", "1000000", "200000:99" };

		Object params[] = RequestHelper.createParameters(sargs, int.class, String.class, File.class, File.class);

		for (Object o : params) {
			System.out.println("Arg: " + o + "; Type: " + o.getClass().getName());
		}
	}
}
