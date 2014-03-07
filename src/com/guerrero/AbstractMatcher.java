package com.guerrero;

public class AbstractMatcher implements Matcher{

	BindingResult bindingResult = null;
	SpringError error = null;
	private boolean valid;
	
	
	void setError(SpringError error) {
		this.error = error;
	}


	void setBindingResult(BindingResult bindingResult) {
		this.bindingResult = bindingResult; 
	}
	

	protected SpringError getSpringError() {
		return this.error;
	}


	protected BindingResult getBindingResult() {
		return bindingResult;
	}


	@Override
	public void verify(String value) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValid() {
		return this.valid;
	}
	
	protected void setValid(boolean b) {
	 this.valid = b;	
	}
	

	protected void reject() {
		this.setValid( false );
		SpringError error = getSpringError();
		this.getBindingResult().rejectValue( error.getKey(), error.getId(), error.getDescription() );
	}



}
