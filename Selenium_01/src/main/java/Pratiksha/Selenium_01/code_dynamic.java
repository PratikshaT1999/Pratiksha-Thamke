package Pratiksha.Selenium_01;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

public class code_dynamic {

	public static WebDriver driver;

	public static void browser_launch(String Browser) {

		if (Browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		if (Browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		if (Browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}

		if (Browser.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		}

		if (Browser.equalsIgnoreCase("internetexplorer")) {
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println("Browser launched : " + Browser);

	}

	public static void url_hit(String url) {

		driver.get(url);

		System.out.println(driver.getTitle());

	}
	
	public static void screenshot(String sc) throws Throwable {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./RedBus Evidences"+ sc + ".png");
		
		FileHandler.copy(source, target);
	}
	
	public static void click(WebElement a) {
		
		Actions act = new Actions(driver);
		
		act.moveToElement(a).click().build().perform();
	}
	
	public static void text(WebElement b, String c) {
		
		Actions act = new Actions(driver);
		
		act.moveToElement(null).click().sendKeys(c).build().perform();
	}
	
	

}
