package sagex.remote.rmi;

import sagex.remote.RemoteRequest;
import sagex.remote.RemoteResponse;

public interface IRCPHandler {
	/**
	 * Handles an incomming RemoteRequest and dispatches it internally.
	 * 
	 * The Response will be returned in the RemoteReponse. No Exceptions should
	 * be thrown in the handling of the message. Any errors should be returned
	 * in the RemoteResponse object.
	 * 
	 * @param request
	 * @return
	 */
	public void handleRPCCall(RemoteRequest request, RemoteResponse response);
}
