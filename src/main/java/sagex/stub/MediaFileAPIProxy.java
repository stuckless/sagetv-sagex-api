package sagex.stub;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * When using the MediaFileAPIProxy, you can set various fields in the MediaFile once you add it.
 * 
 * @author seans
 *
 */
public class MediaFileAPIProxy implements StubAPIProxy {
    public class MediaFile {
        public Properties props = new Properties();
        public int id;
        public String title=null;
        public String episodeTitle=null;
        public File file=null;
        public String type = "Movie";
        public String category = null;
        public String episode;
        
        public String toString() {
            return "StubMediaFile[id:"+id+ "; title:"+title+ ";type: " + type +"; File:" +file.getAbsolutePath()+"]";
        }
    }
    
    private static int ids=1;
    private Map<Integer, MediaFile> files = new HashMap<Integer, MediaFile>();
    
    public Object call(String cmd, Object[] args) {
        if ("GetMediaFiles".equals(cmd)) {
            return files.values().toArray(new MediaFile[files.size()]);
        }

        if (args==null || args.length==0 || args[0]==null) return null;
        
        if ("GetMediaFileID".equals(cmd)) {
            return ((MediaFile)args[0]).id;
        }

        if ("IsMediaFileObject".equals(cmd)) {
            return args[0] instanceof MediaFile;
        }
        
        if ("GetFileForSegment".equals(cmd)) {
            return ((MediaFile)args[0]).file;
        }
        
        if ("GetSegmentFiles".equals(cmd)) {
            return new File[] {((MediaFile)args[0]).file};
        }
        
        if ("GetMediaFileForID".equals(cmd)) {
            return files.get(args[0]);
        }

        if ("GetMediaTitle".equals(cmd) || "GetShowTitle".equals(cmd)) {
            return ((MediaFile)args[0]).title;
        }
        
        if ("GetShowTitle".equals(cmd)) {
            return ((MediaFile)args[0]).episodeTitle;
        }
        
        if ("AddMediaFile".equals(cmd)) {
            return addMediaFile((File) args[0]);
        }

        if ("IsTVFile".equals(cmd)) {
            return "TV".equals(((MediaFile)args[0]).type);
        }
        
        if ("IsVideoFile".equals(cmd)) {
            return "Movie".equals(((MediaFile)args[0]).type);
        }
        
        if ("IsMusicFile".equals(cmd)) {
            return "Music".equals(((MediaFile)args[0]).type);
        }
        
        if ("IsDVD".equals(cmd)) {
            return "DVD".equals(((MediaFile)args[0]).type);
        }
        
        if ("IsBluRay".equals(cmd)) {
            return "BluRay".equals(((MediaFile)args[0]).type);
        }
        
        if ("GetMediaFileForFilePath".equals(cmd)) {
            for (MediaFile mf : files.values()) {
                if (mf.file.equals((File)args[0])) {
                    return mf;
                }
            }
            return null;
        }

        if ("SetMediaFileMetadata".equals(cmd)) {
            ((MediaFile)args[0]).props.setProperty(String.valueOf(args[1]), String.valueOf(args[2]));
            return null;
        }
        
        if ("GetMediaFileMetadata".equals(cmd)) {
            return ((MediaFile)args[0]).props.getProperty(String.valueOf(args[1]));
        }
        
        if ("GetShowCategory".equals(cmd)) {
            return ((MediaFile)args[0]).category;
        }

        if ("GetShowEpisode".equals(cmd)) {
            return ((MediaFile)args[0]).episode;
        }
        
        System.out.println("MediaFileAPIProxy: Unhandled: " + cmd);
        
        return null;
    }
    
    public MediaFile addMediaFile(File f) {
        MediaFile mf = new MediaFile();
        mf.title=f.getName();
        if (mf.title.indexOf(".")!=-1) {
            mf.title = mf.title.substring(0, mf.title.indexOf("."));
        }
        
        if (f.getAbsolutePath().contains(File.separator + "TV")) {
            mf.type="TV";
        } else if (f.getAbsolutePath().contains(File.separator + "Music")) {
            mf.type="Music";
        } else if (f.getAbsolutePath().contains(File.separator + "DVD")) {
            mf.type="DVD";
        } else if (f.getAbsolutePath().contains(File.separator + "BluRay")) {
            mf.type="BluRay";
        } else if (f.getAbsolutePath().contains(File.separator + "Movie")) {
            mf.type="Movie";
        }
        
        mf.file=f;
        mf.id=ids++;
        files.put(mf.id, mf);

        System.out.println("Added Stub MediaFile: " + mf);
        return mf;
    }
    
    public void attach(StubSageAPI api) {
        api.addProxy("GetMediaFileID", this);
        api.addProxy("IsMediaFileObject", this);
        api.addProxy("GetFileForSegment", this);
        api.addProxy("GetMediaFileForID", this);
        api.addProxy("AddMediaFile", this);
        api.addProxy("GetMediaTitle",this);
        
        api.addProxy("GetShowEpisode",this);
        api.addProxy("GetShowTitle", this);
        
        api.addProxy("GetMediaFileForFilePath", this);
        api.addProxy("GetMediaFiles", this);
        api.addProxy("GetSegmentFiles", this);
        api.addProxy("IsTVFile", this);
        api.addProxy("IsVideoFile", this);
        api.addProxy("IsMusicFile", this);
        api.addProxy("IsDVD", this);
        api.addProxy("IsBluRay", this);
        
        api.addProxy("SetMediaFileMetadata", this);
        api.addProxy("GetMediaFileMetadata", this);
        
        api.addProxy("GetShowCategory", this);
    }
    
    public static MediaFile getMediaFile(Object mf) {
        return (MediaFile)mf;
    }
}
