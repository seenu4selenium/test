package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// Click on Create new account button
		driver.findElement(By.linkText("Create new account")).click();

		Thread.sleep(5000);

		// Select AUG from Month Dropdown
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Aug");
		// month.selectByValue("8");
		// month.selectByIndex(7);

		Select date = new Select(driver.findElement(By.name("birthday_day")));
		date.selectByVisibleText("15");

	}

}
