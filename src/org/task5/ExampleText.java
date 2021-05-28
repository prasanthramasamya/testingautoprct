package org.task5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExampleText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		WebElement txtSrcBox = driver.findElement(By.name("q"));
		
		Actions ac = new Actions(driver);
		
		ac.keyDown(txtSrcBox, Keys.SHIFT).sendKeys(txtSrcBox, "facebook").keyUp(txtSrcBox, Keys.SHIFT).perform();

		
	}

}
