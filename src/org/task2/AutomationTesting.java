package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" http://demo.automationtesting.in/Register.html ");

		driver.manage().window().maximize();

		WebElement txtFirstNmae = driver.findElement(By.xpath("//input[@type='text'][1]"));

		txtFirstNmae.sendKeys("Prasanth");

		WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLastName.sendKeys("Ramasamy");

		WebElement txtAddrs = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtAddrs.sendKeys("Ramasamy");

		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("Ramasamy@gmail.com");

		WebElement txtPhnNo = driver.findElement(By.xpath("//input[@type='tel']"));
		txtPhnNo.sendKeys("9659132702");

		WebElement txtradioGender = driver.findElement(By.xpath("//input[@value='Male']"));
		txtradioGender.click();

		WebElement txtCheckBox = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		txtCheckBox.click();

		WebElement txtCheckBox2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		txtCheckBox2.click();

		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		txtPassword.sendKeys("qwerty123");

		WebElement txtCmfrmPass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		txtCmfrmPass.sendKeys("qwerty123");

		WebElement buttonSubmit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		buttonSubmit.click();

	}

}
