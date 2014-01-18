package sagex.remote.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import sagex.remote.RemoteRequest;
import sagex.remote.RemoteResponse;

public interface SageRemoteCommand extends Remote {
	public RemoteResponse executeCommand(RemoteRequest req) throws RemoteException;
}
