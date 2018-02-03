package test.junit;

import junit.framework.TestCase;
import sagex.ISageAPIProvider;
import sagex.SageAPI;
import sagex.stub.NullSageAPIProvider;

public class TestAPIDiscovery extends TestCase {
    public void testDiscovery() {
        // for a bad provider that we cannot locate
        SageAPI.initialize();
        System.setProperty("sagex.SageAPI.remoteUrl", "rmi://192.168.1.121:9088");
        ISageAPIProvider prov = SageAPI.getProvider();
        assertNotNull(prov);
        assertTrue(prov instanceof NullSageAPIProvider);
    }
}
