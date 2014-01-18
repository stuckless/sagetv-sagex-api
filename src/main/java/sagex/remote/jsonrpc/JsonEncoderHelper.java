package sagex.remote.jsonrpc;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Vector;

import sagex.remote.RemoteObjectRef;
import sagex.remote.RemoteRequest;
import sagex.remote.RemoteResponse;

public class JsonEncoderHelper {

	public static String createJsonResponse(String api, String command, RemoteRequest request, RemoteResponse response) {
		StringWriter sw = new StringWriter();
		PrintWriter writer = new PrintWriter(sw);

		writeHeader(response, writer);

		// --- write body contents

		Object data = response.getData();

		encodeJsonData(data, writer);

		// --- end body contents

		writeFooter(response, writer);

		return sw.getBuffer().toString();
	}

	public static void encodeJsonData(Object data, PrintWriter writer) {
		if (data==null) {
            writer.println(" null");
		    return;
		}

		writer.println();
		if (data instanceof RemoteObjectRef) {
			RemoteObjectRef ref = (RemoteObjectRef) data;
            writer.printf("  { \"objectRef\" : { \"ref\" : \"%s\" } }\n", ref.getId());
		} else if (data.getClass().isArray()) {
			Object arr[] = (Object[]) data;
			if (RemoteObjectRef.class.isAssignableFrom(arr.getClass().getComponentType())) {
                writer.printf("  { \"arrayRef\" : { \"ref\" : \"%s\", \"size\" : \"%s\" } }\n", ((RemoteObjectRef)arr[0]).getId(), arr.length);
			} else {
                writer.println("  {");
                writer.println("    \"array\" :");
                writer.println("    [");
				for (int i = 0; i < arr.length; i++) {
                    writer.printf("      { \"value\" : \"%s\" }", arr[i]);
					if (i < arr.length - 1) {
					    writer.printf(",");
					}
					writer.println();
				}
                writer.println("    ]");
                writer.println("  }");
			}
		} else if (data instanceof Vector) {
			// you need to handle vectors and collections...
			Vector vect = (Vector) data;
            writer.printf("  { \"array\" :\n");
            writer.printf("    [\n");
			for (int i = 0; i < vect.size(); i++) {
                writer.printf("      { \"value\" : \"%s\" }", vect.get(i));
                if (i < vect.size() - 1) {
                    writer.printf(",");
                }
                writer.println();
			}
            writer.println("    ]");
            writer.println("  }");
		} else {
			writer.printf("  { \"value\" : \"%s\" }\n", data);
		}
	}

	public static void writeHeader(RemoteResponse response, PrintWriter writer) {
        writer.println("{");
		if (response.hasError()) {
	        writer.println("  \"header\" :");
			writer.println("  {");
            writer.println("    \"error\" :");
            writer.println("    {");
            writer.printf ("      \"code\" : \"%s\",\n", response.getErrorCode());
			writer.printf ("      \"message\" : \"%s\"\n", response.getErrorMessage());
			if (response.getException() != null) {
			    writer.println("      ,");
				writer.printf ("      \"exception\" : \"%s\"\n", response.getException());
			}
            writer.println("    }");
            writer.println("  },");
		} else {
	        writer.println("  \"header\" : null,");
		}
        writer.print("  \"body\" :");
	}

	public static void writeFooter(RemoteResponse response, PrintWriter writer) {
        writer.println("}");
	}
}
