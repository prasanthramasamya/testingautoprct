package org.task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonPrimeMover {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.amazon.in");

		driver.manage().window().maximize();

		
		Thread.sleep(4000);
		
		WebElement actionPrime = driver.findElement(By.xpath("//span[text()='Prime']"));
		
		WebElement actionPrimeClick = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/G/31/prime/NavFlyout/TryPrime/2018/Apr/IN-Prime-PIN-TryPrime-MultiBen-Apr18-400x400._CB442254244_.jpg']"));

		Actions ac= new Actions(driver);
		ac.moveToElement(actionPrime).perform();
		actionPrimeClick.click();
	}

}
