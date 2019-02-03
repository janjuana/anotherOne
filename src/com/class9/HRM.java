package com.class9;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
        
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nabs");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Jan");
        driver.findElement(By.xpath("//input[@id='btnSave']")).click();
        
        driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
        java.util.List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
        
        for (int i =1; i<rows.size(); i++) {
        	WebElement row = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]"));
        	
        	String rowData = row.getText();
        	System.out.println(rowData);
        	
        	if (rowData.contains("John")) {
        		driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]/input")).click();
        	}
        }
        
        

        
	}

}
