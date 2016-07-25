package test.junit;

import java.io.File;

import junit.framework.TestCase;
import sagex.SageAPI;
import sagex.api.MediaFileAPI;
import sagex.remote.api.ServiceFactory;
import sagex.stub.StubSageAPI;
import sagex.util.LogProvider;

public class TestSagexServices extends TestCase {
    public TestSagexServices() {
    }

    public TestSagexServices(String name) {
        super(name);
    }
    
    public void testServices() throws Exception {
        LogProvider.useSystemOut();
        StubSageAPI api = new StubSageAPI();
        SageAPI.setProvider(api);
        
        ServiceFactory sf = new ServiceFactory();
        assertEquals("Sean",sf.callService(null, "sagex", "Echo", new String[] {"Sean"}));
        
        assertNull(sf.callService(null, "sagex", "GetUIContext", null));
        
        assertEquals("XXXYYYXXX",sf.callService("XXXYYYXXX", "sagex", "GetUIContext", null));
        SageAPI.setUIContext(null);
        api.addCall("GetOS", "MyOS");
        assertEquals("MyOS", sf.callService(null, "sagex", "TestSageAPI1", null));
        assertEquals("MyOS", sf.callService(null, "sagex", "TestSageAPI2", new String[] {"GetOS"}));
        
        Object mf = MediaFileAPI.AddMediaFile(new File("/tmp/Movie.avi"), "/tmp");
        int mfid = MediaFileAPI.GetMediaFileID(mf);
        String title = MediaFileAPI.GetMediaTitle(mf);
        assertEquals(title, sf.callService(null, "sagex", "GetMediaFileTitle", new String[] {"mediafile:" + mfid}));
    }

}
