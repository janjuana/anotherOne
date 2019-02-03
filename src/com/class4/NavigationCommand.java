package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://facebook.com");
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.get("http://facebook.com");
		Thread.sleep(1000);
		driver.navigate().back();
		
	}

}
