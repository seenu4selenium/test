package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute_Vs_GetText {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		//Get the Google Search button label(Text)		
		String googleSearchButtonText = driver.findElement(By.name("btnK")).getAttribute("data-ved");
		System.out.println("googleSearchButtonText is : "+googleSearchButtonText);
	}

}
