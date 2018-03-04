package sagex.remote.api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sagex.SageAPI;
import sagex.remote.RemoteRequest;
import sagex.remote.SagexServlet.SageHandler;
import sagex.remote.factory.request.SageRPCRequestFactory;
import sagex.remote.json.JSONArray;
import sagex.remote.json.JSONException;
import sagex.remote.json.JSONObject;
import sagex.remote.media.MediaHandler;

/**
 * Process a request in the format
 * rpc?command=Cmd&1=arg1&2=arg2&context=xxx&start=1&size=20&encoder=json|xml|nielm
 * 
 * The response can either be json, xml or neilms sage writer
 * 
 * This Processor will completely serialize an objects/arrays comming back,
 * which means that there are limitions in how you can interact with the data,
 * ie, can't get an array of media files and then call sort on them after. In
 * those cases you'd need to sort on the client side
 * 
 * This handler will also list the available Api Calls as well, if you passing
 * search=all
 * 
 * @author seans
 * 
 */
public class ApiHandler implements SageHandler {
    public static final String        SAGE_RPC_PATH   = "api";
    private static final String       DEFAULT_ENCODER = "xml";

    Pattern apiPattern = Pattern.compile("([^\\.]+)\\.(.*)");
    Pattern servicePattern = Pattern.compile("([^:]+):(.*)");

    private JSONObject                jsonApi         = null;
    private List<JSONObject>          jsonApiList     = null;

    private Map<String, ReplyEncoder> encoders        = new HashMap<String, ReplyEncoder>();
    private ServiceFactory serviceFactory = null;

    public ApiHandler() {
        System.out.println("Sagex ApiServlet Created for version: " + sagex.api.Version.GetVersion());
        encoders.put(DEFAULT_ENCODER, new XmlReplyEncoder());
        encoders.put("json", new JsonReplyEncoder());
        encoders.put("nielm", new NielmXmlReplyEncoder());
        encoders.put("image", new ImageReplyEncoder());
        encoders.put("raw", new RawReplyEncoder());
        try {
            serviceFactory =new ServiceFactory();
        } catch (Throwable t) {
            System.out.println("sagex.api: Unable to load javascript service factory.  Javascript Services are now disabled.");
            t.printStackTrace();
        }
    }

    public void handleRequest(String args[], HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = null;

        // 1=Arg1&2=Arg2&3=Arg3&context=123
        String encoder = req.getParameter("encoder");
        boolean isImageReply = "image".equals(encoder);
      
        if (encoder == null || encoder.trim().length() == 0) encoder = DEFAULT_ENCODER;
        ReplyEncoder replyEncoder = encoders.get(encoder);

        // if jsoncallback is used (for jsonp) then assume the json encoder
        if (req.getParameter("jsoncallback")!=null) {
            replyEncoder=encoders.get("json");
        }

        if (!isImageReply) {
        	resp.setCharacterEncoding("UTF-8");
        	pw=resp.getWriter();
        }
        
        try {
            if (replyEncoder == null) {
                replyEncoder = encoders.get(DEFAULT_ENCODER);
                throw new IOException("Inavalid Reply Encoder: " + encoder);
            }

            String search = req.getParameter("q");
            if (search != null || req.getParameterMap().size()==0) {
                doApiSearch(search, req, resp, pw);
                return;
            }

            if (!isImageReply) resp.setContentType(replyEncoder.getContentType(req));
            
            String command = req.getParameter("command");
            if (command == null) command = req.getParameter("c");
            if (command == null || command.trim().length() == 0) {
                throw new IOException("Missing Command Argument; Use 'command' or 'c' to specify the command.");
            }

            // ui context, if it's used
            String context = req.getParameter("context");

            // parse the command parameters, ie, 1=xxx&2=xxx&3=xxx...
            List<String> argsList = new ArrayList<String>();
            for (int i = 1; i < 99; i++) {
                String v = req.getParameter(String.valueOf(i));
                if (v == null) break;
                // ensure that we allow "null" arguments
                if ("null".equalsIgnoreCase(v)) {
                    v=null;
                }
                argsList.add(v);
            }
            args = argsList.toArray(new String[argsList.size()]);
            
            Object oreply = null;
            
            String servicePackage = null;
            String serviceName = null;
            Matcher m = servicePattern.matcher(command);
            if (m.find()) {
                servicePackage = m.group(1);
                serviceName = m.group(2);
                oreply = callService(context, servicePackage, serviceName, args);
            } else {
                // parse the api from the command, if it exists, ie,
                // MediaFileAPI.GetMediaFiles
                String api = null;
                m = apiPattern.matcher(command);
                if (m.find()) {
                    api = m.group(1);
                    command = m.group(2);
                }
                oreply = callSageAPI(context, api, command, args);
            }            

            // do range checking....
            if (oreply != null && oreply.getClass().isArray()) {
                Object oArr[] = (Object[]) oreply;
                if (oArr.length > 0) {
                    int start = getInt(req, "start", 0);
                    int size = Math.min(getInt(req, "size", 50), oArr.length);
                    int end = Math.min(start + size, oArr.length);
                    oreply = Arrays.copyOfRange(oArr, start, end);
                }
            }

            if (isImageReply) {
            	try {
            		MediaHandler.writeSageImageFile(oreply, req, resp);
            	} catch (Throwable t) {
            		t.printStackTrace();
            		resp.sendError(500,"Image Failed: " + t.getMessage());
            	}
            } else {
	            // encode the reply
	            String reply = null;
	            try {
	                reply = replyEncoder.encodeReply(oreply, req);
	                String ctype = replyEncoder.getContentType(req);
	                if (reply!=null && ctype!=null) {
		            	resp.setContentType(ctype);
	                }
	            } catch (Exception e) {
	                reply = replyEncoder.encodeError(e);
	            }
	
	            // finally write it
	            if (reply != null) {
	            	pw.write(reply);
	            }
            }
        } catch (Exception e) {
        	if (pw!=null) pw.write(replyEncoder.encodeError(e));
        }
        if (pw!=null) pw.flush();
    }

    private Object callService(String context, String packageName, String serviceName, String[] args) {
        if (serviceFactory!=null) {
            try {
                return serviceFactory.callService(context, packageName, serviceName, args);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        throw new RuntimeException("Javascript Service Factory is disabled.");
    }

    private Object callSageAPI(String context, String api, String command, String args[]) {
        // find the command with the given signature
        RemoteRequest request = SageRPCRequestFactory.createRequest(context, api, command, args);

        System.out.printf("Calling: Api: %s; Command: %s;\n", api, command);

        // invoke the sage api
        Object oreply = null;
        if (request.getContext() != null) {
            oreply = SageAPI.call(request.getContext(), request.getCommand(), request.getParameters());
        } else {
            oreply = SageAPI.call(request.getCommand(), request.getParameters());
        }
        return oreply;
    }
    
    private void doApiSearch(String search, HttpServletRequest req, HttpServletResponse resp, PrintWriter pw) throws Exception {
        if (jsonApi == null) {
            // first time, build up the api index
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            copyStream(this.getClass().getResourceAsStream("JSONApiLookup.json"), baos);
            jsonApi = new JSONObject(baos.toString());
            jsonApiList = new LinkedList<JSONObject>();
            for (Iterator<String> s = jsonApi.keys(); s.hasNext();) {
                JSONObject o = jsonApi.optJSONObject(s.next());

                JSONArray arr = o.optJSONArray("methods");
                for (int i = 0; i < arr.length(); i++) {
                    jsonApiList.add(arr.getJSONObject(i));
                }
            }
            Collections.sort(jsonApiList, new Comparator<JSONObject>() {
                public int compare(JSONObject o1, JSONObject o2) {
                    try {
                        return o1.getString("name").compareTo(o2.getString("name"));
                    } catch (JSONException e) {
                        return 0;
                    }
                }
            });
        }

        pw.println("<head><title>Sage API - "+ sagex.api.Version.GetVersion() +"</title></head>");
        pw.println("<h1>Sage API - "+ sagex.api.Version.GetVersion() +"</h1>");
        pw.println("<style>");
        pw.println(".l{font-weight: bold;}");
        pw.println(".ll{font-weight: bold; font-style: italic;}");
        pw.println("</style>");
        pw.println("<table>");
        pw.println("<tr><td colspan=2><form method=get action=/sagex/api><input name=q><input type=submit value=Filter></form></td></tr>");
        pw.println("<tr><td class=l nowrap>Url Format:</td><td nowrap>/sagex/api?<b>command</b>=SAGE_COMMAND&<b>1</b>=arg1&<b>2</b>=arg2...&<b>start</b>=#&<b>size</b>=#&<b>context</b>=SAGE_UI_CONTEXT&<b>encoder</b>=xml|json|nielm|image|raw&<b>jsoncallback</b>=functionName&<b>filter</b>=Field1|Field2|Field3|...&<b>raw_content_type</b>=audio/x-mpegurl</td></tr>");
        pw.println("<tr><td class=ll>command</td><td>SageTV Command (can also use c= as a short form)</td></tr>");
        pw.println("<tr><td class=ll>start</td><td>If the return type is an array, start at this element (0 is the first element)</td></tr>");
        pw.println("<tr><td class=ll>size</td><td>If the return type is an array, return this # of elements</td></tr>");
        pw.println("<tr><td class=ll>context</td><td>SageTV UI Context (only needed for UI Commands)</td></tr>");
        pw.println("<tr><td class=ll>encoder</td><td>Which encoder to use for encoding the results. xml is default.</td></tr>");
        pw.println("<tr><td class=ll>jsoncallback</td><td>(json only) The callback function name if you want to return the result as a JSONP string rather than a normal JSON string</td></tr>");
        pw.println("<tr><td class=ll>filter</td><td>(json and xml only) A pipe(|) separated list of field names that will be returned.  When present ONLY field names matching the list supplied will be returned.</td></tr>");
        pw.println("<tr><td class=ll>raw_content_type</td><td>(raw only) Sets the content type reply header to the be value you specify here.</td></tr>");
        pw.println("<tr><td colspan=2><hr/></td></tr>");
        pw.println("<tr><td class=l>Example</td><td>/sagex/api?c=GetMediaFiles&start=10&size=20&filter=IsLocalFile|MediaTitle|MediaFileID</td></tr>");
        pw.println("<tr><td class=l>Example</td><td>/sagex/api?c=GetMediaFiles&1=T</td></tr>");
        pw.println("<tr><td class=l>Example</td><td>/sagex/api?c=GetMediaFiles&1=T&encoder=nielm</td></tr>");
        pw.println("<tr><td class=l>Example</td><td>/sagex/api?c=EvaluateExpression&1=Sort(GetMediaFiles(\"T\"),false,\"Intelligent\")</td></tr>");
        pw.println("<tr><td colspan=2><hr/></td></tr>");
        
        pw.println("<p><b><i>NOTE: If the command arg expects a sage object, such mediafile, ariing, playlist, channel, show, plugin, favorite, series, etc, then you can still pass a reference to sage object, using mediafile:MEDIAFILE_ID, airing:AIRING_ID, playlist:PLAYLIST_NAME, channel:CHANNEL_NUMBER, show:EXTERNAL_ID, series:SERIES_INFO_ID, favorite:FAVORITE_ID, plugin:PLUGIN_ID, playlist:PLAYLIST_NAME, widget:SYMBOL, etc.</i></b></p>");
        pw.println("<p>Example: /sages/api?c=IsMediaFileObject&1=mediafile:3231112");
        pw.println("<br/>");

        List<JSONObject> apis = null;
        
        if (search==null || "all".equals(search) || "*".equals("search") || "".equals(search)) {
            apis=jsonApiList;
        } else {
            apis = new LinkedList<JSONObject>();
            for (JSONObject j : jsonApiList) {
                if (j.getString("name").toUpperCase().contains(search.toUpperCase())) {
                    apis.add(j);
                }
            }
        }

        for (JSONObject j : apis) {
            dumpSageApi(j, pw);
        }

        pw.println("</table>");

        pw.flush();
    }

    private void dumpSageApi(JSONObject o, PrintWriter pw) throws Exception {
        pw.println("<tr><td colspan=2><h2>"+o.getString("name")+"</h2></td></tr>");
        pw.println("<tr><td class=l>Comment</td><td><pre>" + formatComment(o.getString("comment")) + "</pre></td></tr>");
        pw.println("<tr><td class=l>Args</td><td><ul>");
        JSONArray arr = o.getJSONArray("args");
        for (int i=0;i<arr.length();i++) {
            JSONObject arg = arr.getJSONObject(i);
            pw.println("<li><pre>" + (i+1) + "; " + arg.getString("varName")  + ":" + arg.getString("dataType") + "</pre></li>");
        }
        pw.println();
        pw.println("</ul></td></tr>");
        pw.println("<tr><td class=l>Return</td><td>" + o.getString("returnType") + "</td></tr>");
        pw.println("<tr><td colspan=2><hr/></td></tr>");
    }

    private String formatComment(String string) {
        if (string==null) return"";
        return string.replaceAll("\n", "<br/>");
    }

    private int getInt(HttpServletRequest req, String param, int defValue) {
        String v = req.getParameter(param);
        if (v == null || v.trim().length() == 0) {
            return defValue;
        }
        try {
            return Integer.parseInt(v);
        } catch (Exception e) {
            return defValue;
        }
    }

    public static void copyStream(InputStream is, OutputStream os) throws IOException {
        byte buf[];
        BufferedInputStream bis;
        BufferedOutputStream bos;
        buf = new byte[4096];
        bis = new BufferedInputStream(is);
        bos = new BufferedOutputStream(os);
        int s;
        while ((s = bis.read(buf)) > 0) {
            bos.write(buf, 0, s);
        }
        bos.flush();
        return;
    }
}
