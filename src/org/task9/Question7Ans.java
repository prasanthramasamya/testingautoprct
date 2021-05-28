package org.task9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Question7Ans {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php ");
		driver.manage().window().maximize();
		
		WebElement selectCountry = driver.findElement(By.name("country"));
		Select sc= new Select(selectCountry);
		boolean multiple= sc.isMultiple();
		
		System.out.println(multiple);
		
		List<WebElement> options = sc.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement element= options.get(i);
			String attribute= element.getAttribute("value");
			sc.selectByValue(attribute);
			System.out.println(attribute);
			
		}
		
	}

}
