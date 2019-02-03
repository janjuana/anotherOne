package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\JAR Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
		String actualTitle = driver.getTitle();
		String predictedTitle = "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
		
		
		if (predictedTitle.equals(actualTitle)) {
			driver.findElement(By.className("gh-eb-li-a")).click();
			driver.findElement(By.id("CreateAnAccount")).click();
			driver.findElement(By.id("firstname")).sendKeys("Nabs");
			driver.findElement(By.id("lastname")).sendKeys("Jan");
			driver.findElement(By.id("email")).sendKeys("johnson@gmail.com");
			driver.findElement(By.id("PASSWORD")).sendKeys("cool1234");
			driver.findElement(By.cssSelector("#ppaFormSbtBtn")).click();
		}
		
		else {
			System.out.println("wrong title");
		}
	}
}
