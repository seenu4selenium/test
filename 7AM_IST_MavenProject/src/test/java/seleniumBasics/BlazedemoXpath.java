package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazedemoXpath {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();

		Select fromPort = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		fromPort.selectByVisibleText("Philadelphia");
		Thread.sleep(800);
		Select toPort = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		toPort.selectByVisibleText("London");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[3]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("ABC");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("DEF");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("GHI");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("NJ");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("123");
		Thread.sleep(800);
		Select cardType = new Select(driver.findElement(By.xpath("//select[@name='cardType']")));
		cardType.selectByVisibleText("American Express");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@name='creditCardNumber']")).sendKeys("12345678901345");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@name='creditCardMonth']")).clear();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@name='creditCardMonth']")).sendKeys("10");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@name='creditCardYear']")).clear();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@name='creditCardYear']")).sendKeys("2025");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@name='nameOnCard']")).sendKeys("ABC");
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='checkbox']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		String Header1 = driver.findElement(By.xpath("//body//div//div//h1")).getText();
		
		System.out.println("*******************************************");
		//Get all the details from success page
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/table")).getText());	
		System.out.println("*******************************************");

		
		
		if (Header1.equals("Thank you for your purchase today!")) {
			System.out.println("Testing completed");
		} else
			System.out.println("Testing Failed");

	}

}