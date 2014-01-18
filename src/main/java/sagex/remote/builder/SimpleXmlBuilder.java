package sagex.remote.builder;

import java.io.PrintWriter;
import java.io.StringWriter;

public class SimpleXmlBuilder implements BuilderHandler {
    private StringBuilder sb = new StringBuilder();
    
    public SimpleXmlBuilder() {
    }

    public void handleField(String name, Object data) {
        sb.append("    ").append("<").append(name).append(">");
        if (data==null) {
            sb.append("");
        } else if (data.getClass().isPrimitive() || Number.class.isAssignableFrom(data.getClass()) || Boolean.class.isAssignableFrom(data.getClass())) {
            sb.append(data);
        } else {
            sb.append("<![CDATA[").append(data).append("]]>");
        }
        sb.append("</").append(name).append(">\n");
    }

    public void beginArray(String name, int size) {
        sb.append("<").append(name).append(" size=\"").append(size).append("\">");
    }

    public void endArray(String name) {
        sb.append("</").append(name).append(">");
    }

    public void beginObject(String name) {
        sb.append("<").append(name).append(">");
    }

    public void endObject(String name) {
        sb.append("</").append(name).append(">\n");
    }

    public void handleError(String message, Exception e) throws Exception {
        beginObject("error");
        handleField("message", message);
        if (e!=null) {
        	if (e instanceof BuilderException) {
        		if (((BuilderException)e).getData()!=null) {
	        		handleField("class", ((BuilderException)e).getData().getClass().getName());
	        		handleField("data", ((BuilderException)e).getData());
        		}
        	}
        	// don't dump stack traces
        	//StringWriter sw = new StringWriter();
        	//e.printStackTrace(new PrintWriter(sw));
        	handleField("exception", e.getMessage());
        }
        endObject("error");
    }

    public String toString() {
        return sb.toString();
    }
}
