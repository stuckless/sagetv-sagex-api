package sagex.stub;

import sagex.ISageAPIProvider;

import java.util.HashMap;
import java.util.Map;

public class StubSageAPI implements ISageAPIProvider {
    private boolean debugCalls = false;
    private Map<String,Object> calls = new HashMap<String, Object>();
    private Map<String, StubAPIProxy> proxies = new HashMap<String, StubAPIProxy>();
    private MediaFileAPIProxy mediaFileProxy = null;
    private PropertiesStubAPIProxy props = null;
    private WidgetAPIProxy widgetAPI = null;
    
    public StubSageAPI() {
        defaultProxies();
        defaultMediaFileAPI();
        
        widgetAPI = new WidgetAPIProxy();
        widgetAPI.attach(this);
    }
    
    private void defaultProxies() {
        props = new PropertiesStubAPIProxy();
        props.attach(this);
    }
    
    private void defaultMediaFileAPI() {
        mediaFileProxy = new MediaFileAPIProxy();
        mediaFileProxy.attach(this);
    }

    public void addProxy(String cmd, StubAPIProxy proxy) {
        proxies.put(cmd, proxy);
    }

    public StubAPIProxy getProxy(String cmd) {
        return proxies.get(cmd);
    }
    
    public void addCall(String call, Object result) {
        calls.put(call, result);
    }
    
	public Object callService(String name, Object[] args) throws Exception {
	    if (debugCalls) {
    		System.out.printf("Calling: %s\n", name);
    		if (args != null) {
    			for (int i = 0; i < args.length; i++) {
    				System.out.printf("Arg[%d]: %s\n", i, args[i]);
    			}
    		}
	    }
        Object o = calls.get(name);
        if (o==null) {
            if (debugCalls) System.out.printf("provider.addCall(\"%s\",\"\"); // call %s not set\n", name, name);
        } else {
            return o;
        }

        StubAPIProxy proxy = proxies.get(name);
	    if (proxy!=null) {
	        return proxy.call(name, args);
	    } else {
            if (debugCalls) System.out.printf("provider.addProxy(\"%s\",StubAPIProxy); // proxy %s not set\n", name, name);
            return null;
	    }
	}

	public String toString() {
		return "stub://sage";
	}

	public Object callService(String context, String name, Object[] args) throws Exception {
		return callService(name, args);
	}

    public void setDebugCalls(boolean debugCalls) {
        this.debugCalls = debugCalls;
    }
    
    public void reset() {
        proxies.clear();
        calls.clear();
        defaultProxies();
        defaultMediaFileAPI();
    }

    public boolean isDebugEnabled() {
        return debugCalls;
    }
    
    public WidgetAPIProxy getWidgetAPIProxy() {
        return widgetAPI;
    }
}
