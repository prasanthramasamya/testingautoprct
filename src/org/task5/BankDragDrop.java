package org.task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BankDragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/drag_drop.html ");

		driver.manage().window().maximize();

		WebElement dragSource = driver.findElement(By.xpath("//a[text()=' BANK ']"));

		WebElement dropTargeet = driver.findElement(By.xpath("//ol[@id='bank']"));

		WebElement dragSourceAmt = driver.findElement(By.xpath("//li[@id='fourth'][1]"));

		WebElement dropTargeetAmt = driver.findElement(By.xpath("//ol[@id='amt7']"));

		WebElement dragSourceAmtsales = driver.findElement(By.xpath("//a[text()=' SALES ']"));

		WebElement dropTargeetAmtsales = driver.findElement(By.xpath("//ol[@id='loan']"));

		WebElement dragSourcsalesAmt = driver.findElement(By.xpath("//li[@id='fourth'][1]"));

		WebElement dropTargeetSalesAmt = driver.findElement(By.xpath("//ol[@id='amt8']"));

		Actions ac = new Actions(driver);

		ac.dragAndDrop(dragSource, dropTargeet).perform();

		ac.dragAndDrop(dragSourceAmt, dropTargeetAmt).perform();

		ac.dragAndDrop(dragSourceAmtsales, dropTargeetAmtsales).perform();

		ac.dragAndDrop(dragSourcsalesAmt, dropTargeetSalesAmt).perform();
	}

}
