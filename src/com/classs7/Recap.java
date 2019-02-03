package com.classs7;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//String url = "http://toolsqa.com/iframe-practice-page/";
	String url = "http://toolsqa.com/automation-practice-switch-windows/";
	driver.get(url);
	
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//	WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='IF1']"));
//	//switch to the frame: id or name, webelement, index
//	driver.switchTo().frame(frame1);
	
//	driver.findElement(By.name("lastname")).sendKeys("Joe");
	
//	WebElement frame2 = driver.findElement(By.id("IF2"));
//  driver.switchTo().frame(frame2);
//	driver.findElement(By.linkText("Hello world!")).click();
	
	String windowID = driver.getWindowHandle();
	String mainWindow = driver.getTitle();
	
	System.out.println("Title of main window is "+mainWindow+"and ID is " +windowID);
	driver.findElement(By.cssSelector("button[id='button1']")).click();
	Set <String> allWindows = driver.getWindowHandles();
	
	System.out.println(allWindows.size());
	
	//iterator
	
	Iterator<String> it = allWindows.iterator();
	String mWindonw = it.next();
	String childWindow = it.next();
	
	driver.switchTo().window(childWindow);
	driver.manage().window().maximize();
	
	
	
}
}