package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowser {
     public static void main(String[] args) {
		
    	 System.setProperty("webdriver.ie.driver", "C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\IEDriverServer.exe");
	     
    	 WebDriver driver= new InternetExplorerDriver();
    	 
    	 driver.get("http://www.greenstechnologys.com/");
    	 
    	 driver.manage().window().maximize();
    	 
    	 
			/*
			 * System.setProperty("webdriver.ie.driver",
			 * "C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\IEDriverServer.exe"
			 * );
			 * 
			 * WebDriver driver1= new InternetExplorerDriver();
			 * 
			 * driver1.get("http://www.greenstechnologys.com/");
			 * 
			 * driver1.manage().window().maximize();
			 * 
			 * 
			 * System.setProperty("webdriver.ie.driver",
			 * "C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\IEDriverServer.exe"
			 * );
			 * 
			 * WebDriver driver2= new InternetExplorerDriver();
			 * 
			 * driver2.get("http://www.greenstechnologys.com/");
			 * 
			 * driver2.manage().window().maximize();
			 */
    	 
    	 
    	 
     }
}
