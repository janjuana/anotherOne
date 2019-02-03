package com.class6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
public static void main(String[] args) throws InterruptedException {
	/*System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "http://rediff.com";
	driver.get(url);
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	driver.findElement(By.xpath("//input[@title = 'Sign in']")).click();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	String alertText = alert.getText();
	System.out.print("Text on alert is " + alertText);
	Thread.sleep(10000);
	alert.accept(); 
	*/
	
	System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.facebook.com";
	driver.get(url);
	driver.findElement(By.cssSelector("#email")).sendKeys("janjua_18@hotmail.com");
	driver.findElement(By.cssSelector("#pass")).sendKey
	driver.findElement(By.cssSelector("#loginbutton")).click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	driver.findElement(By.cssSelector("#userNavigationLabel")).click();

	
	
	/*driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[text()='Review Change']")).click();

	
	String alertText = alert.getText();
	
	if (alertText.equals("If you're happy with the new name, please enter your password:"));
	{
		alert.sendKeys("Yes");
	}
	*/
	
}
}
