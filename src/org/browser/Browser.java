package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.get("http://gmail.com/");

		driver.get("http://www.flipkart.com/");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();

		driver1.get("http://www.greenstechnologys.com/");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();

		driver2.get("http://greenstech.in/selenium-course-content.html/");

		driver.manage().window().maximize();

		
		  String currentURL = driver.getCurrentUrl();
		  
		  System.out.println(currentURL);
		  
		  String title = driver.getTitle(); System.out.println(title);
		 
	}
}
