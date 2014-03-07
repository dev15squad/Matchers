package com.guerrero;

import java.util.regex.Pattern;

public class IsNumberMatcher extends AbstractMatcher{

	public IsNumberMatcher(BindingResult bindingResult, SpringError error) {
		this.bindingResult = bindingResult;
		this.error = error;
	}

	@Override
	public void verify(String value) {
		Pattern pattern = Pattern.compile("^\\d+$");
		if( value == null || pattern.matcher( value ).matches() == false ){
			reject();
		}
	}

}
