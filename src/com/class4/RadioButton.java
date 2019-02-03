package com.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
	
	driver.findElement(By.cssSelector("#sex-0")).click();
	List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
	radio.size();
	radio.get(0).click();
	String value = radio.get(0).getAttribute("value");
	for (int i = 0; i<=radio.size(); i++) {
	if (value.equalsIgnoreCase("Male")) {
	radio.get(i).click();
	Thread.sleep(1000);
	
	}
	}
	}
}
