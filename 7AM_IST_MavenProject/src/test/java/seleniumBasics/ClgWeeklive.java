package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClgWeeklive {

	public static void main(String[] args) {

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();
		
		
		//type Firstname 
		driver.findElement(By.id("firstName")).sendKeys("Sreenivas");
	}

}
