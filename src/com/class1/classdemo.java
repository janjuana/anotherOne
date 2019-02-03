package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class classdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriver driver = new WebDriver();
		
		//web driver is an interface, we cannot create an obj of an interface
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JAR Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("http://Amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		
	
	}

}
