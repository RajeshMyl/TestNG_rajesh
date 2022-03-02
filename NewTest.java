package com.demo_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.err.println("actuall test");
  }
  @BeforeMethod
  public void beforeMethod() {
  System.out.println("after 'BEFORE CLASS'");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after 'TEST'");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("after 'BEFORE TEST'");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after AFTER METHOD");
  }

  @BeforeTest (enabled = true)
  public void beforeTest() {
	  System.out.println("after 'BEFORE SUITE'");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after AFTER CLASS");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before everything");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after everything");
  }

}
