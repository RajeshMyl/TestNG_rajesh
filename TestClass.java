package com.demo_TestNG;

import org.testng.annotations.Test;

public class TestClass {
	@Test (priority = -1)
	public void startCar() {
		System.out.println("start the car");
	}
	@Test(priority = 0)
	public void putFirstGear() {
		System.out.println("First Gear");
	}
	@Test(priority = 1 , enabled = true)
	public void putSecondGear() {
		System.out.println("Second Gear");
	}
	@Test(priority = 2)
	public void putThirdGear() {
		System.out.println("Third Gear");
	}
	@Test(priority = 3)
	public void putFourthGear() {
		System.out.println("Fourth Gear");
	}
	
}
