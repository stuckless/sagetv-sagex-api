package test;

import java.io.File;
import java.util.List;

import org.jdna.sage.api.generator.MethodParser;
import org.jdna.sage.api.generator.MethodParser.SageMethod;
import org.jdna.sage.api.generator.SageAPIGenerator;

public class TestGenerator {
	public static void main(String args[]) throws Exception {
		MethodParser apiParser = new MethodParser(args[0]);
		List<MethodParser.SageMethod> methods = apiParser.getMethods();
		for (SageMethod m : methods) {
			System.out.printf("Method: [%s] %s (%s)\n", m.returnType, m.name, m.args);
		}

		String packageName = "sagex.api";
		String className = "MediaFile";
		File srcDir = new File("src/");

		SageAPIGenerator gen = new SageAPIGenerator(srcDir, packageName, className, methods);
		gen.generate();
		System.out.println("Done.");
	}
}
