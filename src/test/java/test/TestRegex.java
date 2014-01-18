package test;

import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
	public static void main(String args[]) {
		testJavaParams("java.io.File File, java.lang.String NamePrefix");
		testJavaParams("java.io.File File");
		testSageNetworkEncoder("  GET_FILE_SIZE a|b|c | d|e\r\n");
		testSageNetworkEncoder("GET_FILE_SIZE a|b|c|d|e");
		testSageNetworkEncoder("NOOP\r\n");
		testSageNetworkEncoder("NOOP");
		
		System.out.println(URLEncoder.encode("Skip Fwd #2"));
	}

	private static void testSageNetworkEncoder(String s) {
		Pattern p = Pattern.compile("\\s*([^\\s$]+)\\s?([^$\r\n]+)?");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.printf("Groups: %d; String: %s; Pattern: %s\n", m.groupCount(), s, p.pattern());
			for (int i = 0; i <= m.groupCount(); i++) {
				System.out.printf("Group[%d]; [%s]\n", i, m.group(i));
			}
		}
	}

	private static void testJavaParams(String s) {
		Pattern p = Pattern.compile("([^\\s]+)\\s+([^\\s,$]+)[\\s,]*");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.printf("Groups: %d; String: %s; Pattern: %s\n", m.groupCount(), s, p.pattern());
			for (int i = 0; i <= m.groupCount(); i++) {
				System.out.printf("Group[%d]; [%s]\n", i, m.group(i));
			}
		}
	}
}
