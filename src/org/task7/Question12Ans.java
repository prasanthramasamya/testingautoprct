package org.task7;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Question12Ans {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		WebElement txtSearch = driver.findElement(By.id("inputValEnter"));

		txtSearch.sendKeys("HP Laptop");
		Thread.sleep(3000);

		WebElement bttnSearch = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		bttnSearch.click();

		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenShort = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Prasanth\\Pictures\\Saved Pictures\\HPLapTop.png");
		FileHandler.copy(screenShort, f);
		System.out.println(screenShort);

	}

}
