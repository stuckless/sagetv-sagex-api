package sagex.remote;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;

public class RemoteResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	private Object data;
	private int errorCode = 0;
	private String errorMessage;
	private String exceptionString;

	public RemoteResponse() {
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public RemoteResponse(Object data) {
		super();
		this.data = data;
	}

	public void setError(int i, String msg, Throwable t) {
		this.errorCode = i;
		this.errorMessage = msg;
		StringWriter sw = new StringWriter();
		t.printStackTrace(new PrintWriter(sw));
		exceptionString = sw.getBuffer().toString();
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getException() {
		return exceptionString;
	}

	public boolean hasError() {
		return errorCode != 0;
	}
}
