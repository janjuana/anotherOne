package Homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spirit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spirit.com");
		
		driver.findElement(By.xpath("//input[@id='departDate']")).click();
		
		String depMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		if (!depMonth.equals("May")) 
		do {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			depMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}while(!depMonth.equals("May"));
		
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement date : row1) {
			String rowdate = date.getText();
	
			if (rowdate.equals("31")) {
				date.click();
			}
		}
		
		driver.findElement(By.xpath("//input[@id='returnDate']")).click();
		
		String arriveMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		if (!arriveMonth.equals("August"))
			do {
				driver.findElement(By.xpath("//a[@title='Next']")).click();
				arriveMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			}while (!arriveMonth.equals("August"));
		
		List<WebElement> row2 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement date2 : row2) {
			String rowdate2 = date2.getText();
			if (rowdate2.equals("15")) {
				date2.click();
			}
			}
		
		
	}
}
