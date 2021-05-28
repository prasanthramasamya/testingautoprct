package org.task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WomensFlatSlipper {
	
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("http://www.flipkart.com");

			driver.manage().window().maximize();
			
			WebElement buttonCLsoe = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			buttonCLsoe.click(); 
			
			WebElement actionFashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
			Actions ac= new Actions(driver);
			ac.moveToElement(actionFashion).perform();
			
			WebElement actionFSHFoot = driver.findElement(By.xpath("//a[text()='Women Footwear']"));			
			ac.moveToElement(actionFSHFoot).perform();
			
			WebElement actionClick = driver.findElement(By.xpath("//a[text()='Women Flats']"));

			actionClick.click();
	}

}
