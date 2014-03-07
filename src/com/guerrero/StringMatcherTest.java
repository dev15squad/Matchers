package com.guerrero;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringMatcherTest {
	
	private MyMatcher myMatcher = null;
	private BindingResult bindingResult = null;
		
	@Before
	public void setUp(){
		bindingResult = new BindingResult();
		myMatcher = new MyMatcher( bindingResult );
	}

	@Test
	public void emptyStringMatcher() {
		String value = "";
		SpringError error = new SpringError( "error.code", "error.location", "error.description " );
		myMatcher.is( value, myMatcher.notEmpty( error ) );
		assertEquals( "error should have been detected", true, bindingResult.hasErrors() );
	}
	
	
	@Test
	public void nullStringMatcher() {
		String value = null;
		SpringError error = new SpringError( "error.code", "error.location", "error.description " );
		myMatcher.is( value, myMatcher.notEmpty( error ) );
		assertEquals( "error should have been detected", true, bindingResult.hasErrors() );
	}
	
	@Test
	public void notEmptyStringMatcher() {
		String value = "1";
		SpringError error = new SpringError( "error.code", "error.location", "error.description " );
		myMatcher.is( value, myMatcher.notEmpty( error ) );
		assertEquals( "error should have been detected", false, bindingResult.hasErrors() );
	}
		
	@Test
	public void invalidNumberMatcher() {
		String value = "x";
		SpringError error = new SpringError( "error.code", "error.location", "error.description " );
		myMatcher.is( value, myMatcher.aNumber( error ) );
		assertEquals( "error should have been detected", true, bindingResult.hasErrors() );
	}
	
		
	@Test
	public void validNumberMatcher() {
		String value = "3";
		SpringError error = new SpringError( "error.code", "error.location", "error.description " );
		myMatcher.is( value, myMatcher.aNumber( error ) );
		assertEquals( "error should have been detected", false, bindingResult.hasErrors() );
	}
	
	
	


}
