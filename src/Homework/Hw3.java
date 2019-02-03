package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://Opensource-Demo.Orangehrmlive.Com/");
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#btnLogin")).click();
		
		driver.findElement(By.cssSelector("#menu_pim_viewPimModule")).click();
		driver.findElement(By.cssSelector("#menu_pim_addEmployee")).click();
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Nabs");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Jan");
		driver.findElement(By.cssSelector("#btnSave")).click();
		*/
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[contains(text(), 'REGISTER']")).click();
		driver.manage().window().maximize();
		
		
		
	}
}
