package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleRegister {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.manage().window().maximize();

		WebElement textFstName = driver.findElement(By.id("firstName"));

		textFstName.sendKeys("Prasanth");

		WebElement textLstName = driver.findElement(By.id("lastName"));

		textLstName.sendKeys("Ramasamy");

		WebElement textUsrName = driver.findElement(By.id("username"));

		textUsrName.sendKeys("RamasamyPrasanth707");

		WebElement textPass = driver.findElement(By.name("Passwd"));

		textPass.sendKeys("poss2468");

		WebElement textConPass = driver.findElement(By.name("ConfirmPasswd"));

		textConPass.sendKeys("poss2468");

		WebElement textCheckBox = driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']"));
		textCheckBox.click();

		WebElement buttonNext = driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]"));
		buttonNext.click();

		
		  WebElement textPhon =
		  driver.findElement(By.id("phoneNumberId"));
		  textPhon.sendKeys("9659132702");
		 

	}
}