package sagex.remote.builder;

public class BuilderException extends Exception {
	private String field;
	private Object data;

	public BuilderException(String fld, Object data) {
		super("Cannot Serialize [Field: " + fld + ", Type: " + data.getClass().getName() + " ToString: " + data +"]");
		this.field=fld;
		this.data=data;
	}

	public String getField() {
		return field;
	}

	public Object getData() {
		return data;
	}
}
