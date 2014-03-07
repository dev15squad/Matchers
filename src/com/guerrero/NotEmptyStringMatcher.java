package com.guerrero;

public class NotEmptyStringMatcher extends AbstractMatcher implements Matcher{

	public NotEmptyStringMatcher(BindingResult bindingResult, SpringError error) {
		this.setBindingResult( bindingResult );
		this.setError( error );
	}

	@Override
	public void verify(String value) {
		if( value == null || value.length() == 0 ){
			reject(); 
		}
	}



}
