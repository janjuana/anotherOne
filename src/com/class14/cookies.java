package com.class14;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://Opensource-Demo.Orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.className("button")).click();
	Set<Cookie> cookies = driver.manage().getCookies();
	for (Cookie cookie:cookies) {
		System.out.println(cookie.getName());
	}
	
	driver.manage().deleteCookieNamed("PHPSESSID");
	Set<Cookie> cookies1 = driver.manage().getCookies();
	System.out.println(cookies1.size());
	}
	}
