package org.jdna.sage.api.generator;

/**
 * Manages the specifics for SageTV api Rules
 * 
 * @author sean
 */
public class APIRule {
	private String api;
	private String renameTo;

	private String returnType;

	public APIRule(String api) {
		this.api=api;
	}
	
	public String getAPI() {
		return api;
	}
	
	public APIRule renameTo(String newName) {
		this.renameTo = newName;
		return this;
	}
	
	public String getRenameTo() {
		return renameTo;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

}
