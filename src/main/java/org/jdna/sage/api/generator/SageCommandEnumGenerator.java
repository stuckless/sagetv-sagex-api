package org.jdna.sage.api.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import org.apache.log4j.Logger;

import sagex.SageAPI;

public class SageCommandEnumGenerator {
	private static final Logger log = Logger.getLogger(SageCommandEnumGenerator.class);

	private String packageName;
	private String className;
	private File outFile;
	private File outDir;
	private PrintWriter pw = null;

	public SageCommandEnumGenerator(File srcDir, String packageName, String className) {
		this.packageName = packageName + ".enums";
		this.className = className+"Enum";
		outDir = new File(srcDir, this.packageName.replaceAll("\\.", "/") + "/");
	}

	public void generate() throws Exception {
		outDir.mkdirs();
		outFile = new File(outDir, className + ".java");

		System.out.println("Creating Java: " + outFile.getAbsolutePath());

		pw = new PrintWriter(new FileWriter(outFile));
		pw.printf("package %s;\n\n", packageName);

		pw.println("/**");
		pw.println(" * Unofficial SageTV Generated File - Never Edit");
		pw.println(" * Generated Date/Time: " + new SimpleDateFormat().format(new Date()));
		pw.printf(" * See Official Sage Documentation at <a href='http://download.sage.tv/api/sage/api/%s.html'>%s</a>\n", className, className);
		pw.println(" * This Generated API is not Affiliated with SageTV.  It is user contributed.");
		pw.println(" */");

		pw.printf("public enum %s {\n", className);

		Vector v = (Vector) SageAPI.call("GetSageCommandNames", null);
		for (int i=0;i<v.size();i++) {
		    if (i>0) {
		        pw.println(",");
		    }
		    String name = ((String)v.get(i));
		    name = name.replaceAll("/", "Or");
		    name = name.replaceAll("[^a-zA-Z0-9]", "");
		    if ("-".equals(v.get(i))) {
		        name="Dash";
		    }
		    pw.printf("%s(\"%s\")", name, v.get(i));
		}
		pw.println(";");
		
		pw.println("\n\nprivate String command;");
		pw.printf("private %s(String cmd) {\n", className);
		pw.println("this.command =cmd;");
		pw.println("}");
		
		pw.println("public String command() { return command; }");
		pw.println("\n}");

		pw.close();
		pw.flush();
	}
}
