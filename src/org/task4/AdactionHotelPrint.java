package org.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactionHotelPrint {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" http://adactinhotelapp.com/ ");

		driver.manage().window().maximize();
		
		WebElement textUserName = driver.findElement(By.id("username"));
		textUserName.sendKeys("GRT");
		
		String txtusprint = textUserName.getAttribute("value");
		System.out.println(txtusprint);
		
		WebElement txtPassword= driver.findElement(By.id("password"));
		txtPassword.sendKeys("wweqwe");
		
		String txpass = txtPassword.getAttribute("value");
		
		System.out.println(txpass);
		
		WebElement txtlogin= driver.findElement(By.id("login"));
		txtlogin.click();
		
}

}
