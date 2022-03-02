package com.demo_TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Test 
	@Parameters("Genos")
	public void saitama(String name) {
		System.out.println("Saitama's name is "+ name);
	}
	
}
