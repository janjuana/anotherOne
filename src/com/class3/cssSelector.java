package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JAR Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.findElement(By.cssSelector(cssSelector))
	}

}
