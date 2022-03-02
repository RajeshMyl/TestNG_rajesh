package com.demo_TestNG;

import org.testng.annotations.Test;
public class BasicDepant {
	@Test
	public void babur() {
		System.out.println("1st Mughal Emperor");
	}
	@Test (dependsOnMethods = "babur" )
	public void humayun() {
		System.out.println("2nd Mughal Emperor");
	}
	@Test(dependsOnMethods = "humayun",enabled = false)
	public void akbar() {
		System.out.println("3rd Mughal Emperor");
	}
	@Test (dependsOnMethods = "akbar")
	public void jahangir() {
		System.out.println("4th Mughal Emperor");
	}
	
	
	
	
	
	
}
