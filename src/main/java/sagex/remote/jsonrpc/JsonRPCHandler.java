package sagex.remote.jsonrpc;

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
 * Handles a JSON RPC Request and Returns back an json response
 * 
 * @author seans
 * @deprecated - no longer supported - use {@link ApiHandler}
 */
public class JsonRPCHandler extends AbstractRPCHandler implements SageHandler {
	public static final String SAGE_RPC_PATH = "rpcJson";

	public JsonRPCHandler() {
		super();
		log.info("Sage Json RPC Servlet Created.");
	}
	
	@Override
	public void handleRequest(String args[], HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 0 - null
		// 1 - rcpJson
		// 2 - api
		// 3 - command
		// 4+ - args

		if (args.length<3) {
			throw new ServletException("jsonRpc missing Api!");
		}
		
		// json rpc commands come in the form
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
		
		boolean useJSONP = true;
		String jsonCallback = req.getParameter("jsoncallback");
		if (jsonCallback==null || jsonCallback.trim().length()==0) {
			useJSONP=false;
		}

		PrintWriter pw = resp.getWriter();
		resp.setContentType("application/json");
		if (useJSONP) {
			pw.print(jsonCallback);
			pw.print("(");
		}
		pw.print(handleRPCCall(args[2], (command==null) ? args[3] : command, context, argsList.toArray(new String[argsList.size()])));
		if (useJSONP) {
			pw.print(")");
		}
		pw.flush();
	}
	
	
	public String handleRPCCall(String api, String command, String context, String args[]) {
		RemoteResponse response = new RemoteResponse();
		try {
			// decode the string parameters and convert them to a real request
			RemoteRequest request = SageRPCRequestFactory.createRequest(context, api, command, args);

			// handle the call
			handleRPCCall(request, response);

			// serialize the remoteresponse into json for the reply.
			return JsonEncoderHelper.createJsonResponse(api, command, request, response);
		} catch (Throwable t) {
			response.setError(501, "Json RPC Failed!", t);
			return JsonEncoderHelper.createJsonResponse(api, command, null, response);
		}
	}
}
