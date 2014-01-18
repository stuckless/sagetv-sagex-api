package sagex.remote;

import sagex.ISageAPIProvider;

public class EmbeddedSageAPIProvider implements ISageAPIProvider {
    public EmbeddedSageAPIProvider() {
        try {
            callService("GetOS", null);
        } catch (Throwable t) {
            System.out.println("Embedded SageAPI is not functional.  We are most likely running remotely.");
            throw new RuntimeException("Embedded SageAPI is not functional, probably because we are running remotely.", t);
        }
    }
    
	public Object callService(String name, Object[] args) throws Exception {
		return sage.SageTV.api(name, args);
	}

	public String toString() {
		return "sage://embedded";
	}

	public Object callService(String context, String name, Object[] args) throws Exception {
	    return sage.SageTV.apiUI(context, name, args);
	}
}
