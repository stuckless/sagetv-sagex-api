package org.jdna.sage.api.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.jdna.sage.api.generator.MethodParser.SageMethod;

public class SageEnumGenerator {
	private static final Logger log = Logger.getLogger(SageEnumGenerator.class);

	private File srcDir;
	private String packageName;
	private String className;
	private File outFile;
	private File outDir;
	private PrintWriter pw = null;
	private List<SageMethod> methods;

	public SageEnumGenerator(File srcDir, String packageName, String className, List<SageMethod> methods) {
		this.srcDir = srcDir;
		this.packageName = packageName + ".enums";
		this.className = className+"Enum";
		this.methods = methods;

		outDir = new File(srcDir, this.packageName.replaceAll("\\.", "/") + "/");
	}

	public void generate() throws Exception {
		outDir.mkdirs();
		outFile = new File(outDir, className + ".java");

		log.info("Creating Java: " + outFile.getAbsolutePath());

		pw = new PrintWriter(new FileWriter(outFile));
		pw.printf("package %s;\n\n", packageName);

		pw.println("/**");
		pw.println(" * Unofficial SageTV Generated File - Never Edit");
		pw.println(" * Generated Date/Time: " + new SimpleDateFormat().format(new Date()));
		pw.printf(" * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/%s.html'>%s</a>\n", className, className);
		pw.println(" * This Generated API is not Affiliated with SageTV.  It is user contributed.");
		pw.println(" */");

		pw.printf("public enum %s {\n", className);

		List<String> methodNames = new ArrayList<String>();
		
		for (SageMethod m : methods) {
		    if (methodNames.contains(m.getName())) {
		        continue;
		    }
		    if (methodNames.size()>0) {
		        pw.print(",");
		    }
		    pw.print("\n");
		    pw.print(m.getName());
		    methodNames.add(m.getName());
		}
		
		pw.println("\n}");

		pw.close();
		pw.flush();
	}
}
