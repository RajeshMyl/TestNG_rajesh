package com.demo_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Normal {
	WebDriver driver;

	@Test
	public void startGoogle() {
		long starttime = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Maven_Demo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();

		long endtime = System.currentTimeMillis();
		long totaltime = endtime - starttime;
		System.out.println(totaltime);
	}

	@Test
	public void startYahoo() {
		long starttime = System.currentTimeMillis();

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Maven_Demo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.quit();
		long endtime = System.currentTimeMillis();
		long totaltime = endtime - starttime;
		System.out.println(totaltime);
	}

	@Test
	public void startBing() {
		long starttime = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Maven_Demo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.quit();
		long endtime = System.currentTimeMillis();
		long totaltime = endtime - starttime;
		System.out.println(totaltime);
	}
}
