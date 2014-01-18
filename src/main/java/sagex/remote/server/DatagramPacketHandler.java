package sagex.remote.server;

import java.net.DatagramPacket;

public interface DatagramPacketHandler {
	public void onDatagramPacketReceived(DatagramPacket packet);
	public void onFailure(Throwable t);
}
