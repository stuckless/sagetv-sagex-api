package sagex.stub;

import java.util.HashMap;
import java.util.Map;

public class PropertiesStubAPIProxy implements StubAPIProxy {
    private boolean debug = false;
    private Map<Object, Object> props = new HashMap<Object, Object>();
    
    public Object call(String cmd, Object[] args) {
        if ("GetProperty".equals(cmd) || "GetServerProperty".equals(cmd)) {
            Object prop = props.get(args[0]);
            if (prop==null) {
                prop=args[1];
                props.put(args[0], prop);
            }
            if (debug) System.out.printf("GetProperty: %s; Value: %s\n", args[0], prop);
            return prop;
        }
        
        if ("SetProperty".equals(cmd) || "SetServerProperty".equals(cmd)) {
            props.put(args[0], args[1]);
            if (debug) System.out.printf("SetProperty: %s; Value: %s\n", args[0], args[1]);
            return null;
        }
        
        if ("AddGlobalContext".equals(cmd) || "AddStaticContext".equals(cmd)) {
            props.put(args[0], args[1]);
            if (debug) System.out.printf("Add Global/Static Context: %s; Value: %s\n", args[0], args[1]);
            return null;
        }
        
        System.out.println("PropertiesStubAPIProxy: Not Handled: " + cmd);
        return null;
    }
    
    public Map<Object, Object> getProperties() {
        return props;
    }
    
    public void attach(StubSageAPI api) {
        debug = api.isDebugEnabled();
        api.addProxy("GetProperty", this);
        api.addProxy("GetServerProperty", this);
        api.addProxy("SetProperty", this);
        api.addProxy("SetServerProperty", this);
        api.addProxy("AddStaticContext", this);
        api.addProxy("AddGlobalContext", this);
    }
}
