package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyReg {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://www.swiggy.com/");

		driver.manage().window().maximize();

		WebElement bttnSignUp = driver.findElement(By.xpath("(//a[@class='r2iyh'])"));
		bttnSignUp.click();

		WebElement txtMblNo = driver.findElement(By.id("mobile"));

		txtMblNo.sendKeys("9659132702");

		WebElement txtName = driver.findElement(By.id("name"));

		txtName.sendKeys("Prasanth");

		WebElement txtEmail = driver.findElement(By.id("email"));

		txtEmail.sendKeys("prabhu@gmail.com");

		WebElement txtPass = driver.findElement(By.id("password"));

		txtPass.sendKeys("poss2468.");

		WebElement bttnCont = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		System.out.println(bttnCont + "Check Continue");
		bttnCont.click();

	}

}
