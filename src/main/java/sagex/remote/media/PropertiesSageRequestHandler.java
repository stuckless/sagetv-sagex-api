package sagex.remote.media;

import sagex.api.MediaFileAPI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;

public class PropertiesSageRequestHandler implements SageMediaRequestHandler {
    public void processRequest(HttpServletRequest req, HttpServletResponse resp, Object sageMediaFile) throws Exception {
        File file = MediaFileAPI.GetFileForSegment(sageMediaFile, 0);

        File pFile = null;
        pFile = new File(file.getParentFile(), file.getName() + ".properties");
        if (pFile==null || !pFile.exists()) throw new FileNotFoundException(pFile.getAbsolutePath());
        
        resp.setContentType("text/plain");
        resp.setHeader("Content-Length", String.valueOf(pFile.length()));
        OutputStream os = resp.getOutputStream();
        MediaHandler.copyStream(new FileInputStream(pFile), os);
        os.flush();
    }
}
