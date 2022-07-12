package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextSample {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup");

		Thread.sleep(5000);
		// Click on Submit button without fill any data
		driver.findElement(By.id("submit")).click();
		Thread.sleep(5000);

		// Get the validation message
		String firstNameErrMsg = driver.findElement(By.id("firstNameError")).getText();
		System.out.println(firstNameErrMsg);

		// Validate the text from Application
		// String expectedErrMsg = "Please enter your first name.";
		if (firstNameErrMsg.contains("your first name.")) {
			System.out.println("The text has present as expected");
		} else {
			System.out.println("The text has NOT present as expected");
		}

	}

}
