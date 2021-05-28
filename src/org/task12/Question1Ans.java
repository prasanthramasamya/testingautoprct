package org.task12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1Ans {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/");

		driver.manage().window().maximize();
		WebElement scrolDown = driver.findElement(By.xpath("(//span[@class='red_text'])[5]"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrolDown);
		
		WebElement textpath1 = driver.findElement(By.xpath("(//div [@class='trainer-info'])[5]"));
		String text = textpath1.getText();
		System.out.println(text);
	}
		
		
		

}
