package sagex.remote.javarpc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sagex.remote.AbstractRPCHandler;
import sagex.remote.MarshalUtils;
import sagex.remote.RemoteRequest;
import sagex.remote.RemoteResponse;
import sagex.remote.SagexServlet.SageHandler;
import sagex.remote.rmi.RMIRPCHandler;

/**
 * @deprecated use {@link RMIRPCHandler}
 * @author sean
 *
 */
public class JavaRPCHandler extends AbstractRPCHandler implements SageHandler {
	public static final String SAGE_RPC_PATH = "rpcJava";
	public static final String CMD_ARG = "request";

	public JavaRPCHandler() {
		super();
		log.info("Sage Java RPC Servlet Created.");
	}

	public void handleRequest(String args[], HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String payload = req.getParameter(CMD_ARG);
		resp.setContentType("text/plain");
		PrintWriter pw = resp.getWriter();
		pw.print(handleRPCCall(payload));
		pw.flush();
	}

	public String handleRPCCall(String payload) {
		RemoteResponse response = new RemoteResponse();
		if (payload == null) {
			response.setError(500, "Request did not contain a RPC Call.", new Exception("Missing Payload"));
		} else {
			try {
				RemoteRequest request = (RemoteRequest) MarshalUtils.unmarshal(payload);
				handleRPCCall(request, response);
			} catch (Exception e) {
				response.setError(500, "Failed to process the RPC Call!", e);
			}
		}

		try {
			return MarshalUtils.marshal(response);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
