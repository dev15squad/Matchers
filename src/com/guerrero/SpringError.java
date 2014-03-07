package com.guerrero;

public class SpringError {
	
	private String key = null; 
	private String id = null; 
	private String description = null; 

	public SpringError(String key, String id, String description ) {
		this.key = key;
		this.id = id;
		this.description = description;
	}

	public String getId() {
		return this.id;
	}

	public String getDescription() {
		return description;
	}

	public String getKey() {
		return key;
	}

}
