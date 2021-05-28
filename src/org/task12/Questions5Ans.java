package org.task12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Questions5Ans {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");

		driver.manage().window().maximize();
		
		WebElement txtUsr = driver.findElement(By.id("username"));		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','hijava')", txtUsr);
		
		WebElement txtPass = driver.findElement(By.id("password"));	
		js.executeScript("arguments[0].setAttribute('value','hijava')", txtPass);
		
         Thread.sleep(3000);
		
		WebElement bttnLogin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", bttnLogin);
		
		
	}
	

}
