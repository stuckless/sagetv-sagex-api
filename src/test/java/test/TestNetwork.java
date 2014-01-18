package test;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class TestNetwork {
	public static void main(String args[]) throws Exception {
		Enumeration netInterfaces = NetworkInterface.getNetworkInterfaces();
		while (netInterfaces.hasMoreElements()) {
			NetworkInterface ni = (NetworkInterface) netInterfaces.nextElement();
			System.out.println(ni.getName());
			InetAddress ip = (InetAddress) ni.getInetAddresses().nextElement();
			if (!ip.isSiteLocalAddress() && !ip.isLoopbackAddress()) {
				System.out.println("Interface " + ni.getName() + " seems to be InternetInterface. I'll take it...");
				System.out.println("IP: " + ip.getHostAddress());
			}
		}

		InetAddress in = InetAddress.getLocalHost();
		InetAddress[] all = InetAddress.getAllByName(in.getHostName());
		for (int i = 0; i < all.length; i++) {
			System.out.println("  address = " + all[i]);
		}

	}
}
