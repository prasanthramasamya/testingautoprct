package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusLogin {
	 public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get(" https://www.redbus.in/ ");

			driver.manage().window().maximize();
			
			WebElement textUserName = driver.findElement(By.id("src"));
			textUserName.sendKeys("salem");

			WebElement textPassword = driver.findElement(By.id("dest"));

			textPassword.sendKeys("chennai");
	}

}
