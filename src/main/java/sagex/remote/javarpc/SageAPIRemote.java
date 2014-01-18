package sagex.remote.javarpc;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import sagex.ISageAPIProvider;
import sagex.remote.MarshalUtils;
import sagex.remote.RemoteRequest;
import sagex.remote.RemoteResponse;

public class SageAPIRemote implements ISageAPIProvider {
    private String rpcUrl = null;
    private String user = null;
    private char[] password = null;
    // SSL performance is much better if the socket factory is cached
    private SSLSocketFactory sf = null;
    
    public SageAPIRemote(String rpcUrl) {
        this.rpcUrl=rpcUrl;
    }

    public SageAPIRemote(String rpcUrl, String user, char[] password) {
        this.rpcUrl=rpcUrl;
        this.user = user;
        this.password = password;
        Authenticator.setDefault(new SageAPIRemoteAuthenticator());
    }

    public Object callService(String context, String name, Object[] args) throws Exception {
        // Create the url to the call
        Object replyData = null;
        String urlStr = rpcUrl;
        URL url = new URL(urlStr);
        URLConnection conn = url.openConnection();
        configureSSL(conn);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setUseCaches (false);
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

        StringBuilder dataBuf = new StringBuilder();
        String reqData = MarshalUtils.marshal(new RemoteRequest(context, name, args));
        dataBuf.append(JavaRPCHandler.CMD_ARG).append("=").append(java.net.URLEncoder.encode(reqData,MarshalUtils.ENCODING));
        conn.setRequestProperty("Content-Length", String.valueOf(dataBuf.length()));
            
        //System.out.println("Encoded Data: " + dataBuf.toString().replace('&', '\n'));
            
        DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
        wr.write(dataBuf.toString().getBytes());
        wr.flush();
        wr.close();

        HttpURLConnection c = (HttpURLConnection)conn;
        if (c.getResponseCode()!= 200) {
            System.out.printf("Http Error From Remote Server; Code %s: %s\n", c.getResponseCode(), c.getResponseMessage());
            throw new RuntimeException(String.format("Remote API Failed with error from server; Code: %s: %s", c.getResponseCode(), c.getResponseMessage() ));
        }
            
        System.out.printf("Http Server Response: %s: %s\n", c.getResponseCode(), c.getResponseMessage());
            
        BufferedReader r = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String data = r.readLine();
        if (data == null) {
            throw new Exception("Response was null... not good.");
        }
        r.close();
        RemoteResponse resp = (RemoteResponse) MarshalUtils.unmarshal(data);
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

    public String getServerUrl() {
        return rpcUrl;
    }

    public String toString() {
        return rpcUrl;
    }

    public Object callService(String name, Object[] args) throws Exception {
        return callService(null, name, args);
    }

    /**
     * If the connection is SSL, configure it to work with unsigned certificates and
     * certificates whose hostnames don't match.  More sophisticated handling can be
     * performed by getting server certificates, using local keystores, session context,
     * certificate chaining, etc.  But that's not really necessary for these purposes.
     * This is much simpler to code.
     */
    /* See these pages for examples:
     * http://dreamingthings.blogspot.com/2006/12/no-more-unable-to-find-valid.html
     * http://javasecurity.wikidot.com/example-item-1
     * http://www.java2s.com/Code/JavaAPI/javax.net.ssl/SSLSessiongetPeerCertificates.htm
     */
    private void configureSSL(URLConnection conn) throws Exception
    {
        if (conn instanceof HttpsURLConnection)
        {
            HttpsURLConnection httpsConn = (HttpsURLConnection) conn;

            if (sf == null)
            {
                SSLContext context = SSLContext.getInstance("SSL");
                context.init(null, new TrustManager[] {new RemoteSageAPITrustManager()}, null);
                sf = context.getSocketFactory();
            }
            httpsConn.setSSLSocketFactory(sf);
            httpsConn.setHostnameVerifier(new RemoteSageAPIHostnameVerifier());
        }
    }

    /**
     * Provide an authenticator to allow access to password-protected urls.
     */
    private class SageAPIRemoteAuthenticator extends Authenticator {

        protected PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication(SageAPIRemote.this.user, SageAPIRemote.this.password);
        }
    }

    /**
     * Create a custom hostname verifier to avoid SSL errors about the connection hostname not
     * matching the hostname on the certificate.
     */
    private static class RemoteSageAPIHostnameVerifier implements HostnameVerifier
    {
        public boolean verify(String s, SSLSession sslsession)
        {
            return true;
        }
    }

    /**
     * Always trust server SSL certificates
     */
    private static class RemoteSageAPITrustManager implements X509TrustManager
    {
        public void checkClientTrusted(X509Certificate[] ax509certificate, String s)
            throws CertificateException
        {
            throw new UnsupportedOperationException();
        }

        public void checkServerTrusted(X509Certificate[] ax509certificate, String s)
            throws CertificateException
        {
            return;        
        }

        public X509Certificate[] getAcceptedIssuers()
        {
            throw new UnsupportedOperationException();
        }
    }
}
