package sagex.remote.factory.request;

import org.junit.Test;
import sagex.SageAPI;
import sagex.remote.RemoteRequest;
import sagex.stub.StubSageAPI;
import sagex.util.LogProvider;

import static org.junit.Assert.*;

/**
 * Created by seans on 15/08/16.
 */
public class GlobalFactoryTest {
    @Test
    public void testFactory() {
        LogProvider.useSystemOut();
        StubSageAPI api = new StubSageAPI();
        api.addCall("GetOS","TESTOS");
        api.addCall("RunLibraryImportScan", Boolean.TRUE);
        SageAPI.setProvider(api);

        // bug... was throwing exception about required 1 arg
        RemoteRequest rr = GlobalFactory.createRequest(null, "GetOS", null);
        assertEquals("GetOS", rr.getCommand());
        assertNull(rr.getParameters());

        //
        rr = GlobalFactory.createRequest(null, "RunLibraryImportScan", new String[] {"true"});
        assertEquals("RunLibraryImportScan", rr.getCommand());
        assertNotNull(rr.getParameters());
        assertEquals(1,rr.getParameters().length);

    }
}