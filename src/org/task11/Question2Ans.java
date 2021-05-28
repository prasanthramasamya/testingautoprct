package org.task11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2Ans {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/write-xpath-table.html");

		driver.manage().window().maximize();
		
		WebElement tableContent = driver.findElement(By.xpath("//center//table"));
		
		List<WebElement> rowContent=  tableContent.findElements(By.tagName("tr"));
		
		for (int i = 0; i < rowContent.size(); i++) {
			WebElement row= rowContent.get(i);
			String text = row.getText();
			System.out.println(i+"Value...");
			if (i==0) {
				System.out.println(text);
			}
		}
		driver.quit();
	}

}
