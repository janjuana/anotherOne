package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.xpath("//input[@id = 'sex-0']")).click();
		Thread.sleep(1000);
		WebElement radioM = driver.findElement(By.xpath("//input[@id ='sex-0']"));
		
		if (radioM.isEnabled()) {
			radioM.click();
		}
		
		if (radioM.isSelected()) {
			driver.findElement(By.xpath("//input[@value= 'Female']")).click();
			
		}
		
		driver.findElement(By.xpath("//input[@value= 'Manual Tester']")).click();
		
		WebElement chbox = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		if (!chbox.isSelected()) {
			chbox.click();
		}
		
		WebElement chbox2 = driver.findElement(By.xpath("//input[@value='QTP']"));
		if (!chbox2.isSelected()) {
			chbox2.click();
		}
		
		WebElement chbox3 = driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
		if (!chbox3.isSelected()) {
			chbox3.click();
		}
		
		WebElement chbox4 = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		if (!chbox4.isSelected()) {
			chbox4.click();
		}
		
		WebElement dropdownList = driver.findElement(By.xpath("//input[@class = 'continents']"));
		
		
	}

}
