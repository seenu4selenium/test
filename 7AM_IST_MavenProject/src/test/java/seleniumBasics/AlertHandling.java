package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	public static void main(String[] args) throws Exception {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");

		// Click on CONTINUE TO LOGIN button
		driver.findElement(By.className("login_button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(3000);

		// Alert handle:
		// To get the Alert message
		System.out.println(driver.switchTo().alert().getText());
		// to click on OK button in Alert, will use Accept();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		// want to click on New User ? Register here/Activate link
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		Thread.sleep(3000);
		// Confirmation Alert
		// to click on OK button in Confirmation Alert, will use Accept();
		// driver.switchTo().alert().accept();

		// To get the ConfirmationAlert message
		System.out.println(driver.switchTo().alert().getText());

		// to click on CANCEL button in Confirmation Alert, will use Dismiss();
		driver.switchTo().alert().dismiss();
	}
}
