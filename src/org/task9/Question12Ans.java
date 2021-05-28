package org.task9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question12Ans {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://output.jsbin.com/osebed/2 ");
		driver.manage().window().maximize();
		
		WebElement selectAll = driver.findElement(By.id("fruits"));
		
		Select sc= new Select(selectAll);
		
		boolean multiple= sc.isMultiple();
		System.out.println(multiple);
		
	      List<WebElement> options = sc.getOptions();
	      for (int i = 0; i < options.size(); i++) {
	    	  WebElement element= options.get(i);
	    	  String text = element.getText();	    			  
			sc.deselectByVisibleText(text);
	      }
			WebElement firstSelectOpt= sc.getFirstSelectedOption();
			String text3= firstSelectOpt.getText();
			System.out.println(text3);
			
			List<WebElement> allSelectedOptions = sc.getAllSelectedOptions();
			for (int j = 0; j < allSelectedOptions.size(); j++) {
				WebElement element2= allSelectedOptions.get(j);
				String text2 = element2.getText();
				System.out.println(text2);
				
			
		}
	}
}
