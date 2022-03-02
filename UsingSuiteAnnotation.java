package com.demo_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class UsingSuiteAnnotation {

	public WebDriver driver;
	long starttime;
	
	@BeforeSuite
	public void browseLaunch() {
		starttime = System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Maven_Demo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public void browserClose() {
		long endtime = System.currentTimeMillis();
		long totaltime = endtime - starttime;
		System.out.println(totaltime);
		
		driver.quit();
	}
	
	@Test
	public void startGoogle() {
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void startBing() {
		driver.get("https://www.bing.com/");
	}
	
	@Test
	public void startYahoo() {
		driver.get("https://in.search.yahoo.com/?fr2=inr");
	}

}
