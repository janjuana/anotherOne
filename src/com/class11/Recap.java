package com.class11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String url = "https://Opensource-Demo.Orangehrmlive.com/";
        driver.get(url);
        
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        
        driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
        driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveList']")).click();
        driver.findElement(By.xpath("//ol//li[1]//img[1]")).click();
	}
}
