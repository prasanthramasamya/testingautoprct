package org.task7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ExampleInwtScrn {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(" http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();

		WebElement clicklink = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		clicklink.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenShort = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Prasanth\\Pictures\\Saved Pictures\\InterviewQst.png");
		// FileUtils .copyFile(screenShort, f);

		FileHandler.copy(screenShort, f);
		System.out.println(screenShort);

	}

}
