package org.task2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://www.instagram.com/accounts/login/?hl=en) login page  ");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement textUserName = driver.findElement(By.xpath("//input[@name='username']"));
		textUserName.sendKeys("prasanth");

		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));

		txtPassword.sendKeys("prasdfff");
		WebElement butnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));

		butnSubmit.click();
		
	}

}
