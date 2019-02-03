package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args)  {
	
	System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	/*driver.get("https://Opensource-Demo.Orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
	driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
	driver.findElement(By.xpath("//a[contains(text(), 'Add Emp')]")).click();
	
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nabeel");
	driver.findElement(By.xpath("//input[@id= 'lastName']")).sendKeys("Janjua");
	driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	*/
	
	driver.get("http://newtours.demoaut.com");
	driver.findElement(By.xpath("//a[contains(text(), 'REGISTER')]")).click();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Nabeel");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Janjua");
	driver.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("571-246-0246");
	driver.findElement(By.xpath("//input[@id = 'userName']")).sendKeys("Johnjoe@gmail.com");
	driver.findElement(By.xpath("//input[@name = 'address1']")).sendKeys("1000 Round Lick Lane");
	driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("Centreville");
	driver.findElement(By.xpath("//input[@name = 'state']")).sendKeys("VA");
	driver.findElement(By.xpath("//input[@name = 'postalCode']")).sendKeys("20120");
	driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("johnjoe3232");
	driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("ffffff2323");
	driver.findElement(By.xpath("//input[@name = 'confirmPassword']")).sendKeys("ffffff2323");
	driver.findElement(By.xpath("//input[@name = 'register']")).click();
}
}