package Pratiksha.Selenium_01;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

public class Dynamic_Code {

	// to launch browser

	public static WebDriver driver;

	public static void launch_browser(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Safari")) {

			driver = new SafariDriver();

		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println("Browser launched : " + browser);

	}

	// to hit a URL

	public static void hit_url(String URL) {

		driver.get(URL);

		System.out.println(driver.getTitle());
	}

	// to take a screenshots

	public static void TakeScreenshots(String Screenshot_name) throws Throwable {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File("./RedBus Evidences/" + Screenshot_name + ".Png");

		FileHandler.copy(source, target);

	}

	// enter a text using action class

	

	public static void enter_text(WebElement Web_element, String text) {
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Web_element).click().sendKeys(text).build().perform();

	}

	public static void click(WebElement tae) {
		Actions act = new Actions(driver);
		
		act.click().build().perform();
	}
	
	
	// select copy and paste

	public static void Select_Copy() {
		Actions act = new Actions(driver);

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	}

	public static void Paste() {
		
		Actions act = new Actions(driver);

		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	}

	// right click

	public static void right_click(WebElement WB) {
		
		Actions act = new Actions(driver);

		act.contextClick(WB).build().perform();

	}

	// for double click

	public static void double_click(WebElement W_B) {
		
		Actions act = new Actions(driver);

		act.doubleClick(W_B).build().perform();

	}

	// drag and drop

	public static void drag_n_drop(WebElement S, WebElement T) {
		
		Actions act = new Actions(driver);

		act.dragAndDrop(S, T).build().perform();
	}

	// code for moving slider by offset

	public static void drag_n_drop_by_offsets(WebElement W, int x, int y) {
		
		Actions act = new Actions(driver);

		act.moveToElement(W).dragAndDropBy(W, x, y).build().perform();
	}

	// switch to frame

	public static void Switch_to_frame(WebElement a) {

		driver.switchTo().frame(a);

	}

	// Back to window

	public static void Back_to_window() {

		driver.switchTo().defaultContent();
	}

	// forward

	public static void forward() {

		driver.navigate().forward();

	}

	// backward

	public static void backward() {

		driver.navigate().back();

	}

	// refresh

	public static void refresh() {

		driver.navigate().refresh();

	}

	// Scroll by offset

	

	public static void Scroll_By_Offset(int v, int m) {
		
	JavascriptExecutor	js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy" + "(" + v + "," + m + ")");

	}

	// Scroll to bottom

	public static void Scroll_to_bottom() {
		
		JavascriptExecutor	js = (JavascriptExecutor) driver;


		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

	// page down

	public static void page_down() {
		
		Actions act = new Actions(driver);
		

		act.keyDown(Keys.PAGE_DOWN).build().perform();

	}

	// page up

	public static void page_up() {
		
		Actions act = new Actions(driver);

		act.keyDown(Keys.PAGE_UP).build().perform();

	}

	// for tab

	public static void tab() {
		
		Actions act = new Actions(driver);

		act.keyDown(Keys.TAB).build().perform();
	}

}
