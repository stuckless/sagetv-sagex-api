package sagex.remote.rmi;

import sagex.remote.AbstractRPCHandler;

/**
 * Handles all the RMI calls
 * 
 * @author seans
 *
 */
public class RMIRPCHandler extends AbstractRPCHandler {
    public RMIRPCHandler() {
        super();
        log.info("RMI Sage API Handler created");
    }
}
