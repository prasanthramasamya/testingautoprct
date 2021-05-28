package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICIBankLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://infinity.icicibank.com/corp/Login.jsp ");

		driver.manage().window().maximize();

		WebElement textUserNAme = driver.findElement(By.name("DUMMY1"));
		textUserNAme.sendKeys("23e2232");

		WebElement textPassWord = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));

		textPassWord.sendKeys("prtd34.");

	}

}
