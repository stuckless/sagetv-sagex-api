package sagex.stub;

import sagex.ISageAPIProvider;

/**
 * An Empty implementation of the SageAPIProvider when nothing can be located.
 * 
 * @author seans
 */
public class NullSageAPIProvider implements ISageAPIProvider {
    public Object callService(String name, Object[] args) throws Exception {
        return null;
    }
    
    public Object callService(String context, String name, Object[] args) throws Exception {
        return null;
    }

    public String toString() {
        return "null://";
    }
}
