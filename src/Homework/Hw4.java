package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw4 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
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
		*/
	
		
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://Opensource-Demo.Orangehrmlive.com/");
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#btnLogin")).click();
		driver.findElement(By.cssSelector("#menu_pim_viewPimModule")).click();
		driver.findElement(By.cssSelector("#menu_pim_addEmployee")).click();
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Nabs");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Jans");
		
		WebElement checkBox = driver.findElement(By.cssSelector("#chkLogin"));
		if (!checkBox.isSelected()) {
			checkBox.click();
		}
		
		driver.findElement(By.cssSelector("#user_name")).sendKeys("janjuana1639");
		driver.findElement(By.cssSelector("#user_password")).sendKeys("jamjam32329");
		driver.findElement(By.cssSelector("#re_password")).sendKeys("jamjam32329");
		driver.findElement(By.cssSelector("#btnSave")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#btnSave")).click();
		driver.findElement(By.cssSelector("#personal_optGender_1")).click();
		
		WebElement national = driver.findElement(By.cssSelector("#personal_cmbNation"));
		Select national1 = new Select(national);

		national1.selectByVisibleText("Pakistani");
		driver.findElement(By.cssSelector("#btnSave")).click();
		
	}

}


