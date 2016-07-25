package sagex.util;

/**
 * Created by seans on 24/07/16.
 */
public class SystemUtil {
    private static Boolean JAVA8 = null;
    public static boolean isJava8OrGreater() {
        if (JAVA8!=null) return JAVA8;
        try {
            String ver = System.getProperty("java.specification.version",null);
            if (ver==null) throw new Exception("Can't get Java Specification Version (java.specification.version)");
            float floatVer = Float.parseFloat(ver);
            //System.out.println("VERSION: " + ver + "; " + floatVer);
            JAVA8 = floatVer>=1.8f;
        } catch (Throwable t) {
            //t.printStackTrace();
            JAVA8=false;
        }

        return JAVA8;
    }
}
