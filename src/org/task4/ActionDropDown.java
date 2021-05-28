package org.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/");

		driver.manage().window().maximize();

		WebElement actionCourse = driver.findElement(By.xpath("//a[text()='COURSES']"));

		WebElement actionOracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));

		WebElement bttnclick = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Training']"));
	
	Actions ac= new Actions(driver);
	ac.moveToElement(actionCourse).perform();
	ac.moveToElement(actionOracle).perform();

	bttnclick.click();
	
	
	
	}

}
