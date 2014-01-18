package test;

import sagex.api.AiringAPI;
import sagex.api.MediaFileAPI;
import sagex.api.ShowAPI;
import sagex.remote.builder.SageAPIBuilder;
import sagex.remote.builder.SimpleJSONBuilder;

public class TestBuilders {
    public static void main(String args[]) {
        Object mediafiles[] = MediaFileAPI.GetMediaFiles();
        Object mediafile = mediafiles[20];
        Object airing = MediaFileAPI.GetMediaFileAiring(mediafile);
        Object show = AiringAPI.GetShow(airing);
        System.out.printf("     Title: %s\n", MediaFileAPI.GetMediaTitle(mediafile));
        System.out.printf("Is Watched: %s\n", AiringAPI.IsWatched(airing));
        System.out.printf("Desc: %s\n", ShowAPI.GetShowDescription(show));
        
        
        //SimpleXmlBuilder builder = new SimpleXmlBuilder();
        SimpleJSONBuilder builder = new SimpleJSONBuilder();
        try {
            SageAPIBuilder.INSTANCE.build("Result", mediafile, builder, false, null);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(builder.toString());

        builder = new SimpleJSONBuilder();
        try {
            SageAPIBuilder.INSTANCE.build("Result", mediafile, builder, false, new String[] {"MediaTitle"});
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println(builder.toString());
        //MediaFileAPI.GetMediaFiles();
    }
}
