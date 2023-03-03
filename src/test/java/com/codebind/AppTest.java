package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;



public class AppTest {

	@Test
	public void test() {
		App test = new App() ;
		String output = test.sample(); 
		assertEquals("yes",output);
		
	}

}
