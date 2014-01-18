package sagex.remote.xmlrpc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sagex.remote.AbstractRPCHandler;
import sagex.remote.RemoteRequest;
import sagex.remote.RemoteResponse;
import sagex.remote.SagexServlet.SageHandler;
import sagex.remote.api.ApiHandler;
import sagex.remote.factory.request.SageRPCRequestFactory;

/**
 * Handles a XML RPC Request and Returns back an xml response
 * 
 * @author seans
 * @deprecated - no longer supported - use {@link ApiHandler}
 */
public class XMLRPCHandler extends AbstractRPCHandler implements SageHandler {
	public static final String SAGE_RPC_PATH = "rpcXml";

	public XMLRPCHandler() {
		super();
		log.info("Sage Xml RPC Servlet Created.");
	}
	
	public void handleRequest(String args[], HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 0 - null
		// 1 - rcpXml
		// 2 - api
		// 3 - command
		// 4+ - args

		if (args.length<3) {
			throw new ServletException("xmlRpc missing Api!");
		}
		
		// xml rpc commands come in the form
		// /API/Command/Arg1/Arg2/Arg3/context:123
		// or
		// /API/Command?1=Arg1&2=Arg2&3=Arg3&context=123
		String context = req.getParameter("context");
		List<String> argsList = new ArrayList<String>();
		String command = req.getParameter("command");
		if (args.length > 4) {
			// extra args or context
			for (int i = 4; i < args.length; i++) {
				if (args[i].startsWith("context")) {
					String cargs[] = args[i].split(":");
					context = cargs[1];
				} else {
					argsList.add(args[i]);
				}
			}
		} else {
			// process reqular args
			for (int i = 1; i < 99; i++) {
				String v = req.getParameter(String.valueOf(i));
				if (v == null)
					break;
				argsList.add(v);
			}
		}

		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/xml");
		pw.print(handleRPCCall(args[2], (command==null) ? args[3] : command, context, argsList.toArray(new String[argsList.size()])));
		pw.flush();
	}
	
	
	public String handleRPCCall(String api, String command, String context, String args[]) {
		RemoteResponse response = new RemoteResponse();
		try {
			// decode the string parameters and convert them to a real request
			RemoteRequest request = SageRPCRequestFactory.createRequest(context, api, command, args);

			// handle the call
			handleRPCCall(request, response);

			// serialize the remoteresponse into xml for the reply.
			return XmlEncoderHelper.createXmlResponse(api, command, request, response);
		} catch (Throwable t) {
			response.setError(501, "Xml RPC Failed!", t);
			return XmlEncoderHelper.createXmlResponse(api, command, null, response);
		}
	}
}
