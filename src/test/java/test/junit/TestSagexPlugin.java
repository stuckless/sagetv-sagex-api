package test.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import sage.SageTVPlugin;
import sage.SageTVPluginRegistry;
import sagex.SageAPI;
import sagex.plugin.AbstractPlugin;
import sagex.plugin.ConfigValueChangeHandler;
import sagex.plugin.PluginProperty;
import sagex.plugin.SageEvent;
import sagex.stub.StubSageAPI;

public class TestSagexPlugin {
    private class MyPlugin extends AbstractPlugin {
        public int onSomethingHandled = 0;
        public int enabledChangedCount = 0;

        public MyPlugin(SageTVPluginRegistry registry) {
            super(registry);

            addProperty(new PluginProperty(SageTVPlugin.CONFIG_INTEGER, "test/sagex/port", "8800", "Port", "Server's Port", null));
            addProperty(new PluginProperty(SageTVPlugin.CONFIG_BOOL, "test/sagex/enabled", "true", "Enabled", "Is the server enabled", null));
            addProperty(new PluginProperty(SageTVPlugin.CONFIG_CHOICE, "test/sagex/choice", "ONE;TWO", "Sample Choice", null, new String[] { "ONE", "TWO", "THREE" }));
        }

        @SageEvent("onSomething")
        public void handleOnSomething1() {
            System.out.println("On Something Called");
            onSomethingHandled++;
        }

        @SageEvent("onSomething")
        public void handleOnSomething2(String name, Map args) {
            System.out.println("On Something Called with args");
            onSomethingHandled++;
        }

        @SageEvent("onSomething")
        public void handleOnSomething3(String name) {
            System.out.println("On Something Called with name: " + name);
            onSomethingHandled++;
        }

        @SageEvent("onSomething")
        public void handleOnSomething4(Map args) {
            System.out.println("On Something Called with map");
            onSomethingHandled++;
        }

        @SageEvent(value="onBackground", background=true)
        public void handleOnSomething5(Map args) {
            System.out.println("On background called, sleeping for 5 seconds");
            System.out.println("ThreadName:  " + Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("ThreadName:  " + Thread.currentThread().getName() + "; done");
        }
        
        @ConfigValueChangeHandler("test/sagex/enabled")
        public void handleConfigChanged(String setting) {
            enabledChangedCount++;
        }
    }
    
    @BeforeClass
    public static void setup() {
        SageAPI.setProvider(new StubSageAPI());
    }

    @Test
    public void testPlugin() {
        MyPlugin p = new MyPlugin(null);
        p.setConfigValue("test/sagex/port", "8000");
        assertEquals("8000", p.getConfigValue("test/sagex/port"));

        assertEquals(0, p.enabledChangedCount);
        p.setConfigValue("test/sagex/enabled", "true");
        assertEquals("propety changed called when value didn't change", 0, p.enabledChangedCount);

        p.setConfigValue("test/sagex/enabled", "false");
        assertEquals("false", p.getConfigValue("test/sagex/enabled"));
        assertEquals(1, p.enabledChangedCount);

        // do it again...
        p.setConfigValue("test/sagex/enabled", "false");
        assertEquals("false", p.getConfigValue("test/sagex/enabled"));
        assertEquals("Property Changed was called when value didn't change", 1, p.enabledChangedCount);

        assertEquals("ONE;TWO", p.getConfigValue("test/sagex/choice"));
        p.setConfigValues("test/sagex/choice", new String[] { "ONE", "THREE" });
        assertEquals("ONE;THREE", p.getConfigValue("test/sagex/choice"));

        p.sageEvent("onSomething", new HashMap());
        assertEquals("Event should have been called twice", 4, p.onSomethingHandled);

        p.sageEvent("NotHandled", null);
        
        long l = System.currentTimeMillis(); 
        p.sageEvent("onBackground", new HashMap());
        long l2 = System.currentTimeMillis();
        if (l2-l > 1000) {
        	fail("Background task did not run in the background");
        }
        System.out.println("Test Complete");
    }
}
