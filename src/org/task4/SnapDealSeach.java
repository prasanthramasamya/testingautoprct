package org.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealSeach {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://www.snapdeal.com/  ");

		driver.manage().window().maximize();

		WebElement textSearch = driver.findElement(By.name("keyword"));
		textSearch.sendKeys("silk sarees");
//		WebElement textSearchclick = driver.findElement(By.xpath("//span[text()='mens shirt']"));
//		textSearchclick.click();

	}
}
