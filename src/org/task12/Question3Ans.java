package org.task12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3Ans {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("http://greenstech.in/selenium-course-content.html");

	driver.manage().window().maximize();
	
	WebElement txtscrollDown = driver.findElement(By.id("heading304"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", txtscrollDown);
}
}
