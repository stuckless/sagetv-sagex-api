package test;

import sagex.api.AiringAPI;
import sagex.api.Database;

public class TestJReichen {
	public static void main(String args[]) {
		test1(args);
	}
	
	public static void test1(String args[]) {
		//System.setProperty("sagex.SageAPI.remoteUrl", "http://mediaserver:8081/sagex/rpcJava");
		System.out.println("get titles");
		String[] titles = null;
		titles = Database.GetAllTitles();
		titles = (String[]) sagex.SageAPI.call("GetAllTitles", null);
		System.out.println("titles: " + titles.length);

		System.out.println("sorting titles");
		titles =(String[]) Database.Sort(titles, false, null);
		System.out.println("done sort titles");
		
		//Database.Sort(titles, true, "Natural");
		//titles = (String[]) sagex.SageAPI.call("Sort", params);

		for (String title : titles){
		  System.out.println(title);
		}
	}
	
	public static void test2(String args[]) {
		System.out.println("Searching...");
		Object[] airings = Database.SearchByTitle("Chaotic"); 
		System.out.println("Sorting: " + airings.length + "; arr type: " + airings[0].getClass().getName());
		airings = (Object[]) Database.Sort(airings, true, null);

		System.out.println("Printing: " + airings.length + "; arr type: " + airings[0].getClass().getName());
		for (int i = 0; i < airings.length; i++)
		{
		    Object airing = airings[i];
		    String title = AiringAPI.GetAiringTitle(airing);
		    System.out.println("Title: " + title);
		}
		System.out.println("Done");
	}
}
