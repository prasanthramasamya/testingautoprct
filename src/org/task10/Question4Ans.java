package org.task10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question4Ans {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();

		WebElement bttnClick = driver.findElement(By.xpath("(//h3[@id='Python-Solutions-Architect-Training'])[4]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", bttnClick);

		Thread.sleep(3000);
		
		WebElement bttnclick2 = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		js.executeScript("arguments[0].click()", bttnclick2);
		
		WebElement bttnOpn = driver.findElement(By.xpath("(//button[@class='let-us-now pinkbutton ga-click'])[33]"));
		js.executeScript("arguments[0].click()", bttnOpn);
	}

}
//Not Yet Done.