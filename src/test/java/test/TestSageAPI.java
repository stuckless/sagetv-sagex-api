package test;

import java.io.File;

import sagex.SageAPI;
import sagex.UIContext;
import sagex.api.Configuration;
import sagex.api.Global;
import sagex.api.WidgetAPI;

/**
 * To enable the remote sage api, you need to add
 * sagex.remote.SageRPCServerRunner to the server property,
 * load_at_startup_runnable_classes
 * 
 * the sagex-api-6.3.10.jar needs to be in the JARs directory.
 * 
 * @author seans
 */
public class TestSageAPI {
	public static void main(String args[]) throws Exception {
		// we can explicitly set the remote server, or let it figure it out...
		//SageAPI.setProvider(new SageAPIRemote("http://mediaserver:8081/sagex/rpcJava"));
	    //System.setProperty("sagex.SageAPI.remoteUrl", "http://mediaserver:8081/sagex/rpcJava");

		// what os is the remote server running...
		System.out.println("Remote Sage OS: " + Global.GetOS());
		System.out.println("Remote Sage Http Server: " + SageAPI.getProviderProperties().getProperty("server") + ":" + SageAPI.getProviderProperties().getProperty("http.port"));

		// lets find all sage servers on the network (ie, what the extenders do
		// when they start up)
		System.out.println("Discovering Sage Servers on the network....");
		String servers[] = Global.DiscoverSageTVServers(1000);
		if (servers != null) {
			for (int i = 0; i < servers.length; i++) {
				System.out.println("Discovered Sage Server: " + servers[i]);
			}
		}

		// Simply media file test....
		//Object files[] = MediaFileAPI.GetMediaFiles("T");
		//if (files != null) {
		//	System.out.println("Got Files: " + files.length);
		//	Object mf = files[10];
		//	System.out.println("Title: " + MediaFileAPI.GetMediaTitle(mf));
		//	System.out.println("Runtime: " + MediaFileAPI.GetFileDuration(mf));
		//	System.out.println("ID: " + MediaFileAPI.GetMediaFileID(mf));
		//}

		// simple call to tell us how much video we have..
		//System.out.println("Total Video Duration: " + Global.GetTotalVideoDuration() / 3600);

		// dump out our media import paths on the server
		File[] libDirs = Configuration.GetLibraryImportPaths();
		if (libDirs != null) {
			for (File f : libDirs) {
				System.out.println("Library import dir: " + f.getAbsolutePath());
			}
		}

		// dump out a server config property
		System.out.println("Get Runnable Classes: " + Configuration.GetProperty("load_at_startup_runnable_classes", "Not Set"));

		String uiContexts[] = Global.GetUIContextNames();
		for (String ui : uiContexts) {
			System.out.println("Context: " + ui);
			System.out.printf("%s: STV File: %s\n", ui, WidgetAPI.GetCurrentSTVFile(new UIContext(ui)));
			SageAPI.setUIContext(ui);
            System.out.printf("%s: STV File: %s\n", ui, WidgetAPI.GetCurrentSTVFile(null));
            
            Configuration.SetProperty(new UIContext(ui), "/test/sagex/api", "TestVal");
            String val = Configuration.GetProperty("/test/sagex/api", null);
            if ("TestVal".equals(val)) {
                System.out.println("That's not right!!  SetProperty with UI context set the server prop");
            }
            val = Configuration.GetProperty(new UIContext(ui), "/test/sagex/api", null);
            if (!"TestVal".equals(val)) {
                System.out.println("That's not right!!! GetProperty with client context did not work.");
            } else {
                System.out.println("Got Client Val: " + val);
            }
		}
		System.out.printf("Current STV File: %s\n", WidgetAPI.GetCurrentSTVFile());
		
		//Object currentMenu = WidgetAPI.GetCurrentMenuWidget();
		
		//System.out.println("Press any key; Current Widget name: " + WidgetAPI.GetWidgetName(currentMenu));
		//System.in.read();
		
		//WidgetAPI.LaunchMenuWidget(currentMenu);
		// simple call to tell us how much video we have..

		/**
		Global.SageCommand("Pause");
		Thread.currentThread().sleep(500);
		Global.SageCommand("Play");
		Thread.currentThread().sleep(500);

		Global.SageCommand("Skip Fwd #2");
		Thread.currentThread().sleep(500);
		Global.SageCommand("Skip Fwd #2");
		Thread.currentThread().sleep(500);
		Global.SageCommand("Skip Fwd #2");
		Thread.currentThread().sleep(500);
		Global.SageCommand("Skip Fwd #2");
		Thread.currentThread().sleep(500);
		*/
		
		System.out.println("Total Video Duration: " + Global.GetTotalVideoDuration() / 3600);

		SageAPI.setUIContext(null);
	    
		
		System.out.println("Were Done.");
	}
}
