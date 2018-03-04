package sagex.remote.rmi;

import sagex.remote.RemoteRequest;
import sagex.remote.RemoteResponse;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SageRemoteCommand extends Remote {
	public RemoteResponse executeCommand(RemoteRequest req) throws RemoteException;
}
