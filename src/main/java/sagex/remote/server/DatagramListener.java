package sagex.remote.server;

import java.net.DatagramPacket;

public interface DatagramListener {
	public void serverStarted(DatagramServer server);

	public void serverStopped(DatagramServer server);

	public byte[] onDatagramPacketReceived(DatagramPacket packet);

}
