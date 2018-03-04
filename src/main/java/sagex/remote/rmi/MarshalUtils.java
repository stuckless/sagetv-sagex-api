package sagex.remote.rmi;

import java.io.*;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class MarshalUtils {
	public static final String ENCODING = "Latin1";

	public static String marshal(Object ser) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(ser);
		oos.flush();
		oos.close();

		return URLEncoder.encode(baos.toString(ENCODING), ENCODING);
	}

	public static Object unmarshal(String data) throws IOException, ClassNotFoundException {
		ByteArrayInputStream bais = new ByteArrayInputStream(URLDecoder.decode(data, ENCODING).getBytes(ENCODING));
		ObjectInputStream iis = new ObjectInputStream(bais);
		return iis.readObject();
	}
}
