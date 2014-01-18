package org.jdna.sage.api.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jdna.cmdline.CommandLine;
import org.jdna.cmdline.CommandLineProcess;
import org.jdna.configuration.ConfigurationManager;
import org.jdna.configuration.PropertiesConfigurationProvider;
import org.jdna.sage.api.generator.MethodParser.SageMethod;

import sagex.util.ILog;
import sagex.util.LogProvider;

@CommandLineProcess(acceptExtraArgs = false, description = "Generates a Typed Sage API from the SageTV JavaDoc.")
public class Main {
	private static final ILog log = LogProvider.getLogger(Main.class);

	public static class ClassMetadata {
		public String name;
		public List<SageMethod> methods;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public List<SageMethod> getMethods() {
            return methods;
        }
        public void setMethods(List<SageMethod> methods) {
            this.methods = methods;
        }
	}

	public static void main(String args[]) {
	    LogProvider.useSystemOut();
		try {
			// process the command line
			CommandLine cl = new CommandLine("Generate SageTV API (" + Version.VERSION + ")", "java MetadataTool", args);
			cl.process();

			// apply the command line args to this instance.
			Main main = new Main();
			try {
				cl.applyToAnnotated(main);

				// check for help
				if (cl.hasArg("help")) {
					cl.help(main);
					return;
				}
			} catch (Exception e) {
				cl.help(main, e);
				return;
			}

			main.process();
		} catch (Exception e) {
			log.error("Failed!", e);
			System.out.println("Processing Failed, see log for details.");
		}
	}

	private void process() throws Exception {
		initConfiguration();

		
		PackageParser parser = new PackageParser(ConfigurationManager.getInstance().getProperty("sage.packageFrameUrl"));
		parser.parse();
		List<String> urls = parser.getUrls();

		// for regular api stuff
		String baseUrl = ConfigurationManager.getInstance().getProperty("sage.baseApiUrl", "http://download.sage.tv/api/sage/api/");
		//String baseUrl = ConfigurationManager.getInstance().getProperty("sage.baseApiUrl", new File("/home/seans/Downloads/sagebeta/v7api/sage/api/").toURI().toString());
		String srcDir = ConfigurationManager.getInstance().getProperty("sage.src", "src");
		String tagsDir = ConfigurationManager.getInstance().getProperty("sage.tags", "tags");
		String packageName = ConfigurationManager.getInstance().getProperty("sage.packageName", "sagex.api");

		// for request factory stuff
		String requestFactoryPackage = ConfigurationManager.getInstance().getProperty("sage.requestFactory.packageName", "sagex.remote.factory.request");

		List<ClassMetadata> allMetaData = new ArrayList<ClassMetadata>();

		for (String url : urls) {
			String fullUrl = baseUrl + url;
			// System.out.printf("Using Url: %s\n",fullUrl);
			Pattern p = Pattern.compile("([A-Za-z]+).html");
			Matcher m = p.matcher(url);
			if (m.find()) {
				String name = m.group(1);

				log.info("Getting API For: " + fullUrl + "; ClassName: " + name + "; src: " + srcDir + "; package: " + packageName);

				MethodParser mp = new MethodParser(fullUrl);
				mp.parse();

				List<SageMethod> methods = mp.getMethods();

				System.out.println("Generating sagex.api." + name);
				SageAPIGenerator sag = new SageAPIGenerator(new File(srcDir), packageName, name, methods);
				sag.generate();
				
                System.out.println("Generating sagex.api.enums" + name);
				SageEnumGenerator seg = new SageEnumGenerator(new File(srcDir), packageName, name, methods);
				seg.generate();

				System.out.println("Generating sagex.api.remote.factory." + name + "Factory");
				ApiFactoryGenerator classFactory = new ApiFactoryGenerator(new File(srcDir), requestFactoryPackage, name + "Factory", methods);
				classFactory.generate();

				// keep track of all classes for the parent factories
				ClassMetadata md = new ClassMetadata();
				md.methods = methods;
				md.name = name;
				allMetaData.add(md);

				// generate the Tag Files
				SageTagFileAPIGenerator stag = new SageTagFileAPIGenerator(new File(tagsDir), packageName, name, methods);
				stag.generate();

			} else {
				log.error("Problem url Url Name: " + url + "; Could not parse title");
			}
		}

		// now generate files requiring ALL metedata
		System.out.println("Generating RPC Factories");
		SageRPCRequestFactoryGenerator gen = new SageRPCRequestFactoryGenerator(new File(srcDir), requestFactoryPackage, "SageRPCRequestFactory", allMetaData);
		gen.generate();
		
		// generate the JSON Lookup API
		System.out.println("Generating JSON API Lookup");
        JSONApiLookupGenerator json = new JSONApiLookupGenerator(new File(srcDir), "sagex.remote.api", "JSONApiLookup", allMetaData);
        json.generate();
        
        System.out.println("Generating Sage Command enums");
        SageCommandEnumGenerator cmds = new SageCommandEnumGenerator(new File(srcDir), "sagex.api", "SageCommand");
        cmds.generate();
	}

	private void initConfiguration() throws Exception {
		log.debug("Attempting to load generator properties from default locations....");
		Properties pr = new Properties();
		pr.load(this.getClass().getResourceAsStream("generator.properties"));
		ConfigurationManager.getInstance().setProvider(new PropertiesConfigurationProvider(pr));
	}
}
