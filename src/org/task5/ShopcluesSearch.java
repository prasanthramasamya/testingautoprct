package org.task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopcluesSearch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.shopclues.com/wholesale.html ");

		driver.manage().window().maximize();

		WebElement actMouseS = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[27]"));

		Actions asc = new Actions(driver);

		asc.moveToElement(actMouseS).perform();

		Thread.sleep(2000);

		WebElement actionmouSlct = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		actionmouSlct.click();
	}

}
