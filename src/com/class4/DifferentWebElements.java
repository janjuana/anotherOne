package com.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentWebElements {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
	
	driver.findElement(By.name("firstname")).sendKeys("john");
	Thread.sleep(1000);
	driver.findElement(By.name("firstname")).clear();
	Thread.sleep(1000);
	driver.findElement(By.name("firstname")).sendKeys("Adam");
	
	
	WebElement txFName = driver.findElement(By.name("firstname"));
	txFName.sendKeys("Iris");
	txFName.clear();
	txFName.sendKeys("John");
	
}
}
