package com.class8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = "http://toolsqa.com";
		//String url = "https://jqueryui.com/droppable";
		//String url = "http://jqueryui.com/resources/demos/droppable/default.html";
		driver.get(url);
		
	/*	WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		//identify element we want to drag and drop then 
		//drag and drop using the action class
		
		Thread.sleep(5000);
		driver.quit();
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		driver.switchTo().defaultContent();
		List frames = driver.findElements(By.tagName("iframe"));
		int numFrames = frames.size();
		System.out.println(numFrames);
		
		*/
		
		WebElement demo = driver.findElement(By.xpath("//span[contains(@class,'text-wrap')]//span[contains(@class,'menu-text')][contains(text(),'DEMO SITES')]"));
		WebElement alertOption = driver.findElement(By.xpath("//span[contains(@class,'text-wrap')]//span[contains(@class,'menu-text')][contains(text(),'Handling Alerts using Selenium WebDriver')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(demo).click().perform();
		act.moveToElement(alertOption).click().perform();
		
		
		driver.findElement(By.xpath("//button[@onclick='pushAlert()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@onclick='pushConfirm()']")).click();
		alert.accept();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@onclick='promptConfirm()']")).click();
		alert.sendKeys("Yes");
		alert.accept();

		
		
	}
}
