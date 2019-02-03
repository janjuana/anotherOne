package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQaAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
	
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Nabs");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("jans");
		driver.findElement(By.xpath("//input[@id = 'sex-0']")).click();
		driver.findElement(By.xpath("//input[@id = 'exp-5']")).click();
		driver.findElement(By.xpath("//input[@id = 'datepicker']")).sendKeys("10/21/2018");
		
		WebElement chbox = driver.findElement(By.xpath("//input[@id = 'profession-0']"));
		
		if (!chbox.isSelected()) {
			chbox.click();
		}
		
		WebElement chbox4 = driver.findElement(By.xpath("//input[@id = 'profession-1']"));
		
		if (!chbox4.isSelected()) {
			chbox4.click();
		}
		
		WebElement chbox2 = driver.findElement(By.xpath("//input[@id = 'tool-1']"));
		if (!chbox2.isSelected()) {
			chbox2.click();
			chbox2.click();
		}
	
		
		
		WebElement chbox3 = driver.findElement(By.xpath("//input[@id = 'tool-2']"));
		if (!chbox3.isSelected()) {
			chbox3.click();
		}
		
		WebElement dropDown = driver.findElement(By.id("continents"));
		
		Select obj = new Select(dropDown);
		obj.selectByVisibleText("North America");
		
		WebElement dropDown2 = driver.findElement(By.id("selenium_commands"));
		
		Select obj2 = new Select(dropDown2);
		obj2.selectByVisibleText("Browser Commands");
		obj2.selectByVisibleText("Wait Commands");
	}

}
