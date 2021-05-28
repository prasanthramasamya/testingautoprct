package org.task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomedoptMouseover {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.homedepot.com/");

		driver.manage().window().maximize();

		WebElement actionAllDpt = driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		
		Actions acs= new Actions(driver);
		
		acs.moveToElement(actionAllDpt).perform();
		
		WebElement actionProdMs = driver.findElement(By.xpath("(//a[@title='Heating & Cooling'])[1]"));
		
		acs.moveToElement(actionProdMs).perform();
		
		
		WebElement actionSubProductms = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		
		acs.moveToElement(actionSubProductms).perform();
		
		WebElement actionPrdClick = driver.findElement(By.xpath("(//a[text()='Portable Air Conditioners'])[1]"));
		
		actionPrdClick.click();
		
	}

}
