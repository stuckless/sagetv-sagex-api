package sagex.remote.xmlxbmc;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;

import net.sf.sageplugins.sagexmlinfo.SageXmlWriter;
import sagex.api.Database;
import sagex.remote.RemoteRequest;
import sagex.remote.RemoteResponse;

public class XmlEncoderHelper {

	static String[][] SORTING_OPTS=new String[][]{
		{"##AsSageTV##","sage"},
		{"Intelligent","intelligent"},
		{"GetAiringStartTime","date"},
		{"GetAiringTitle","title"},
		{"GetAiringChannelName","channel"},
		{"GetShowCategory","category"},
	};

	private static String determineObject(Object obj) {
		String s = "";
		
        if ( obj == null ) 
            return s;
        if (obj instanceof Collection)
            s = "Collection";
        else if (obj.getClass().isArray())
            s = determineObject((Object[])obj);
        else if (obj.getClass().isPrimitive())
            s = "primitive";
        else {
        	s = obj.getClass().getName();
        }

		return s;
	}
	
	private static String determineObject(Object[] obj) {
		return determineObject(obj[0]);
	}
	
	public static String createXmlResponse(String api, String command, RemoteRequest request, RemoteResponse response, String sortby, int maxlen, boolean reverse) {

		StringWriter sw = new StringWriter();
		PrintWriter writer = new PrintWriter(sw);

		// Start by grabbing the return for the call
		// Ideally I'd like this to handle sorting, filtering, and arrayLen
		Object retObj = response.getData();
		
		// Sort First
		if (sortby != "") {
			Boolean reverseObj = Boolean.valueOf(reverse);
			String sortvalue = "";
            for ( int i=0; i<SORTING_OPTS.length;i++){
                if ( SORTING_OPTS[i][1].equals(sortby)) {
                	sortvalue = SORTING_OPTS[i][0];
                }
            }

			try {
		        retObj = Database.Sort(retObj, reverseObj, sortvalue);
			} catch (Exception e) {
            	writer.println("<error>");
            	writer.println("Exception while processing servlet:\r\n"+e.toString());
            	e.printStackTrace(writer);
            	writer.println("</error>");
			}
		}
		
		// Limit to the maxlen if it exists (Not yet tested)
		if (maxlen < 999999) {
			if (retObj.getClass().isArray()){
				Object[] tempRet = (Object[])retObj;
				int arrLen = tempRet.length;
				if (arrLen > maxlen){
					Object[] tempArr = new Object[maxlen];
					for (int i=0;i<maxlen;i++) {
						tempArr[i] = tempRet[i];
					}
					retObj = (Object)tempArr;
				}
			}
		}
		
	    String objType = determineObject(retObj);
	    if ((objType == "primitive") || (objType == "java.lang.String")) {
			writeHeader(response, writer);
	    	// Simply return the value
	    	if (retObj.getClass().isArray()) {
	    		Object[] retArr = (Object[])retObj;
	    		int length = retArr.length;
	    		for (int i=0; i<length; i++) {
		    		writer.println("<value>"+retArr[i]+"</value>");
	    		}
	    	} else {
	    		writer.println("<value>"+retObj+"</value>");
	    	}
			writeFooter(response, writer);
	    } else if (objType.startsWith("sage") || (objType.matches("Collection"))) {
        	// Here we need to get the objects to pass in.  It needs to be an array of one of these types
        	// show, airing, mediafile, favorite, channel
        	try {
        		System.out.println("object type: " + objType);
        		System.out.println("object: " + retObj);
            	SageXmlWriter xmlWriter=new SageXmlWriter();
            	xmlWriter.add(retObj);
            	ByteArrayOutputStream baos = new ByteArrayOutputStream();
           		xmlWriter.write(baos);
           		baos.flush();
           		baos.close();
           		writer.write(baos.toString());
        		
           		/*
          		File tempfile = new File("tempResultFile.xml");
        		if (!tempfile.exists()) {
        			tempfile.createNewFile();
        		}
            	SageXmlWriter xmlWriter=new SageXmlWriter();
            	xmlWriter.add(retObj);
            	try {
            		xmlWriter.write(tempfile);
            	} catch ( SocketException e) {}
            	// Now copy the contents of the file to the writer
                BufferedReader bin=new BufferedReader(new FileReader(tempfile));
                try {
                	// Send info to writer
                	String sin;
                	while ((sin=bin.readLine()) != null) {
                		writer.println(sin);
                	}
                } finally {
                    bin.close();
                }
                */
        		
        	} catch (Exception e) {
        		System.out.println("Exception while processing");
            	System.out.println(e.toString());
            	e.printStackTrace();
            	writer.println("<error>");
            	writer.println("Exception while processing servlet:\r\n"+e.toString());
            	e.printStackTrace(writer);
            	writer.println("</error>");
            } catch (Throwable e) {
        		System.out.println("Exception while processing");
            	System.out.println(e.toString());
            	e.printStackTrace();
            	writer.println("<error>");
            	writer.println("Thrown Exception while processing servlet:\r\n"+e.toString());
            	e.printStackTrace(writer);
            	writer.println("</error>");
        	}
	    } else if (objType.startsWith("java.lang.")) {
			writeHeader(response, writer);
	    	// Simply return the value
	    	if (retObj.getClass().isArray()) {
	    		Object[] retArr = (Object[])retObj;
	    		int length = retArr.length;
	    		for (int i=0; i<length; i++) {
		    		writer.println("<value>"+retArr[i].toString()+"</value>");
	    		}
	    	} else {
	    		writer.println("<value>"+retObj.toString()+"</value>");
	    	}
			writeFooter(response, writer);
	    } else {
	    	// Tell them we didn't know what to do :(
	    	writer.println("<error>Couldn't determine how to handle a "+objType+"</error>");
	    }
		
		return sw.getBuffer().toString();
	}

	public static void writeHeader(RemoteResponse response, PrintWriter writer) {
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<response>");
		writer.println("<header>");
		if (response.hasError()) {
			writer.printf("<error code=\"%s\">\n", response.getErrorCode());
			writer.printf("<message><![CDATA[%s]]></message>\n", response.getErrorMessage());
			if (response.getException() != null) {
				writer.printf("<exception><![CDATA[%s]]></exception>\n", response.getException());
			}
			writer.println("</error>");
		}
		writer.println("</header>");
		writer.println("<body>");
	}

	public static void writeFooter(RemoteResponse response, PrintWriter writer) {
		writer.println("</body>");
		writer.println("</response>");
	}
}
