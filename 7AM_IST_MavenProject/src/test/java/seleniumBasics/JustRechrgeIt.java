package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JustRechrgeIt {

	public static void main(String[] args) {
		//Object creation for Webdriver
		WebDriver driver;
		//Chrome browser open
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("TEasgsdfs@sdgsdg.sdg");
		driver.findElement(By.id("txtPasswd")).sendKeys("sdfhsdfhd");
		driver.findElement(By.id("txtCaptcha")).sendKeys("453");	
		driver.findElement(By.id("imgbtnSignin")).click();
	}

}
