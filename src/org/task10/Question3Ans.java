package org.task10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3Ans {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		WebElement searchtxtbox = driver.findElement(By.id("headerSearch")); 
		searchtxtbox.sendKeys("celling fan",Keys.ENTER);
		
		WebElement butnnCLick = driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[1]"));
		
		butnnCLick.click();
		Thread.sleep(3000);
		String prtId = driver.getWindowHandle();
		System.out.println(prtId);
		
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		for (String string : allIds) {
			if (!prtId.equals(allIds)) {
				driver.switchTo().window(string);
				
			}
		}
		
		WebElement btttnaddCart = driver.findElement(By.xpath("(//span[@class='bttn__content'])[4]"));
		btttnaddCart.click();
		System.out.println("addcard");
		
	}
}
