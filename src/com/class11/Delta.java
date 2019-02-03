package com.class11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delta {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String url = "https://www.delta.com";
        driver.get(url);
        //click on calendar
        driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();
        driver.manage().window().maximize();
        //capture departure monthText
       String depMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
        
        if (!depMonth.equals("February")) {
        	do {
        	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        	depMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
        }while(!depMonth.equals("February"));
        }
       
 List<WebElement> cells = driver.findElements(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
        
        for(WebElement cell:cells) {
            String data=cell.getText();
            if(data.equals("14")) {
                cell.click();
                break;
    	   }
       }
        
        String arrMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
        
        if (!depMonth.equals("April")) {
        	do {
        		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        		arrMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
        	}while (!arrMonth.equals("April"));
        }
	
	List<WebElement> cells2 = driver.findElements(By.xpath("//div[@class='dl-datepicker-group dl-datepicker-group-0']//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
        for(WebElement cell2: cells2) {
        	String data2 = cell2.getText();
        	if(data2.equals("14")) {
        		cell2.click();
        		break;
        	}
        }
	}
        	
	} 
	

