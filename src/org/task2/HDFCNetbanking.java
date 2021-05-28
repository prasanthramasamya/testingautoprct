package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCNetbanking {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://netbanking.hdfcbank.com/");

		driver.manage().window().maximize();
		
		
		 WebElement txtUserId= driver.findElement(By.xpath("//input[@type='text']"));
		 
		 txtUserId.sendKeys("pras123");
		
	}

}
