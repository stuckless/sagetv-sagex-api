package sagex.util;

import java.lang.reflect.Constructor;

/**
 * 
 * LogProvider should be used in place of log4j in sagex.apis.  To create a log, use the following
 * ILog log = LogProvider.getLogger(Class);
 * 
 * 
 * @author seans
 *
 */
@SuppressWarnings("unchecked")
public class LogProvider {
    private static final class NullLog implements ILog {
        public void debug(String msg) {
        }

        public void error(String msg) {
        }

        public void error(String msg, Throwable t) {
        }

        public void info(String msg) {
        }

        public void warn(String msg) {
        }

        public void warn(String msg, Throwable t) {
        }
    }

    private static final class SystemOutLog implements ILog {
        private void out(String pref, String message, Throwable t) {
            System.out.printf("sagex.api:[%5s]:%s\n", pref, message);
            if (t!=null) {
                t.printStackTrace();
            }
        }
        public void debug(String msg) {
            out("debug",msg,null);
        }

        public void error(String msg) {
            out("error",msg,null);
        }

        public void error(String msg, Throwable t) {
            out("error",msg,t);
        }

        public void info(String msg) {
            out("info",msg,null);
        }

        public void warn(String msg) {
            out("warn",msg,null);
        }

        public void warn(String msg, Throwable t) {
            out("warn",msg,t);
        }
    }
    
    private static Class<ILog> logClass = null;
    private static Constructor<ILog> logInit = null;
    private static ILog DefaultLog = new NullLog();
    
    static {
        try {
            logClass = (Class<ILog>) Class.forName("sagex.util.Log4jLog");
            logInit = logClass.getConstructor(Class.class);
        } catch (Throwable t) {
            //t.printStackTrace();
            System.out.println("Using default logging, since log4j is not in the classpath.");
        }
    }
    
    public static ILog getLogger(Class name) {
        if (logInit==null) {
            return DefaultLog;
        } else {
            try {
                return logInit.newInstance(name);
            } catch (Throwable t) {
                System.out.println("Failed to create Log Instance. Logging Disabled.");
                logInit=null;
                return DefaultLog;
            }
        }
    }
    
    /**
     * for testing, you can use System.out, mainly useful for junit testing
     */
    public static void useSystemOut() {
        logInit=null;
        logClass=null;
        DefaultLog = new SystemOutLog();
    }
}
