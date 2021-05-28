package org.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookPrint {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		driver.manage().window().maximize();
		
		WebElement textUserName = driver.findElement(By.id("email"));
		textUserName.sendKeys("facebook@gmail.com");
		String textUser = textUserName.getAttribute("value");
		System.out.println(textUser);
		

		WebElement textPassword = driver.findElement(By.id("pass"));

		textPassword.sendKeys("password");
		
		String txtpass = textPassword.getAttribute("value");
		System.out.println(txtpass);
		
		WebElement bttnSub = driver.findElement(By.xpath("//button[@value='1']"));
				
		bttnSub.click();
		
	}

}
