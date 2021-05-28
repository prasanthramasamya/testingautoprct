package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkark {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/ ");

		driver.manage().window().maximize();

		WebElement buttonCLsoe = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		buttonCLsoe.click();

		WebElement buttonLogin = driver.findElement(By.xpath("//a[text()='Login']"));
		buttonLogin.click();

		WebElement txtUserEMail = driver.findElement(By.xpath("(//input[@class='_2IX_2- VJZDxU'])"));
		txtUserEMail.sendKeys("9659132702");

		WebElement txtUserPass = driver.findElement(By.xpath("(//input[@class='_2IX_2- _3mctLh VJZDxU'])"));
		txtUserPass.sendKeys("flipe01");

		WebElement buttonLoginusr = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		buttonLoginusr.click();

	}

}
