package org.task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseOver {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.flipkart.com");

		driver.manage().window().maximize();

		WebElement buttonCLsoe = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		buttonCLsoe.click();

		WebElement actionHomeFurniture = driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));

		Actions ac = new Actions(driver);
		ac.moveToElement(actionHomeFurniture).perform();

		WebElement actmuseover = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[6]"));
		ac.moveToElement(actmuseover).perform();

		WebElement actionBathLine = driver.findElement(By.xpath("//a[text()='Bath linen']"));
		actionBathLine.click();
		Thread.sleep(2000);

		WebElement actionCliclPr = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[1]"));
		actionCliclPr.click();
	}
}
