package org.task12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6Ans {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth\\eclipse-workspace\\ProjectSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement buttonCLsoe = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", buttonCLsoe);

		WebElement buttonLogin = driver.findElement(By.xpath("//a[text()='Login']"));
		js.executeScript("arguments[0].click()", buttonLogin);

		WebElement txtUserEMail = driver.findElement(By.xpath("(//input[@class='_2IX_2- VJZDxU'])"));
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", txtUserEMail);
		js.executeScript("arguments[0].setAttribute('value','9659132702')", txtUserEMail);

		System.out.println(executeScript);
		Thread.sleep(3000);

		WebElement txtUserPass = driver.findElement(By.xpath("(//input[@class='_2IX_2- _3mctLh VJZDxU'])"));
		Object executeScriptPass = js.executeScript("return arguments[0].getAttribute('value')", txtUserPass);
		js.executeScript("arguments[0].setAttribute('value','flipkart01')", txtUserPass);
		System.out.println(executeScriptPass);

		WebElement buttonLoginusr = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		js.executeScript("arguments[0].click()", buttonLoginusr);

	}
}
