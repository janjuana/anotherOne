package com.class8;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SwitchWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = "http://toolsqa.com";
		driver.get(url);

		
		WebElement demo= driver.findElement(By.xpath("//span[@class='text-wrap']//span[@class='menu-text'][contains(text(),'DEMO SITES')]"));
		WebElement switchWindow = driver.findElement(By.xpath("//span[@class='text-wrap']//span[@class='menu-text'][contains(text(),'Automation Practice Switch Windows')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(demo).click().perform();
		act.moveToElement(switchWindow).click().perform();
	
		
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		driver.findElement(By.xpath("//button[@onclick='newMsgWin()']")).click();
		driver.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
		
		
		Set <String> switcher = driver.getWindowHandles();
		
		Iterator <String> it = switcher.iterator();
		String mWindow = it.next();
		String cWindow = it.next();
		String cWindow2 = it.next();
		String cWindow3 = it.next();

			
		driver.switchTo().window(cWindow);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		driver.switchTo().window(mWindow);
		driver.switchTo().window(cWindow2);
		System.out.println(title);
		driver.close();
		
		driver.switchTo().window(mWindow);
		driver.switchTo().window(cWindow3);
		System.out.println(title);
		driver.close();
		
		
		
		
		
		
		
	}

}
