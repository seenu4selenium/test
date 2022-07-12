package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalMethods {

	public static void main(String[] args) throws Exception  {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		// Click on Forgot password? hyper link
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(5000);

		//Type some data into email editbox
		driver.findElement(By.id("identify_email")).sendKeys("asjgfasjfjasgfkas");
		//Click on Refresh icon
		driver.navigate().refresh();
		Thread.sleep(5000);

		//Click on Back icon
		driver.navigate().back();
		Thread.sleep(5000);

		//Click on Forwards icon
		driver.navigate().forward();

	}

}
