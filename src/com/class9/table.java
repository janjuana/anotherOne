package com.class9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class table {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String url = "http://toolsqa.com/automation-practice-table/";
        driver.get(url);
        //find number of rows and columns in table
        List<WebElement>cols=driver.findElements(By.xpath("//table[@summary='Sample Table']/thead/tr/th"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr"));
        
        System.out.println("Number of columns: "+cols.size()+" number of rows: "+rows.size());
        
        for (int i = 1; i<rows.size(); i++) {
            WebElement row = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr["+i+"]"));
            String data = row.getText();
            System.out.println(data);
        }
        
        Thread.sleep(5000);
        driver.quit();
    

     
}
}