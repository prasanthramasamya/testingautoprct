package org.task11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3Ans {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/write-xpath-table.html");

		driver.manage().window().maximize();
		WebElement tableContent = driver.findElement(By.xpath("//center//table"));
		List<WebElement> rowContent=  tableContent.findElements(By.tagName("tr"));
		System.out.println(rowContent.size());
		driver.quit();
	}

}
