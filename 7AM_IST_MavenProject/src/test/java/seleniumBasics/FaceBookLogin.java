package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {
	public static void main(String[] args) throws Exception {
		// Object creation for Webdriver interface.
		WebDriver driver;

		// Open chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// type FB url
		driver.get("https://www.facebook.com/");
		// to maximize the current window
		driver.manage().window().maximize();

		// Type UN and PWD
		driver.findElement(By.id("email")).sendKeys("h2otestingtools12313@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Testing@123");
		// Click on Login button
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);

		// validate the login success or not?
		// Verify the given locator has present or not?
		// system will use "findElements" method to identify the multiple locators were
		// there or not?
		// Size(): System will find the given locator, whether it has displayed on
		// Current Page?
		// if yes(Displayed), then the SIZE of locator is ONE(1)
		// if No(NOT Displayed), then the SIZE of locator is ZERO(0)
		// if more than one locator on page(DOM: Document object Model)

		if (driver.findElements(By.xpath("(//*[contains(text(),'NSreddy Testingtools')])[1]")).size() > 0) {
			System.out.println(" The given locator has displayed on DOM(Current Page)");
		} else {
			System.out.println(" The given locator has NOT displayed on DOM(Current Page)");
		}
	}
}
