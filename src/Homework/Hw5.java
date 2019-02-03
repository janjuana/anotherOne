package Homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://Opensource-Demo.Orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.partialLinkText("Add Employee")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("leeban");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Janjuary");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
		
		Select obj = new Select(dropDown);
		obj.selectByVisibleText("Pakistani");
		
		WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='personal_cmbMarital']"));
		Select obj2 = new Select(dropDown2);
		obj2.selectByVisibleText("Single");
		
		driver.findElement(By.xpath("//label[@for='personal_txtLicExpDate']/following-sibling::img")).click();
		
		WebElement dropDown3 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select obj3 = new Select(dropDown3);
		obj3.selectByVisibleText("Nov");
		
		WebElement dropDown4 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select obj4 = new Select (dropDown4);
		obj4.selectByVisibleText("2018");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//td"
				));
		
		for (WebElement date : rows) {
			String rowdate = date.getText();
			
			if (rowdate.equals("15")) {
				date.click();
			}
		}
		
		
		driver.findElement(By.xpath("//label[@for='personal_DOB']/following-sibling::img")).click();
		
		WebElement dropDown5 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select obj5 = new Select(dropDown5);
		obj5.selectByVisibleText("Nov");
		
		WebElement dropDown6 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select obj6 = new Select(dropDown6);
		obj6.selectByVisibleText("1992");
		
		List<WebElement> rows2 = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody//td"));
		
		for (WebElement date2: rows2) {
			String rowdate2 = date2.getText();
			
			if (rowdate2.equals("3")) {
				date2.click();
			}
		}
		
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
		
		List<WebElement> rows3 = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
		for (int i =1; i <=rows3.size(); i++) {
					
			WebElement rows4 = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+ i +"]"));
            String data4 = rows4.getText();
            
            
            if (data4.contains("0018")) {
            	driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+ i +"]/td[1]/input")).click();
            	driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
            	driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();	
			}
		}
	}
	
	}


