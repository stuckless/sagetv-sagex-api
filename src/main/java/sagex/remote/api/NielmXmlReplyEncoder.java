package sagex.remote.api;

import net.sf.sageplugins.sagexmlinfo.SageXmlWriter;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;

public class NielmXmlReplyEncoder extends XmlReplyEncoder {
    @Override
    public String encodeReply(Object o, HttpServletRequest req) throws Exception {
        SageXmlWriter xmlWriter = new SageXmlWriter();
        xmlWriter.add(o);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        xmlWriter.write(baos);
        baos.flush();
        baos.close();
        return baos.toString();
    }
}
