package com.mv;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {


	
	public static WebDriver driver;
	
	//click
	public static void click(WebElement element) {
	element.click();
	}

	//sendKeys
	public static void sendvalue(WebElement element,String value) {
		element.sendKeys(value);
	}

	//close
	public static void driverclose() {
		driver.close();
	}

	//quit
	public static void driverquit() {
		driver.quit();
	}

	//browser launch
	public static  WebDriver browserlaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+("\\Driver\\msedgedriver.exe"));
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		}
		return driver;
	}

	//get url
	public static void geturl(String url) {
	driver.get(url);
	}

	//navigate to
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
	//navigate back
	public static void navigateback() {
		driver.navigate().back();
	}
	//navigate forward
	public static void navigateforward() {
		driver.navigate().forward();
	}
	//referesh
	public static void referesh() {
		driver.navigate().refresh();
	}
	
	//frame
	public static void frame(WebElement element) {
		driver.switchTo().frame(element);
	}
	//frame out
	public static void frameout() {
		driver.switchTo().defaultContent();
	}
	
	//scroll down
	public static void scrolldown() {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,700)" );
	}
	
	//move
	public static void move(WebElement element) {
		 Actions a =new Actions(driver);
		a.moveToElement(element ).build().perform();
	}
	
	//drop down
	public static void dropdown(WebElement element , int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
		}

	//actions
public static void mouseOver(WebElement element) {
	
	Actions a = new Actions(driver);
	a.moveToElement(element).build().perform();
	a.click().build().perform();
	
	
}
}
