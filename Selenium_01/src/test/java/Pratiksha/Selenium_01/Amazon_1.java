package Pratiksha.Selenium_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_1 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.amazon.in/");

		System.out.println(driver.getTitle());

		WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]"));

		searchbox.click();

		searchbox.sendKeys("Laptops under 40,000");

		Thread.sleep(5000);
		searchbox.clear();

		searchbox.sendKeys("Mobiles");

		System.out.println(searchbox.getText());

		System.out.println(searchbox.getAttribute("value"));

		System.out.println("x - co-ordinates " + searchbox.getLocation().x);

		System.out.println("y - co-ordinates " + searchbox.getLocation().y);

		System.out.println(searchbox.getSize());

		WebElement electronics = driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_electronics\"]"));

		electronics.click();
		
		
		
		
		
		
		
		
		
		

	}

}
