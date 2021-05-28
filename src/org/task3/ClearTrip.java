package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/trains");

		driver.manage().window().maximize();

		WebElement textFrom = driver.findElement(By.xpath("(//input[@id='from_station'])"));
		textFrom.sendKeys("Chennai");

		WebElement textTo = driver.findElement(By.xpath("(//input[@id='to_station'])"));
		textTo.sendKeys("Salem");

		WebElement buttonSearch = driver.findElement(By.xpath("(//button[@id='trainFormButton'])"));

		buttonSearch.click();

	}
}
