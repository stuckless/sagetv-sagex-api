package sagex.util;

import org.apache.log4j.Logger;

/**
 * Simple interface to abstract logging, so that sagex.api does not depend on log4j.
 * 
 * @author seans
 *
 */
public class Log4jLog implements ILog {
    static {
        // configure us for log4j
        Log4jConfigurator.configureQuietly("sagex-api");
    }
    
    private Logger log = null;
    
    @SuppressWarnings("unchecked")
    public Log4jLog(Class name) {
        log = Logger.getLogger(name);
    }
    
    public void debug(String msg) {
        log.debug(msg);
    }

    public void error(String msg) {
        log.error(msg);
    }

    public void error(String msg, Throwable t) {
        log.error(msg, t);
    }

    public void info(String msg) {
        log.info(msg);
    }

    public void warn(String msg) {
        log.warn(msg);
    }

    public void warn(String msg, Throwable t) {
        log.warn(msg, t);
    }
}
