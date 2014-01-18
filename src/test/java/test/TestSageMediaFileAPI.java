package test;

import sagex.SageAPI;
import sagex.api.Global;
import sagex.api.MediaFileAPI;
import sagex.remote.builder.BuilderHandler;
import sagex.remote.builder.SageAPIBuilder;
import sagex.remote.rmi.RMISageAPI;

public class TestSageMediaFileAPI {
    public static void main(String args[]) throws Exception {
    	// connect to your server
    	SageAPI.setProvider(new RMISageAPI("localhost"));
    	
    	// call an api to see what your server address would be
    	System.out.println(Global.GetServerAddress());
    	
    	// get a list of mediafiles on the server and dumpe the first 10
    	int i=0;
    	Object[] mediafiles = MediaFileAPI.GetMediaFiles();
    	for (Object mf: mediafiles) {
    		System.out.println("Show: " + MediaFileAPI.GetMediaTitle(mf));
    		if (i++>10) break;
    	}
    	
    	Object mediafile = MediaFileAPI.GetMediaFileForID(2150735);
    	
    	BuilderHandler h = new BuilderHandler() {
			int spaces = 0;
			@Override
			public void handleField(String name, Object data) {
				System.out.printf("%s%s: %s\n", spaces(), name, data );
			}
			
			@Override
			public void handleError(String string, Exception e) throws Exception {
				e.printStackTrace();
			}
			
			@Override
			public void endObject(String objectName) {
				spaces=spaces-3;
				System.out.printf("%s}\n", spaces());
			}
			
			@Override
			public void endArray(String name) {
				spaces=spaces-3;
				System.out.println("}");
			}
			
			@Override
			public void beginObject(String objectName) {
				System.out.printf("%sOBJECT: %s {\n", spaces(), objectName);
				spaces=spaces+3;
			}
			
			@Override
			public void beginArray(String name, int size) {
				System.out.printf("%sARRAY: %s[%s] {\n", spaces(), name, size);
				spaces=spaces+3;
			}

			private Object spaces() {
				if (spaces>0) {
				return String.format("%"+spaces+"s","");
				} else {
					return "";
				}
			}
		};
    	
    	SageAPIBuilder.INSTANCE.build("RESULT",mediafile, h, false, new String[] {"MediaFileID", "MediaFileAiring", "Show", "ShowEpisode"});
    	
		//SageAPIBuilder.INSTANCE.build("RESULT",mediafile, h, false, null);
    	
    	
    	System.out.println("DONE");
    }
}
