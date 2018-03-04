package sagex.remote.server;

import sagex.util.ILog;
import sagex.util.LogProvider;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

public class SimpleDatagramClient {
    private ILog log = LogProvider.getLogger(SimpleDatagramClient.class);
    
	public SimpleDatagramClient() {
	}

	public void send(final String msg, final String server, final int port, final DatagramPacketHandler listener, final long timeout) throws Exception {
        final MulticastSocket socket=new MulticastSocket();
		Runnable client = new Runnable() {
			public void run() {
				try {
				    log.info("Starting Datagram Client on " + server + ":" + port);
					InetAddress group = InetAddress.getByName(server);
					socket.joinGroup(group);

					byte buf[] = msg.getBytes();
					DatagramPacket packet = new DatagramPacket(buf, buf.length, group, port);

					socket.send(packet);

					// get response
					while (true) {
    					buf = new byte[1024];
    					packet = new DatagramPacket(buf, buf.length);
    					socket.receive(packet);
    
    					// display response
    					listener.onDatagramPacketReceived(packet);
    					
    					if (timeout==0) {
    					    // basically do it once
    					    break;
    					}
					}
				} catch (SocketException se) {
				    log.warn("Shutting Down: " + se.getMessage());
				} catch (Throwable t) {
					listener.onFailure(t);
				} finally {
				    log.info("Datagram Client is shutting down");
					socket.close();
				}
			}
		};
		
		if (timeout<=0) {
			// no timeout, just do it
			client.run();
		} else {
			// start the connection in a thread and then wait for a reply
			final Thread t = new Thread(client);
			t.start();

            final Timer timer = new Timer(true);
			// kill this thread after the timeout
			TimerTask tt = new TimerTask() {
                @Override
                public void run() {
                    log.info("Killing Datagram client after timeout");
                    socket.close();
                }
            };
            
			timer.schedule(tt, timeout);
		}
	}

	/**
	 * @deprecated use discoverRemoteServers
	 * 
	 * @param timeout
	 * @return
	 * @throws Exception
	 */
	@Deprecated
	public static Properties findRemoteServer(final long timeout) throws Exception {
		final Properties props = new Properties();
		SimpleDatagramClient client = new SimpleDatagramClient();
		client.send("Discover SageTV Remote API Server", DatagramServer.MULTICAST_GROUP, DatagramServer.MULTICAST_PORT, new DatagramPacketHandler() {
			public void onDatagramPacketReceived(DatagramPacket packet) {
				ByteArrayInputStream bais = new ByteArrayInputStream(packet.getData());
				try {
					props.load(bais);
				} catch (IOException e) {
					onFailure(e);
				}
			}

			public void onFailure(Throwable t) {
				throw new RuntimeException(t);
			}
		}, timeout);
		
		return props;
	}
}
