package sagex.remote;

import java.io.Serializable;

public class RemoteRequest implements Serializable {
	private static final long serialVersionUID = 2L;
	private String command;
	private String context;
	private Object[] parameters;

	public RemoteRequest() {
	}

	public RemoteRequest(String command, Object[] parameters) {
		this(null, command, parameters);
	}

	public RemoteRequest(String context, String command, Object[] parameters) {
		super();
		this.context = context;
		this.command = command;
		this.parameters = parameters;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public Object[] getParameters() {
		return parameters;
	}

	public void setParameters(Object[] parameters) {
		this.parameters = parameters;
	}

	public String getContext() {
		return context;
	}
	
	public String toString() {
		return String.format("Command: %s; Context: %s", command, context);
	}
}
