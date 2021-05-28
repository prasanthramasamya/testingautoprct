package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleScrolDown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" http://toolsqa.com/ ");

		driver.manage().window().maximize();
		WebElement scrollDown = driver.findElement(By.xpath("//span[text()='Recent Articles']"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	}

}
