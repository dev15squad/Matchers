package com.guerrero;

public class MyMatcher{
	
	private BindingResult bindingResult = null;
	
	public MyMatcher(BindingResult bindingResult) {
		this.bindingResult = bindingResult;
	}

	public Matcher notEmpty( SpringError error) {
		return new NotEmptyStringMatcher( bindingResult, error );
	}

	public void is(String value, Matcher matcher ) {
		matcher.verify( value );
	}

	public Matcher aNumber( SpringError error) {
		return new IsNumberMatcher( bindingResult, error );
	}

}
