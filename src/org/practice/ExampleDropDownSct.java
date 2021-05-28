package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleDropDownSct {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/ ");

		driver.manage().window().maximize();
		
		WebElement bttnLogin = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		bttnLogin.click();
		
		Thread.sleep(3000);
		WebElement txtFstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		txtFstName.sendKeys("Hiiiii");
		
		WebElement selectDay = driver.findElement(By.id("day"));
		Select select= new Select(selectDay);
		select.selectByVisibleText("5");
		
		WebElement slctMonth = driver.findElement(By.id("month"));
		Select sc= new Select(slctMonth);
		//sc.selectByVisibleText("Feb");
		
		List<WebElement> options = sc.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement webElement = options.get(i);
			
			String text = webElement.getText();
			
			System.out.println(text);
			
		}
		
		
		
		
	}

}
