package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinkSample {

	public static void main(String[] args) {
	
		WebDriver driver;
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		//Click on Forgot password? hyper link
		driver.findElement(By.linkText("Forgot password?")).click();
		//driver.findElement(By.partialLinkText("pa")).click();
		
		

	}

}
