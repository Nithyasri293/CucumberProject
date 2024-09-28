package org.test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
   
		
	}
	public static void urlLaunch(String url) {
		driver.get(url);

	}
	public static String getTitle() {
		String title1 = driver.getTitle();
		return title1;
	}
	public static String currentUrl() {
		String cu = driver.getCurrentUrl();
		return cu;
	}
	public static void windowHandles() {
		String wh = driver.getWindowHandle();
	    Set<String> whs = driver.getWindowHandles();
	    for (String id : whs) {
	    	if (!id.equals(whs)) {
	    	driver.switchTo().window(id);
	    	}	
		}

	}
	
	public static void fillText(WebElement e,String value) {
		e.sendKeys(value);

	}
	public static void text(WebElement e,String d) {
		e.sendKeys(d);

	}
	
	public static void click(WebElement ele) {
		ele.click();

	}
	public static void click1(WebElement ele) {
		ele.click();

	}
	public static void click2(WebElement ele) {
		ele.click();

	}


}
