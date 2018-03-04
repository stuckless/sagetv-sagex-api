package sagex.remote.rmi;

import sagex.remote.RemoteRequest;
import sagex.remote.RemoteResponse;
import sagex.util.ILog;
import sagex.util.LogProvider;

import java.io.Serializable;

/**
 * This is the class that will handle all the RMI transaction on the server, but it needs to be serializable
 * since it will be sent to the client as well.
 * @author seans
 *
 */
public class SageRemoteCommandImpl implements SageRemoteCommand, Serializable {
    private static final long serialVersionUID = 7L;

    private transient ILog         log   = LogProvider.getLogger(SageRemoteCommandImpl.class);
    
    // this is the RMI Handler
    private transient RMIRPCHandler handler  = new RMIRPCHandler();

    private static SageRemoteCommandImpl instance = new SageRemoteCommandImpl();
    
    public static SageRemoteCommandImpl getInstance() {
        return instance;
    }
    
    public SageRemoteCommandImpl() {
    }
    
    public RemoteResponse executeCommand(RemoteRequest request) {
        log.info("Processing Request: " + request.getCommand());
        RemoteResponse response = new RemoteResponse();
        handler.handleRPCCall(request, response);
        return response;
    }
}
