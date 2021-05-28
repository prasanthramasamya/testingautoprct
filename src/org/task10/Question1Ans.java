package org.task10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1Ans {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchText.sendKeys("iphones X",Keys.ENTER);
		
		WebElement bttnClicknew = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		
		Actions ac= new Actions(driver);
		ac.contextClick(bttnClicknew).perform();
		
		Robot rb= new Robot();
		
		for (int i = 0; i <=1; i++) {
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		}
		
		WebElement printText = driver.findElement(By.xpath("//span[text()='Apple']"));
		String text = printText.getText();
		System.out.println(text);
	}

}
