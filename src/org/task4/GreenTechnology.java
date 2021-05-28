package org.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTechnology {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" http://www.greenstechnologys.com");

		driver.manage().window().maximize();

		 WebElement txtfromPage=
		 driver.findElement(By.xpath("//u[contains(text(),'Training Centers in Chennai')]"));
		//WebElement txtfromPage = driver.findElement(By.xpath("//font[contains(@color,'green')]"));

		String textPage = txtfromPage.getText();

		System.out.println(textPage + "......Print");

	}

}
