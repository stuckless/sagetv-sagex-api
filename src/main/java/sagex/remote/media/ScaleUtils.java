package sagex.remote.media;

import javax.servlet.http.HttpServletRequest;

import sagex.remote.json.JSONArray;
import sagex.remote.json.JSONObject;
import sagex.util.ILog;
import sagex.util.LogProvider;
import sagex.util.TypesUtil;

public class ScaleUtils {
	private static ILog log = LogProvider.getLogger(ScaleUtils.class);
	
	public static int[] getScaleFromRequest(HttpServletRequest req) {
		// check explicit scaling
		int scalex = TypesUtil.toInt(req.getParameter("scalex"),-1);
		int scaley = TypesUtil.toInt(req.getParameter("scaley"),-1);
		if (scalex >=0 || scaley >= 0) {
			return new int[] {scalex, scaley};
		}
		
		// check for json scale transform
		String tranform = req.getParameter("transform");
		if (tranform==null||tranform.trim().length()==0) {
			// no transform
			return null;
		}
		
		try {
			int scale[] = null;
            if (tranform.startsWith("[")) {
                JSONArray jarr = new JSONArray(tranform);
                for (int i=0;i<jarr.length();i++) {
                    scale = parseScale(jarr.getJSONObject(i));
                    if (scale!=null) break;
                }
            } else {
                if (!tranform.startsWith("{")) {
                    tranform = "{" + tranform + "}";
                }
                scale = parseScale(new JSONObject(tranform));
            }
            
            if (scale==null) {
            	throw new Exception("invalid transform");
            }
            
            return scale;
		} catch (Exception e) {
			log.warn("Failed to parse scale from tranform " + tranform);
		}
		
		// not transform
		return null;
	}

	private static int[] parseScale(JSONObject json) {
		if (json==null) return null;
		String name = json.optString("name");
		if (name==null||!name.equals("scale")) return null;
		int x = json.optInt("width", -1);
		int y = json.optInt("height", -1);
		return new int[] {x,y};
	}
	
	
}
