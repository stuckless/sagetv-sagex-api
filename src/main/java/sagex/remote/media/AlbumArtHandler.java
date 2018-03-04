package sagex.remote.media;

import sagex.api.AlbumAPI;
import sagex.api.MediaFileAPI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Resolves album art and writes it
 * @author broconne
 *
 */
public class AlbumArtHandler implements SageMediaRequestHandler {
    public void processRequest(HttpServletRequest req, HttpServletResponse resp, Object mediaFile) throws Exception {
    	Object album = MediaFileAPI.GetAlbumForFile(mediaFile);
        MediaHandler.writeSageImageFile(AlbumAPI.GetAlbumArt(album), req, resp);
    }
}
