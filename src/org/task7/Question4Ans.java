package org.task7;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Question4Ans {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" http://www.greenstechnologys.com/ ");

		driver.manage().window().maximize();
		WebElement scrollDown = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		
		//WebElement clicklink = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		scrollDown.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenShort = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Prasanth\\Pictures\\Saved Pictures\\InterviewQst.png");		
		FileHandler.copy(screenShort, f);
		System.out.println(screenShort);
	}

}
