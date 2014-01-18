package sagex.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Provides some basic Type conversion between String types and other concrete types
 * 
 * @author seans
 *
 */
public class TypesUtil {
    private static final ILog log = LogProvider.getLogger(TypesUtil.class);
    
    public static int toInt(String s, int defValue) {
        if (s==null) return defValue;
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return defValue;
        }
    }
    public static float toFloat(String s, float defValue) {
        if (s==null) return defValue;
        try {
            return Float.parseFloat(s);
        } catch (NumberFormatException e) {
            return defValue;
        }
    }
    public static long toLong(String s, long defValue) {
        if (s==null) return defValue;
        try {
            return Long.parseLong(s);
        } catch (NumberFormatException e) {
            return defValue;
        }
    }
    public static double toDouble(String s, double defValue) {
        if (s==null) return defValue;
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return defValue;
        }
    }
    public static boolean toBoolean(String s, boolean defValue) {
        if (s==null) return defValue;
        return Boolean.parseBoolean(s);
    }
    /**
     * Attempts to convert a String long value to a date.  If that fails, it will use a date
     * parsing mask and attempt to parse the date using that mask.  the default mask is
     * YYYY-MM-DD
     * 
     * @param s
     * @return
     */
    public static Date toDate(String s) {
        if (s==null) return null;
        try {
            long l = Long.parseLong(s);
            return new Date(l);
        } catch (NumberFormatException e) {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return f.parse(s);
            } catch (ParseException e1) {
                // we'll log it later
            }
        }
        log.warn("Failed to convert " + s + " to a valid date");
        return null;
    }
    
    /**
     * Given the input string attempt to convert it to the returnType or null.  For numeric types
     * if null, then the the return will be 0.  For boolean it will be false, and for all other
     * types it will be null.
     *  
     * @param s
     * @param returnType
     * @return
     */
    public static Object fromString(String value, Class returnType) {
        if (returnType == String.class) {
            return value;
        } else if (returnType == int.class || returnType == Integer.class) {
            return toInt(value, 0);
        } else if (returnType == long.class || returnType == Long.class) {
            return toLong(value, 0l);
        } else if (returnType == boolean.class || returnType == Boolean.class) {
            return toBoolean(value, false);
        } else if (returnType == float.class || returnType == Float.class) {
            return toFloat(value, 0.0f);
        } else if (returnType == double.class || returnType == Double.class) {
            return toDouble(value, 0.0d);
        } else if (returnType == Date.class) {
            return toDate(value);
        } else if (returnType == Object.class) {
            return value;
        } else {
            log.warn("Unhandled fromString() conversion, return null for type: " + returnType);
        }
        return null;
    }
    
    /**
     * Converts primitives and Date into a String.  For a date, the value is the Date.getTime() long value.
     * 
     * @param in
     * @return
     */
    public static String toString(Object in) {
        if (in==null) return null;
        Class type = in.getClass();
        if (type == String.class) {
            return (String) in;
        } else if (type == int.class || type == Integer.class) {
            return String.valueOf(in);
        } else if (type == long.class || type == Long.class) {
            return String.valueOf(in);
        } else if (type == boolean.class || type == Boolean.class) {
            return String.valueOf(in);
        } else if (type == float.class || type == Float.class) {
            return String.valueOf(in);
        } else if (type == double.class || type == Double.class) {
            return String.valueOf(in);
        } else if (type == Date.class) {
        	return String.valueOf(((Date)in).getTime());
        } else if (type == Object.class) {
        	return in.toString();
        } else {
            log.warn("Unhandled toString() conversion, return null for type: " + type);
        }
        return null;
    }
}
