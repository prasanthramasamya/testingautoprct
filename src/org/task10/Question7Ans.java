package org.task10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7Ans {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement bttCorejavaTest = driver.findElement(By.xpath("//div[@id='heading302']"));

		bttCorejavaTest.click();

		WebElement bttnclicklink = driver.findElement(By.xpath("(//a[@title='Test papers training in chennai'])[1]"));
		bttnclicklink.click();

		String prtId = driver.getWindowHandle();
		System.out.println(prtId);

		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);

		for (String string : allId) {
			if (!prtId.equals(allId)) {
				driver.switchTo().window(string);
			}
		}

		WebElement printTxt = driver.findElement(By.xpath("//pre[contains(text(),'What is platform independent?')]"));
		String text = printTxt.getText();
		System.out.println(text);
	}

}
