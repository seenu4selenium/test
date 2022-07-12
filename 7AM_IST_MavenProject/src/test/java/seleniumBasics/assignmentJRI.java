package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignmentJRI {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("cgsheta@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("sheta111");
		driver.findElement(By.id("txtCaptcha")).sendKeys("123");
		driver.findElement(By.id("imgbtnSignin")).click();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		

	}

}
