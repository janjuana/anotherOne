package com.class5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	public static void main(String[] args) throws InterruptedException
	{
		//implicit wait = findelement and findelements
		//explicit wait = webdriver wait class, fluen wait class
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://Opensource-Demo.Orangehrmlive.com/");
		//Thread.sleep(20);  // This is not a good way to synchronize 
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //Implicit wait is like a global wait,
		//everytime i use driver.findelement, this will be applicable for all of them and wait 20 seconds
		//before it throws an exception
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("btnLogin"))));
		
		driver.findElement(By.id("btnLogin")).click();
	}
	

}
