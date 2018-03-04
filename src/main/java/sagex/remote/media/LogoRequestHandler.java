package sagex.remote.media;

import sagex.api.ChannelAPI;
import sagex.api.Global;
import sagex.util.TypesUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Resolves the logo and writes it
 * @author seans
 *
 */
public class LogoRequestHandler implements SageMediaRequestHandler {
	static private final Map<String, Object> CHAN_CACHE = new HashMap<String, Object>();
	
    public void processRequest(HttpServletRequest req, HttpServletResponse resp, Object logo) throws Exception {
    	String type = req.getParameter("type");
    	if (type!=null&&type.trim().length()>0) {
    		// use new api
    		Object chan = CHAN_CACHE.get(logo.toString());
    		if(chan == null) {
    			for(Object c : ChannelAPI.GetAllChannels()) {
    				if(ChannelAPI.GetChannelName(c).equals(logo.toString())) {
    					CHAN_CACHE.put(logo.toString(), c);
    					chan = c;
    					break;
    				}
    			}
    		}
    		Object img = chan != null ? ChannelAPI.GetChannelLogo(chan, type, TypesUtil.toInt(req.getParameter("index"),0), TypesUtil.toBoolean(req.getParameter("fallback"), true)) : null;
    		MediaHandler.writeSageImageFile(img, req, resp);
    	} else {
    		Object l = Global.GetLogo((String)logo);
    		if (l==null) {
    			l = ChannelAPI.GetChannelLogo(ChannelAPI.GetChannelForStationID(TypesUtil.toInt((String)logo, 0)));
    		}
    		MediaHandler.writeSageImageFile(l, req, resp);
    	}
    }
}
