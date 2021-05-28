package org.task11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1Ans {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/write-xpath-table.html");

		driver.manage().window().maximize();
		
		WebElement tabelContent = driver.findElement(By.xpath("//center//table"));
		
		List <WebElement> rowcontent = tabelContent.findElements(By.tagName("td"));
		
		for (int i = 0; i < rowcontent.size(); i++) {
			WebElement row=rowcontent.get(i);
			String text = row.getText();
			System.out.println(text);
		}
		
	}
}
