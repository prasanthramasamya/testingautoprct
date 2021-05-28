package org.task5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");

		driver.manage().window().maximize();
		
		WebElement bttnsign = driver.findElement(By.xpath("//a[text()='Sign in']"));
		bttnsign.click();
		
		Thread.sleep(5000);
		
		Alert alt= driver.switchTo().alert();
		alt.accept();

	}

}
