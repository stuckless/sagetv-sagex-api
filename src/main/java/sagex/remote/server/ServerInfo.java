package sagex.remote.server;

import java.io.Serializable;

public class ServerInfo implements Serializable {
	private static final long serialVersionUID = 3L;
	
    private String url;
    private String host;
    private int port;

    public ServerInfo() {
	}

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ServerInfo [host=" + host + ", port=" + port + ", url=" + url + "]";
    }
}
