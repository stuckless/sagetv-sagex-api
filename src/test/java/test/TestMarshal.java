package test;

import java.io.IOException;

import sagex.remote.MarshalUtils;
import sagex.remote.RemoteRequest;

public class TestMarshal {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		RemoteRequest rr = new RemoteRequest("test", new Object[] { "Sean", "Stuckless", true, false, 1.0f, 12l, 0, 2.0d });
		String s = MarshalUtils.marshal(rr);
		System.out.printf("------------- BEGIN (%s) -----------------\n", s.length());
		System.out.println(s);
		System.out.println("-------------  END  -----------------");
		RemoteRequest rr2 = (RemoteRequest) MarshalUtils.unmarshal(s);
		System.out.println("cmd: " + rr2.getCommand());
		for (int i = 0; i < rr2.getParameters().length; i++) {
			System.out.printf("arg[%s]: %s (type: %s)\n", i, rr2.getParameters()[i], rr2.getParameters()[i].getClass().getName());
		}
	}
}
