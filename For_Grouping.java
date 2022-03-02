package com.demo_TestNG;

import org.testng.annotations.Test;

public class For_Grouping {
	@Test(groups = "Team CaptainAmerica" )
	public void captainAmerica() {
		System.out.println("Steve Roagers");
	}

	@Test(groups = "Team IronMan")
	public void blackWidow() {
		System.out.println("Natasha Ramonoff");
	}

	@Test(groups = "Team IronMan")
	public void ironMan() {
		System.out.println("Tony Stark");
	}
	
	@Test(groups = "Team IronMan")
	public void warMachin() {
		System.out.println("James Rhodes");
	}

	@Test(groups = "Team IronMan")
	public void blackPanter() {
		System.out.println("T'Chala");
	}

	@Test(groups = "Team CaptainAmerica" )
	public void antMan() {
		System.out.println("Scott Lang");
	}

	@Test(groups = "Team CaptainAmerica" )
	public void winterSoldier() {
		System.out.println("Bucky Barnes");
	}

	@Test(groups = "Team CaptainAmerica" )
	public void scarletWitch() {
		System.out.println("Wanda Maximaoff");
	}

	@Test(groups = "Team CaptainAmerica" )
	public void hawkeye() {
		System.out.println("Clint Barton");
	}

	@Test(groups = "Team IronMan")
	public void spiderMan() {
		System.out.println("Tom Holland");
	}
}
