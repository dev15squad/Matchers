package com.guerrero;

public class BindingResult {

	boolean hasError = false;
	
	public boolean hasErrors() {
		return hasError;
	}

	public void rejectValue(String key, String id, String description) {
		hasError = true;
	}

	public void reset() {
		this.hasError = false;
	}

}
