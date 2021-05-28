package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsSQA {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" http://toolsqa.com/automation-practice-form/ ");

		driver.manage().window().maximize();

		WebElement txtFrstNm = driver.findElement(By.xpath("//input[@id='firstName']"));
		txtFrstNm.sendKeys("PRS");

		WebElement txtLstNm = driver.findElement(By.xpath("//input[@id='lastName']"));
		txtLstNm.sendKeys("PRS");

		WebElement txtUsrEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		txtUsrEmail.sendKeys("PRS@gmail.com");

//		WebElement txtGndr = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
//		txtGndr.click();

		WebElement txtNmb = driver.findElement(By.xpath("//input[@id='userNumber']"));
		txtNmb.sendKeys("9876543210");

//		WebElement txtChkbx1 = driver.findElement(By.xpath("//input[@value='1']"));
//		txtChkbx1.click();
//		
//		WebElement txtChkbx3 = driver.findElement(By.xpath("//input[@value='3']"));
//		txtChkbx3.click();

		WebElement txtCurrentAdd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		txtCurrentAdd.sendKeys("Chennai,Thoraipakkam");

	}

}
