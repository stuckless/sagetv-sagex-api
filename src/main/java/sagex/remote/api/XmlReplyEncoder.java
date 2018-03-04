package sagex.remote.api;

import sagex.remote.builder.SageAPIBuilder;
import sagex.remote.builder.SimpleXmlBuilder;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.StringWriter;

public class XmlReplyEncoder implements ReplyEncoder {
    public String encodeError(Exception ex) {
        StringWriter sw = new StringWriter();
        sw.append("<error sagex-version=\""+ sagex.api.Version.GetVersion() +"\">");
        sw.append("<message><![CDATA[").append(ex.getMessage()).append("]]></message>");
        sw.append("<exception><![CDATA[");
        ex.printStackTrace(new PrintWriter(sw));
        sw.append("]]></exception>");
        sw.append("</error>");
        sw.flush();
        return sw.toString();
    }

    public String encodeReply(Object o, HttpServletRequest req) throws Exception {
        SimpleXmlBuilder builder = new SimpleXmlBuilder();
        String inclOnly = req.getParameter("filter");
        SageAPIBuilder.INSTANCE.build("Result", o, builder, false, inclOnly == null ? null : inclOnly.split("\\|"));
        return builder.toString();
    }

    public String getContentType(HttpServletRequest req) {
        return "text/xml";
    }

}
