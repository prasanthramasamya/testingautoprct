package org.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleWindowsHandling {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement txtSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearchBox.sendKeys("iphone mobile",Keys.ENTER);
		
		WebElement bttnClick = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		
		bttnClick.click();
		
		String prtWidowId = driver.getWindowHandle();
		System.out.println(prtWidowId);
		
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);
		
		for (String string : allWindowId) {
			
			if (!allWindowId.equals(prtWidowId)) {
				driver.switchTo().window(string);
			}
		}
		
		WebElement bttnAddcart = driver.findElement(By.id("add-to-cart-button"));
		bttnAddcart.click();
		
	}

}
