package test.junit.lib;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class UnitUtils {
    public static File CreateFile(String filename, int size) throws IOException
    {
    	Random rnd = new Random(System.currentTimeMillis());
    	File file = new File("target/junit/testfiles/", filename);
    	if (!file.getParentFile().exists()) {
    		file.getParentFile().mkdirs();
    	}
    	
        FileOutputStream out = new FileOutputStream(file);
        try
        {
            byte[] data = new byte[65536];
            rnd.nextBytes(data);

            while (size > 0)
            {
                int bytesToWrite = Math.min(size, data.length);
                out.write(data, 0, bytesToWrite);
                size -= bytesToWrite;
            }
        }
        finally
        {
            out.close();
        }
        
        return file;
    }

}
