package org.jdna.sage.api.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import org.apache.log4j.Logger;
import org.jdna.sage.api.generator.Main.ClassMetadata;

import sagex.remote.json.JSONObject;

/**
 * Create a .json file that contains the entire SageTV Api Specification.  ie, Classes, Methods, Method Signautes, Comments, etc.
 * 
 * @author seans
 */
public class JSONApiLookupGenerator {
	private static final Logger log = Logger.getLogger(JSONApiLookupGenerator.class);

	private File srcDir;
	private String packageName;
	private String className;
	private File outFile;
	private File outDir;
	private PrintWriter pw = null;
	private List<ClassMetadata> allClasses;

	public JSONApiLookupGenerator(File srcDir, String packageName, String className, List<ClassMetadata> allClasses) {
		this.srcDir = srcDir;
		this.packageName = packageName;
		this.className = className;
		this.allClasses = allClasses;

		outDir = new File(srcDir, packageName.replaceAll("\\.", "/") + "/");
	}

	public void generate() throws Exception {
		outDir.mkdirs();
		outFile = new File(outDir, className + ".json");
		System.out.printf("Generating %s.%s\n", packageName, className);
		log.info("Creating Json File: " + outFile.getAbsolutePath());
		pw = new PrintWriter(new FileWriter(outFile));
		pw.write(createJSONApiString(allClasses));
		pw.close();
		pw.flush();
	}
	
    private String createJSONApiString(List<ClassMetadata> allClasses2) {
        try {
            JSONObject jo = new JSONObject();
            for (ClassMetadata md : allClasses2) {
                jo.put(md.name, new JSONObject(md));
            }
            StringWriter sw = new StringWriter();
            jo.write(sw);
            return sw.toString();
        } catch (Exception e) {
            return "{}";
        }
    }
}
