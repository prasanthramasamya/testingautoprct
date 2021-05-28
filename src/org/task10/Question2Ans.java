package org.task10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2Ans {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement searchTxt = driver.findElement(By.id("inputValEnter"));
		searchTxt.sendKeys("iphones 7",Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement bttnClick = driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
		bttnClick.click();
		
		String prtId = driver.getWindowHandle();
		System.out.println(prtId);
		
		Set<String> AllIds = driver.getWindowHandles();
		
		System.out.println(AllIds);
		
		
		for (String string : AllIds) {
			
			if (!prtId.equals(AllIds)) {
				
				driver.switchTo().window(string);
			}
		}
		WebElement bttnaddCart = driver.findElement(By.id("add-cart-button-id"));
		bttnaddCart.click();
		
		WebElement printAmount = driver.findElement(By.xpath("//div[@class='you-pay']"));
		
		String s1 = printAmount.getText();
		
		System.out.println(s1);
	}

}
