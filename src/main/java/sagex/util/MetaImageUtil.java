package sagex.util;

import sagex.SageAPI;
import sagex.api.MediaFileAPI;
import sagex.api.Utility;
import sagex.api.WidgetAPI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaImageUtil {
	private static ILog log = LogProvider.getLogger(MetaImageUtil.class);
	
	/**
	 * Given a MediaFile load its thumbnail and then return the physical file location of that image.
	 * 
	 * This is only useful for remote apps, so don't call this method from within the STV
	 * 
	 * @param file Sage MediaFile
	 * @param checkdelay delay to wait between checks, if the image hasn't been loaded.
	 * @param waitms how long to wait before giving up
	 * @return image file
	 * @throws FileNotFoundException if the thumbnail image can't be loaded
	 */
	public static File getThumbnailImageFile(Object file, long checkdelay, long waitms) throws FileNotFoundException {
		if (file==null) throw new FileNotFoundException("No Image");
		
		int mfid = MediaFileAPI.GetMediaFileID(file);

		if (!MediaFileAPI.HasAnyThumbnail(file)) throw new FileNotFoundException("No available thumbnail for " + mfid);

		// just return picture files
		if (MediaFileAPI.IsPictureFile(file)) {
			return MediaFileAPI.GetFileForSegment(file, 0);
		}
		
		// force the thubmanil to load
		Object mi = MediaFileAPI.GetThumbnail(file);
		if (mi==null) throw new FileNotFoundException("No Thumbnail for: " + mfid);
		
		// try Sage7 api for 
		File f = Utility.GetMetaImageSourceFile(mi);
		if (f!=null) {
			return waitForImage(f, checkdelay, waitms);
		}
		
		// now wait for it to load
		// MetaImage[MediaFileThumbnail[MediaFile[id=650447 A[650450,650448,"IMG_20100721_112056",0@0721.11:20,0] mask=P host=sean-desktop encodedBy= format=JPEG 0:00:00 0 kbps [] /home/sean/BETA/MEDIA/Images/IMG_20100721_112056.jpg, Seg0[Wed 7/21 11:20:55.999-Wed 7/21 11:20:56.000]
		// MetaImage[/home/sean/BETA/server/GeneratedThumbnails/homeseanBETAMEDIAVideoMovies17Again1080px264mkv.jpg#0 512x282 javaImage=false javaMem=0 jref=0]
		// MetaImage[null 512x282 javaImage=false javaMem=0 jref=0]
		Pattern p = Pattern.compile("\\[([^#]+)");
		File image = null;
		long timeout = System.currentTimeMillis() + waitms;
		boolean found = false;
		do {
			String imageDetail = null;
			if (SageAPI.isRemote()) {
				imageDetail = (String)WidgetAPI.EvaluateExpression("java_lang_String_valueOf(GetThumbnail(GetMediaFileForID("+mfid+")))");
				if ("null".equals(imageDetail)) throw new FileNotFoundException("Can't load thumbnail for " + mfid);
			} else {
				mi = MediaFileAPI.GetThumbnail(file);
				imageDetail = mi.toString();
			}
			Matcher m = p.matcher(imageDetail);
			if (m.find()) {
				image = new File(m.group(1).trim());
				if (image.exists()) break;
			}
			
			if (System.currentTimeMillis()<timeout) {
				log.debug("waiting for image to load: " + imageDetail);
				try {
					Thread.sleep(checkdelay);
				} catch (InterruptedException e) {
				}
			}
		} while (!found && System.currentTimeMillis()<timeout);
		
		if (image==null || !image.exists()) {
			throw new FileNotFoundException("Can't location image thumbnail for: " + mfid); 
		}
		
		return image;
	}

	private static File waitForImage(File f, long checkdelay, long waitms) throws FileNotFoundException {
		if (f==null) throw new FileNotFoundException("No Image");
		
		if (f.exists()) return f;
		
		long timeout = System.currentTimeMillis() + waitms;
		do {
			if (f.exists()) break;
			
			if (System.currentTimeMillis()<timeout) {
				//log.debug("waiting for image to be created: " + f);
				try {
					Thread.sleep(checkdelay);
				} catch (InterruptedException e) {
				}
			}
		} while (System.currentTimeMillis()<timeout);

		if (!f.exists()) throw new FileNotFoundException("File wasn't created " + f);
		
		return f;
	}
}
