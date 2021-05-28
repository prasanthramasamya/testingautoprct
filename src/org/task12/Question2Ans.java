package org.task12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2Ans {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.com/");

		driver.manage().window().maximize();
		
		WebElement txtscrollDown = driver.findElement(By.xpath("//div[@class='share-link-description']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", txtscrollDown);
		Thread.sleep(3000);
		
		WebElement txtscrollUp = driver.findElement(By.xpath("//span[text()='Latest Tutorials']"));
		js.executeScript("arguments[0].scrollIntoView(false)", txtscrollUp);
	}

}
