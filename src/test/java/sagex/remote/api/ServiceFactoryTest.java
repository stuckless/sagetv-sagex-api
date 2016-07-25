package sagex.remote.api;

import org.junit.Test;
import sagex.SageAPI;
import sagex.stub.StubSageAPI;
import sagex.util.LogProvider;
import sagex.util.SystemUtil;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by seans on 24/07/16.
 */
public class ServiceFactoryTest {
    @Test
    public void callService() throws Exception {
        LogProvider.useSystemOut();
        StubSageAPI api = new StubSageAPI();
        api.addCall("GetOS","TESTOS");
        SageAPI.setProvider(api);

        ServiceFactory sf = new ServiceFactory(new File("src/test/resources/sagex/services/"));

        // test using the OLD way of using Packages
        String result = (String) sf.callService(null, "testjs","getOS_OLD1",null);
        assertEquals("TESTOS", result);

        // test using the OLD way where you relied on the global var to be defined
        result = (String) sf.callService(null, "testjs","getOS_OLD2",null);
        assertEquals("TESTOS", result);

        // tests the newer Java 8 way of using Java.type()
        System.out.println("IS JAVA 8 or NEWER: " + SystemUtil.isJava8OrGreater());
        if (SystemUtil.isJava8OrGreater()) {
            // test the new Java 8 way
            result = (String) sf.callService(null, "testjs","getOS_JAVA8",null);
            assertEquals("TESTOS", result);
            System.out.println("PASSED: JAVA8 test");
        }

    }
}