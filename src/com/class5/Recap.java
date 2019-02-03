package com.class5;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Recap {

	    public static void main(String[] args) throws InterruptedException {
	        //to lock your computer window+l, ctrl+alt+delete

	        /*browser commands: get, getTitle,
	         * navigation commands: navigate.to, navigate.forward, navigate.back, navigate.refresh
	         * webElement commands: findElement, findElements
	         *                         texBox: clear, sendKeys
	         *                         checkBox, Radio -click, isSelected, isEnabled
	         *                         on all webElement - click, isDisplayed, getAttribute
	         */
	        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://toolsqa.com/automation-practice-form/");
	        //driver.manage().window().maximize();//maximize browser window
	        
	        WebElement radio=driver.findElement(By.id("sex-0"));
	        String radioName=radio.getAttribute("name");
	        String radioValue=radio.getAttribute("Value");
	        
	        System.out.println("The value of attribute name is "+radioName);
	        System.out.println("The value of attribute value is "+radioValue);
	        
	        /*working with DropDowns:
	         * 1. identify element
	         * 2. we use Select class IF drop down is written using <select> tag
	         * 3. drop downs: 1. single value, 2. multiple values
	         * */
	        //continent dd
	        WebElement dd1=driver.findElement(By.xpath("//select[@id='continents']"));
	        Select obj=new Select(dd1);
	        System.out.println(obj.isMultiple());
	        //to select values from the dd: 1. visibleText, 2.Index, 3. Value
	        obj.selectByVisibleText("Africa");
	        Thread.sleep(1000);
	        obj.selectByIndex(3);
	        Thread.sleep(1000);
	        
	        List<WebElement> ddvalues=obj.getOptions();
	        System.out.println(ddvalues.size());
	        //for loop, enhanced loop, iterator, while loop
	        
	        for (int i=0;i<ddvalues.size(); i++) {
	            ddvalues.get(i).click();
	            Thread.sleep(1000);
	        }
	        
	        		for (int i=0;i<ddvalues.size(); i++) {
	        		            String value=ddvalues.get(i).getText();
	        		            System.out.println(value);
	        		            ddvalues.get(i).click();
	        		            Thread.sleep(1000);
	        		        }
	        //obj.deselectByIndex(3);//will get an error You may only deselect options of a multi-select
	        //selenium commands dd
	        Select obj1=new Select(driver.findElement(By.cssSelector("select#selenium_commands")));
	        System.out.println(obj1.isMultiple());
	        obj1.selectByVisibleText("Switch Commands");
	        Thread.sleep(1000);
	        obj1.selectByIndex(4);
	        Thread.sleep(1000);
	        obj1.deselectByIndex(4);
	        
	        
	        
	        
	        
	        Thread.sleep(10000);
	        driver.quit();
	        
	        
	    }
	}

