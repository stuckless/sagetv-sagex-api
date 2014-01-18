package test.junit;

import junit.framework.TestCase;
import sagex.SageAPI;
import sagex.api.Configuration;
import sagex.stub.StubSageAPI;

public class TestStubAPI extends TestCase {

    public TestStubAPI() {
        super();
    }

    public TestStubAPI(String name) {
        super(name);
    }
    
    public void testStubAPIProxy() {
       StubSageAPI api = new StubSageAPI();
       SageAPI.setProvider(api);
       assertEquals("get default value", "test", Configuration.GetProperty("myprop", "test"));
       assertEquals("get existing value", "test", Configuration.GetProperty("myprop", "test2"));
       assertEquals("get server value", "test", Configuration.GetServerProperty("myprop", "test2"));

       Configuration.SetProperty("myprop", "test5");
       assertEquals("set new value", "test5", Configuration.GetProperty("myprop", "test"));
    }

}
