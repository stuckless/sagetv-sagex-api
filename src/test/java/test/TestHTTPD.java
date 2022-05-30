package test;

import org.eclipse.jetty.server.Server;
//import org.mortbay.jetty.servlet.Context;
//import org.mortbay.jetty.servlet.ServletHolder;

import sagex.remote.SagexServlet;

public class TestHTTPD {
	public static void main(String args[]) throws Exception {
		Server server = new Server(9999);
		//Context root = new Context(server,"/",Context.SESSIONS);
		//root.addServlet(new ServletHolder(new SagexServlet()), "/sagex/*");
		server.start();
	}
}
