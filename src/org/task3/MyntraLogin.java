package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/ ");

		driver.manage().window().maximize();

		WebElement textUserName = driver.findElement(By.xpath("(//input[@class='form-control mobileNumberInput'])"));
		textUserName.sendKeys("9658776363");
		
		WebElement buttcont = driver.findElement(By.xpath("(//div[@class='submitBottomOption'])"));

		buttcont.click();
		
	}

}
