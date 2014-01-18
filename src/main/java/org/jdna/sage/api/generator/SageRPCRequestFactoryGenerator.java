package org.jdna.sage.api.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.jdna.sage.api.generator.Main.ClassMetadata;
import org.jdna.sage.api.generator.MethodParser.SageMethod;

public class SageRPCRequestFactoryGenerator {
	private static final Logger log = Logger.getLogger(SageRPCRequestFactoryGenerator.class);

	private File srcDir;
	private String packageName;
	private String className;
	private File outFile;
	private File outDir;
	private PrintWriter pw = null;
	private List<ClassMetadata> allClasses;

	public SageRPCRequestFactoryGenerator(File srcDir, String packageName, String className, List<ClassMetadata> allClasses) {
		this.srcDir = srcDir;
		this.packageName = packageName;
		this.className = className;
		this.allClasses = allClasses;

		outDir = new File(srcDir, packageName.replaceAll("\\.", "/") + "/");
	}

	public void generate() throws Exception {
		outDir.mkdirs();
		outFile = new File(outDir, className + ".java");

		System.out.printf("Generating %s.%s\n", packageName, className);
		log.info("Creating Java: " + outFile.getAbsolutePath());

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
        pw.println("import java.util.Map;");
        pw.println("import java.util.HashMap;");
		
		

		pw.printf("public class %s {\n", className);
        pw.println("private static Map<String,String> commands = new HashMap<String,String>();");
        pw.println("static {");
        for (ClassMetadata cm : allClasses) {
            for (SageMethod m : cm.methods) {
                pw.printf("   commands.put(\"%s\",\"%s\");\n", m.name, cm.name);
            }
        }
        pw.println("}\n\n");
		pw.println("   public static RemoteRequest createRequest(String context, String api, String command, String[] parameters) {");
		pw.println("      if (api==null) {");
		pw.println("         api=commands.get(command);");
        pw.println("         if (api==null) throw new RuntimeException(\"Unknown Sage Command: \"+command);");
		pw.println("      }");
		for (ClassMetadata cm : allClasses) {
			pw.printf("      if (\"%s\".equals(api)) {\n", cm.name);
			pw.printf("         return %sFactory.createRequest(context, command, parameters);\n", cm.name);
			pw.println("      }");
		}
		pw.printf("      throw new RuntimeException(\"Unknown Sage Command: \"+command + \" for Api: \" + api);\n");
		pw.println("   }\n\n");
		
        pw.println("}\n\n");

		pw.close();
		pw.flush();
	}
}
