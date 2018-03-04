package sagex.util;

import org.apache.log4j.*;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Log4j Configuration utility
 * 
 * @author seans
 * 
 */
public class Log4jConfigurator {
	public static class LogStruct {
		public File logFile;
		public String id;
		public Properties properties;
	}

	private static boolean ALL_CONFIGURED = false;

	private static Map<String, LogStruct> logs = new HashMap<String, LogStruct>();

	/**
	 * configure will attempt to configure log4j for a given project/plugin id.
	 * The "id" should be the base name of the your log4j.properties that is in
	 * the sagetv root folder or embedded in the root of your jar file. <br/>
	 * For example, if you call configure("sagex-api"), then it will look for a
	 * file SAGE_HOME/sagex-api.log4j.properties, and load it. If that file does
	 * not exist, then it will look for a jar resource called
	 * "sagex-api.log4j.properties". <br/>
	 * Each plugin should avoid doing a full reinit of the log4j system, and
	 * plugins should avoid setting the root logger. <br/>
	 * <br/>
	 * A Sample log4j configuration for a plugin may look like...
	 * 
	 * <pre>
	 * log4j.appender.SAGEX=org.apache.log4j.FileAppender
	 * log4j.appender.SAGEX.File=logs/sagex-api.log
	 * log4j.appender.SAGEX.Append=false
	 * log4j.appender.SAGEX.layout=org.apache.log4j.PatternLayout
	 * log4j.appender.SAGEX.layout.ConversionPattern=%d [%t] %-5p %c - %m%n
	 * 
	 * log4j.logger.sagex=info, SAGEX
	 * log4j.additivity.sagex=false
	 * </pre>
	 * 
	 * <br/>
	 * In the above configuration, I've created an Appender called SAGEX that
	 * logs to logs/sagex-api.log. I've avoided setting the root logger, so that
	 * I don't hijack it, and i've explicitly stated the all loggers (classes)
	 * that start with sagex should go the the sagex-api.log. Each plugin can
	 * have their own logging files, formats, etc. <br/>
	 * <br/>
	 * The other important thing to note is that i've set the <b>additivity</b>
	 * to false for the sagex logger. By setting this to false, then you are
	 * ensuring that your log events will not end up in someone else's log file,
	 * or the root log file.
	 * 
	 * <br/>
	 * <br/>
	 * Note that when configuring your log file, you should use the unix style
	 * paths so that your configurations work in both linux and windows. ie,
	 * using logs\phoenix.log will not result if a valid path on linux. <br/>
	 * For moore information on how to configure log4j see the <a
	 * href="http://logging.apache.org/log4j/1.2/manual.html">log4j short
	 * manual</a>. Also this <a
	 * href="http://www.vipan.com/htdocs/log4jhelp.html">article</a> does a
	 * great job explaining how to use log4j.
	 * 
	 * <br/>
	 * <br/>
	 * 
	 * You should note that if you want to configure all logging to go to a
	 * single source (this is mainly for advanced users), then you can create a
	 * file called default.log4j.properties in the SageTV home directory, and
	 * configure your logging in that file. If default.log4j.properties exists,
	 * then NO other logging configurations will be processes, So this is a way
	 * for advanced user to configure logging in a single location that uses a
	 * single file.
	 * 
	 * @param id
	 *            base plugin id to configure
	 * @param loader
	 *            base class loader to use when trying to find your log4j
	 *            properties
	 * 
	 * @throws Exception
	 */
	public static synchronized void configure(String id, ClassLoader loader)
			throws Exception {

		if (ALL_CONFIGURED) {
			return;
		}
		
		if (System.getProperty("sagex.log4j.logfile",null)!=null) {
			ALL_CONFIGURED=true;
			String sagexLogger = System.getProperty("sagex.log4j.logfile");
			File sageProps = new File(sagexLogger);
			if (sageProps.exists() && sageProps.getName().endsWith(".properties")) {
				configureFile("sagex.logger", sageProps);
			} else {
				FileAppender fa = new FileAppender(new SimpleLayout(), sagexLogger);
				fa.setAppend(false);
				Logger.getRootLogger().addAppender(fa);
				Logger.getRootLogger().setLevel(Level.INFO);
			}
			Logger.getRootLogger().info("Configured System Wide logging");
			return;
		}
		
		// see if users are using a default override, if so, then just configure
		// that
		File override = new File("default.log4j.properties");
		if (override.exists()) {
			if (logs.containsKey("default")) {
				// default already configured
				return;
			}
			if (configureFile("default", override)) {
				log("log4j has been configured Using default log4j settings from "
						+ override);
				return;
			}
		}

		// see if the root logger is configured...
		if (!isRootConfigured()) {
			// no root logger, so configure.
			// BasicConfigurator.configure();
			Logger.getRootLogger().addAppender(
					new ConsoleAppender(new SimpleLayout(),
							ConsoleAppender.SYSTEM_OUT));
			Logger.getRootLogger().setLevel(Level.INFO);
			log("Configured Root Logger");
		}

		if (logs.get(id) != null) {
			// already configured.
			log("Logger was already configured: " + id + "; Skipping.");
			return;
		}

		// Slugger - patch
		// check if a consumer of this API already configured logging for it...
		// Nothing is added to logs HashMap in this case, meaning reconfigure()
		// will fail if called for this id
		Logger logger = Logger.getLogger(id);
		if (logger != null && logger.getAllAppenders().hasMoreElements()) {
			// already configured.
			log("Consumer has already configured: " + id + "; Skipping.");
			return;
		}

		// configure using File
		String propname = id + ".log4j.properties";
		File f = new File(propname);
		if (f.exists()) {
			if (configureFile(id, f))
				return;
		}

		// now try to configure using embedded resources, since the file was not
		// found
		try {
			if (loader == null)
				loader = Log4jConfigurator.class.getClassLoader();
			if (configureAndCloseStream(id, f,
					loader.getResourceAsStream(propname)))
				return;
		} catch (Exception e) {
			log("Failed to configure logging for: " + id + " using resource: "
					+ propname);
		}

		// just abort :(
		throw new Exception("Failed to configure logging for: " + id
				+ " using file: " + f + " or resource: " + propname);
	}

	/**
	 * Configure using the default classloader
	 * 
	 * @param id
	 * @throws Exception
	 */
	public static void configure(String id) throws Exception {
		configure(id, Log4jConfigurator.class.getClassLoader());
	}

	public static void configureQuietly(String id) {
		try {
			configure(id);
		} catch (Exception e) {
			log("Failed to configure: " + id, e);
		}
	}

	public static void configureQuietly(String id, ClassLoader loader) {
		try {
			configure(id, loader);
		} catch (Exception e) {
			log("Failed to configure: " + id, e);
		}
	}

	/**
	 * Returns the configured {@link LogStruct} logs
	 * 
	 * @return
	 */
	public static LogStruct[] getConfiguredLogs() {
		return logs.values().toArray(new LogStruct[] {});
	}

	public static boolean isRootConfigured() {
		Enumeration appenders = Logger.getRootLogger().getAllAppenders();
		if (appenders.hasMoreElements()) {
			return true;
		}
		return false;
	}

	private static boolean configureFile(String id, File file) {
		if (file.exists()) {
			FileInputStream fis = null;
			try {
				return configureAndCloseStream(id, file, new FileInputStream(
						file));
			} catch (FileNotFoundException e) {
				log("Failed to configure logger for file: " + file, e);
			}
		}
		return false;
	}

	private static boolean configureAndCloseStream(String id, File file,
			InputStream is) {
		try {
			return configureStream(id, file, is);
		} finally {
			closeStream(is);
		}
	}

	private static boolean configureStream(String id, File file, InputStream is) {
		if (is == null)
			return false;

		// configure default logging
		try {
			Properties props = new Properties();
			props.load(is);
			PropertyConfigurator.configure(props);
			LogStruct log = new LogStruct();
			log.id = id;
			log.logFile = file;
			log.properties = props;
			logs.put(id, log);
			log("Configured Logging for: " + id + " using file: " + file);
			return true;
		} catch (Exception e) {
			log("Failed to configure Logging for: " + id + " using file: "
					+ file);
		}
		return false;
	}

	private static void closeStream(InputStream fis) {
		if (fis != null) {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Reconfigure the Logger Properties for the given logger
	 * 
	 * @param id
	 * @param props
	 */
	public static void reconfigure(String id, Properties props) {
		if (ALL_CONFIGURED) return;
		
		LogStruct log = logs.get(id);
		if (log == null) {
			log("No Logger for: " + id);
			return;
		}
		PropertyConfigurator.configure(props);
		log.properties = props;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(log.logFile);
			props.store(fos, "reconfigured");
		} catch (IOException e) {
			log("Failed to save log properties for: " + id, e);
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
				}
			}
		}
		log("Logger: " + id + " has been reconfigured.");
	}

	private static void log(String msg) {
		log(msg, null);
	}

	private static void log(String msg, Throwable t) {
		if (t != null) {
			Logger.getRootLogger().warn(msg, t);
			System.out.println("LOG4J: " + msg);
			t.printStackTrace();
		} else {
			Logger.getRootLogger().info(msg);
			System.out.println("LOG4J: " + msg);
		}
	}
}
