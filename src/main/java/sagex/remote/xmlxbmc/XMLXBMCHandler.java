package sagex.remote.xmlxbmc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sagex.SageAPI;
import sagex.remote.AbstractRPCHandler;
import sagex.remote.RemoteObjectRef;
import sagex.remote.RemoteRequest;
import sagex.remote.RemoteResponse;
import sagex.remote.SagexServlet.SageHandler;
import sagex.remote.api.ApiHandler;
import sagex.remote.factory.request.SageRPCRequestFactory;

/**
 * Handles a XML RPC Request and Returns back an xml response specifically for the XBMC needs
 * 
 * @author seans
 * @deprecated - no longer supported - use {@link ApiHandler}
 */
public class XMLXBMCHandler extends AbstractRPCHandler implements SageHandler {
	public static final String SAGE_RPC_PATH = "rpcXbmc";

	public XMLXBMCHandler() {
		super();
		log.info("Sage Xbox Xml RPC Servlet Created.");
	}
	
	public void handleRequest(String args[], HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 0 - null
		// 1 - rcpXbmc
		// 2 - api
		// 3 - command
		// 4+ - args

		if (args.length<3) {
			throw new ServletException("xmlXbmc missing Api!");
		}
		
		// xml rpc commands come in the form
		// /API/Command/Arg1/Arg2/Arg3/context:123
		// or
		// /API/Command?1=Arg1&2=Arg2&3=Arg3&context=123
		// There are 4 special arguments context/sortby/reverse/maxlen which pass in meta data
		// There are 4 object arguments also which mean the info must be turned into a sage object to be passed
		//  these are channel/airing/mediafile/show
		String context = req.getParameter("context");
		String sortby  = "";
		boolean reverse = false;
		int    maxlen  = 999999;
		List<String> argsList = new ArrayList<String>();
		String command = req.getParameter("command");
		if (args.length > 4) {
			// extra args or context
			for (int i = 4; i < args.length; i++) {
				if (args[i].startsWith("context")) {
					String cargs[] = args[i].split(":");
					context = cargs[1];
				} else if (args[i].startsWith("sortby")) {
					String cargs[] = args[i].split(":");
					sortby = cargs[1];
				} else if (args[i].startsWith("reverse")) {
					String cargs[] = args[i].split(":");
					if (cargs[1].equals("true")) {
					    reverse = true;
					}
				} else if (args[i].startsWith("maxlen")) {
					String cargs[] = args[i].split(":");
					maxlen = Integer.parseInt(cargs[1]);
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
		pw.print(handleRPCCall(args[2], (command==null) ? args[3] : command, context, argsList.toArray(new String[argsList.size()]), sortby, maxlen, reverse));
		pw.flush();
	}
	
	
	public String handleRPCCall(String api, String command, String context, String args[], String sortby, int maxlen, boolean reverse) {
		RemoteResponse response = new RemoteResponse();
		try {
			// decode the string parameters and convert them to a real request
			RemoteRequest request = SageRPCRequestFactory.createRequest(context, api, command, args);

			// handle the call
			handleRPCCall(request, response);

			// serialize the remoteresponse into xml for the reply.
			return XmlEncoderHelper.createXmlResponse(api, command, request, response, sortby, maxlen, reverse);
		} catch (Throwable t) {
			response.setError(501, "Xml RPC Failed!", t);
			return XmlEncoderHelper.createXmlResponse(api, command, null, response, sortby, maxlen, reverse);
		}
	}
	
	public void handleRPCCall(RemoteRequest request, RemoteResponse response) {
		try {
			// convert object references in the request into real sage references...
			Object oArr[] = request.getParameters();
			if (oArr != null && oArr.length > 0) {
				for (int i = 0; i < oArr.length; i++) {
					Object o = oArr[i];
					if (o==null) continue;
					if (o.getClass().isArray() && RemoteObjectRef.class.isAssignableFrom(o.getClass().getComponentType())) {
						System.out.println("Converting Remote Object Reference Array into a Sage Array.");
						// check if the incomming object parameter is an array of RemoteObjectReferences
						// if so, then convert the array, into a real array
						Object oo[] = (Object[])o;
						if (oo.length>0) {
							// arrays are stored under the same ref id as each of the children
							oArr[i] = getReference((RemoteObjectRef) oo[0]);
						} else {
							// empty object array;
							oArr[i] = new Object[0];
						}
					} else if (o instanceof RemoteObjectRef) {
						System.out.println("Converting Remote Object Reference into a Sage Reference.");
						RemoteObjectRef ref = (RemoteObjectRef) o;
						// replace this reference with the real thing...
						Object oref = getReference(ref);
						// if out reference in an array, then we need to get the
						// indexed element and not the array.
						if (oref.getClass().isArray() && ref.getIndex()!=-1) {
							oArr[i] = ((Object[]) oref)[ref.getIndex()];
						} else {
							oArr[i] = oref;
						}
					}
				}
			}

			// invoke the server
			Object oreply = null;
			if (request.getContext() != null) {
				oreply = SageAPI.call(request.getContext(), request.getCommand(), request.getParameters());
			} else {
				oreply = SageAPI.call(request.getCommand(), request.getParameters());
			}

			// send back the data
			response.setData(oreply);
		} catch (Throwable t) {
			System.out.printf("----------- Sage Handling of a Remote Command Failed: %s ---------\n", request);
			t.printStackTrace(System.out);
			response.setError(404, "Command Failed: " + (request != null ? request.getCommand() : ""), t);
		}
	}


}
