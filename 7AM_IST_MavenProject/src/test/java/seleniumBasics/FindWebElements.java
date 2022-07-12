package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindWebElements {

	public static void main(String[] args) {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration/");
		driver.manage().window().maximize();

		// hyperLinks
		List<WebElement> hyperLinks = driver.findElements(By.xpath("//a"));
		int a = hyperLinks.size();

		List<WebElement> hyperLinks1 = driver.findElements(By.xpath("//link"));
		int a1 = hyperLinks1.size();
		System.out.println("hyperLinks are : " + (a + a1));

		// dropdown
		List<WebElement> dropdown = driver.findElements(By.xpath("//select"));
		int b = dropdown.size();
		System.out.println("dropdown are : " + b);

		// images
		List<WebElement> images = driver.findElements(By.xpath("//img"));
		int c = images.size();
		System.out.println("images are : " + c);

		// editbox
		List<WebElement> editbox = driver.findElements(By.xpath("//input[@type='text']"));
		int d = editbox.size();
		System.out.println("editbox are : " + d);

		// password
		List<WebElement> password = driver.findElements(By.xpath("//input[@type='password']"));
		int e = password.size();
		System.out.println("password are : " + e);

		// checkbox
		List<WebElement> checkbox = driver.findElements(By.xpath("//*[@type='checkbox']"));
		int f = checkbox.size();
		System.out.println("checkbox are : " + f);

		// radiobutton
		List<WebElement> radiobutton = driver.findElements(By.xpath("//*[@type='radio']"));
		int g = radiobutton.size();
		System.out.println("radiobutton are : " + g);

		// button
		List<WebElement> button = driver.findElements(By.xpath("//button"));
		int h = button.size();
		System.out.println("button are : " + h);

		// multiselect / Combobox
		List<WebElement> multiselect = driver.findElements(By.xpath("//*[@class='multiselect']"));
		int i = multiselect.size();
		System.out.println("multiselect are : " + i);

		// Print all the webelements
		System.out.println(" All attributes count is : " + (a + a1 + b + c + d + e + f + g + h + i));

	}

}
