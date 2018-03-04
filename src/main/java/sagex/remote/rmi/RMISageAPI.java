package sagex.remote.rmi;

import sagex.ISageAPIProvider;
import sagex.remote.RemoteRequest;
import sagex.remote.RemoteResponse;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMISageAPI implements ISageAPIProvider {
    private String host;
    private int    port;

    protected RMISageAPI() {
    }

    public RMISageAPI(String host) {
        this(host, 1098);
    }
    public RMISageAPI(String host, int port) {
        this.host = host;
        this.port = port;
        
        try {
            callService("GetOS", null);
        } catch (Throwable t) {
            System.out.println("Remote SageAPI is not functional.  Can't use server: " + toString());
            throw new RuntimeException("Remote SageAPI is not functional.  Can't use server: " + toString(), t);
        }
    }

    public Object callService(String context, String name, Object[] args) throws Exception {
        RemoteRequest req = new RemoteRequest(context, name, args);
        Object replyData = null;
        Registry registry = LocateRegistry.getRegistry(host, port);
        SageRemoteCommand server = (SageRemoteCommand) registry.lookup(SageRMIServer.SERVER_BINDING);
        RemoteResponse resp = server.executeCommand(req);
        if (resp.hasError()) {
            System.out.println("Got an Error from the remote side: " + resp.getErrorCode() + "; " + resp.getErrorMessage());
            System.out.println("========== Remote Stack Dump ===========");
            System.out.println(resp.getException());
            throw new Exception(resp.getErrorMessage());
        }

        // now check from remote object references... specificlly array
        // ones, and turn those into real arrays...
        replyData = resp.getData();
        return replyData;
    }

    public Object callService(String name, Object[] args) throws Exception {
        return callService(null, name, args);
    }

    public String toString() {
        return String.format("rmi://%s:%s", host, port);
    }
}
