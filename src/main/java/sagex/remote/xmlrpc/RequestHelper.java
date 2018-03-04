package sagex.remote.xmlrpc;

import sagex.remote.RemoteRequest;
import sagex.util.TypesUtil;

import java.io.File;

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

		    System.out.println("sagex Request Helper: Unhandled object in parameters: " + str);
		}
		return null;
	}
	
	public static Object makeSageObject(String str) {
	    return TypesUtil.toSageObject(str);
	}
}
