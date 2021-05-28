package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleJavascriptExcu {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/ ");

		driver.manage().window().maximize();
		
		WebElement txtUsr = driver.findElement(By.id("email"));		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','hijava')", txtUsr);
		
		WebElement txtPss = driver.findElement(By.id("pass"));		
		JavascriptExecutor js2 =(JavascriptExecutor) driver;		
		js2.executeScript("arguments[0].setAttribute('value','pass')", txtPss);
		
		//driver.findElement(arg0)
	}

}
