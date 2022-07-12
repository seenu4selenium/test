package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownForCollegeWeekLive {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup");
		
		Thread.sleep(5000);
		
		//choose "Iam a" dropdown value as "Student Looking for Graduate Degree"

		Select attendeeType = new Select(driver.findElement(By.name("attendeeType")));
		attendeeType.selectByValue("Graduate");

	}

}
