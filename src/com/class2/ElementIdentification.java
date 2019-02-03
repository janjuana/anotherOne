package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIdentification {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JAR Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedTitle = "Facebook - Log In or Sign Up";
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
		
		//if html has Id, selenium can use Id tag locator
	
		driver.findElement(By.name("email")).sendKeys("janjua_18@hotmail.com");
		driver.findElement(By.id("pass")).sendKeys("Leeban1man");
		driver.findElement(By.id("u_0_2")).click();
		
		
		//if no Id, the next locator would be name. 
		}
		
		else 
			driver.quit();
	
	}

}
