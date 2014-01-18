package sagex.remote.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class DatagramServer {
	public static final String MULTICAST_GROUP = "228.5.6.7";
	public static final int MULTICAST_PORT = 9998;

	private int port = 9998;
	private MulticastSocket socket;
	private boolean running = false;
	private DatagramListener listener = null;
	private String server = null;

	public DatagramServer(String server, int port, DatagramListener listener) {
		this.server = server;
		this.port = port;
		this.listener = listener;
	}

	public void startServer() throws Exception {
		socket = new MulticastSocket(port);
		socket.joinGroup(InetAddress.getByName(server));

		Runnable r = new Runnable() {
			public void run() {
				running = true;
				byte buf[] = new byte[256];
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				while (running) {
					// listen for request
					try {
						socket.receive(packet);

						// handle request
						if (listener != null) {
							byte[] reply = listener.onDatagramPacketReceived(packet);
							if (reply!=null) {
    							packet = new DatagramPacket(reply, reply.length, packet.getAddress(), packet.getPort());
    							socket.send(packet);
							}
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		};

		Thread t = new Thread(r);
		t.start();

		if (listener != null)
			listener.serverStarted(this);
	}

	public void stopServer() {
		running = false;
		try {
			socket.leaveGroup(InetAddress.getByName(server));
			socket.close();
		} catch (Throwable t) {
			t.printStackTrace();
		}
		if (listener != null)
			listener.serverStopped(this);
	}
}
