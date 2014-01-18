package org.jdna.sage.api.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.jdna.sage.api.generator.MethodParser.MethodParam;
import org.jdna.sage.api.generator.MethodParser.SageMethod;

public class ApiFactoryGenerator {
	private static final Logger log = Logger.getLogger(ApiFactoryGenerator.class);

	private File srcDir;
	private String packageName;
	private String className;
	private File outFile;
	private File outDir;
	private PrintWriter pw = null;
	private List<SageMethod> methods;

	public ApiFactoryGenerator(File srcDir, String packageName, String className, List<SageMethod> methods) {
		this.srcDir = srcDir;
		this.packageName = packageName;
		this.className = className;
		this.methods = methods;

		outDir = new File(srcDir, packageName.replaceAll("\\.", "/") + "/");
	}

	public void generate() throws Exception {
		outDir.mkdirs();
		outFile = new File(outDir, className + ".java");

		log.info("Creating Java: " + outFile.getAbsolutePath());

		Map<String, SageMethod> usedMethods = new HashMap<String, SageMethod>();

		pw = new PrintWriter(new FileWriter(outFile));
		pw.printf("package %s;\n\n", packageName);

		pw.println("/**");
		pw.println(" * Unofficial SageTV Generated File - Never Edit");
		pw.println(" * Generated Date/Time: " + new SimpleDateFormat().format(new Date()));
		pw.printf(" * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/%s.html'>%s</a>\n", className, className);
		pw.println(" * This Generated API is not Affiliated with SageTV.  It is user contributed.");
		pw.println(" */");

		pw.println("\nimport java.util.Map;");
		pw.println("import sagex.remote.RemoteRequest;");
		pw.println("import sagex.remote.xmlrpc.RequestHelper;\n");

		pw.printf("public class %s {\n", className);

		pw.println("   public static RemoteRequest createRequest(String context, String command, String[] parameters) {");

		for (SageMethod m : methods) {
			// skip methods that we have already processed
			if (usedMethods.containsKey(m.name))
				continue;

			List<SageMethod> sameMethods = getMatchingMethods(methods, m.name);
			pw.println("   if (command.equals(\"" + m.name + "\")) {");
			if (sameMethods.size() == 1) {
				String args = createParameterArgs(m);
				pw.println("      return sagex.remote.xmlrpc.RequestHelper.createRequest(context,\"" + m.name + "\",parameters," + args + ");");
			} else {
				for (SageMethod sm : sameMethods) {
					int sig = getSignatureCount(sm);
					String args = createParameterArgs(sm);
					pw.printf("      if (parameters!=null && parameters.length == %d) {\n", sig);
					pw.printf("         return sagex.remote.xmlrpc.RequestHelper.createRequest(context, \"%s\", parameters, %s);\n", m.name, args);
					pw.println("      }");
				}
			}
			pw.println("   }");

		}
		pw.printf("   throw new RuntimeException(\"Invalid %s Command: \"+command);\n", className);
		pw.println("   }\n\n");
		pw.println("}");

		pw.close();
		pw.flush();
	}

	private int getSignatureCount(SageMethod sm) {
		if (sm.args == null || sm.args.size() == 0)
			return 0;

		return sm.args.size();
	}

	private String createParameterArgs(SageMethod sm) {
		if (sm.args.size() == 0)
			return null;

		StringBuffer args = new StringBuffer();
		for (int i = 0; i < sm.args.size(); i++) {
			if (i != 0) {
				args.append(",");
			}
			MethodParam mp = sm.args.get(i);
			args.append(String.format("%s.class", fixSageApi(mp.dataType)));
		}
		return args.toString();
	}

	private List<SageMethod> getMatchingMethods(List<SageMethod> methods, String name) {
		List<SageMethod> l = new ArrayList<SageMethod>();

		for (SageMethod m : methods) {
			if (name.equals(m.name))
				l.add(m);
		}

		return l;
	}

	private String fixSageApi(String name) {
		return name.replaceAll("sage\\.[^$\\[\\]]+", "Object");
	}
}
