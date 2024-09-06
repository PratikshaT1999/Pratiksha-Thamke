package Pratiksha.Selenium_01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Pratiksha.Selenium_01.Dynamic_Code;

public class Slider extends Dynamic_Code {

	public static void main(String[] args) throws Throwable {

		launch_browser("Chrome");

		TakeScreenshots("browser_Launch");

		hit_url("https://jqueryui.com/");

		TakeScreenshots("hit_url");

		// Action class= mouse and keyboard operations

		Actions act = new Actions(driver);

		WebElement draggable = driver.findElement(By.xpath("//a[text() =\"Draggable\"]"));

		act.moveToElement(draggable).click().build().perform();

		WebElement frame0 = driver.findElement(By.cssSelector("iframe.demo-frame"));

		driver.switchTo().frame(frame0);

		WebElement drag_me_around = driver.findElement(By.cssSelector("div#draggable"));

		act.moveToElement(drag_me_around).doubleClick().clickAndHold().moveByOffset(10, 30).release().build().perform();

		act.moveToElement(drag_me_around).dragAndDropBy(drag_me_around, 20, 40).build().perform();

		driver.switchTo().defaultContent();

		System.out.println("after click on draggable " + driver.getTitle());

		// WebElement Themes = driver.findElement(By.xpath("//a[text()=\"Themes\"]"));

		// act.moveToElement(Themes).contextClick().build().perform();

		// System.out.println("after right click on themes " + driver.getTitle());

		// act.moveToElement(Themes).doubleClick().build().perform();

		// System.out.println("after double click on themes " + driver.getTitle());

		WebElement droppable = driver.findElement(By.xpath("//a[text()=\"Droppable\"]"));

		act.moveToElement(droppable).click().build().perform();

		System.out.println("after click on droppable " + driver.getTitle());

		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));

		driver.switchTo().frame(frame);

		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));

		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));

		act.dragAndDrop(drag, drop).build().perform();

		driver.switchTo().defaultContent();

		WebElement Slider = driver.findElement(By.xpath("//a[text()=\"Slider\"]"));

		act.moveToElement(Slider).click().build().perform();

		WebElement frame1 = driver.findElement(By.cssSelector("iframe.demo-frame"));

		driver.switchTo().frame(frame1);

		WebElement Sq_slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));

		act.dragAndDropBy(Sq_slider, 500, 0).build().perform();

		act.dragAndDropBy(Sq_slider, -200, 0).build().perform();

		driver.switchTo().defaultContent();

		// to scroll page

		Thread.sleep(5000);

		act.keyDown(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(5000);

		act.keyDown(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(5000);

		act.keyUp(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(5000);

		act.keyUp(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(5000);

		act.keyDown(Keys.PAGE_UP).build().perform();

		Thread.sleep(5000);

		act.keyDown(Keys.PAGE_UP).build().perform();

		Thread.sleep(5000);
		act.keyUp(Keys.PAGE_UP).build().perform();

	}

}
