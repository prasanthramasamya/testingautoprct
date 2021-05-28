package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyLocat {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://www.swiggy.com/");

		driver.manage().window().maximize();
		
	WebElement txtLocationName= driver.findElement(By.id("location"));
	
	txtLocationName.sendKeys("Thoraipakkam");
	
	}

}
