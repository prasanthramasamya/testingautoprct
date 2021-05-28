package org.task7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ExampleScreenSht {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.com/");

		driver.manage().window().maximize();
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File screenShort= ts.getScreenshotAs(OutputType.FILE);
		File f= new File("C:\\Users\\Prasanth\\Pictures\\Saved Pictures\\screenshot1.png");
		//FileUtils .copyFile(screenShort, f);
		
		FileHandler.copy(screenShort, f);
		System.out.println(screenShort);
		
		
	}

}
