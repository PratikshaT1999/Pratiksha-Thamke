package Pratiksha.Selenium_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Pratiksha.Selenium_01.Dynamic_Code;

public class dyanamic_dropdown_Red_bus extends Dynamic_Code {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");

		hit_url("https://www.redbus.in/");

		WebElement from = driver.findElement(By.cssSelector("input#src"));

		from.sendKeys("nagpur");

		List<WebElement> from_options = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//child::li"));
		Thread.sleep(3000);
		for (int a = 0; a <= from_options.size(); a++) {

			try {
				if (from_options.get(a).getText().contains("Chatrapathi")) {
					from_options.get(a).click();

				}
			} catch (Exception StaleElementReferenceException) {
				// TODO: handle exception
			}

		}

		WebElement to = driver.findElement(By.cssSelector("input#dest"));

		to.sendKeys("Mumbai");

		List<WebElement> to_options = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//child::li"));

		for (int b = 0; b <= to_options.size(); b++) {

			try {
				if (to_options.get(b).getText().contains("Vashi")) {

					to_options.get(b).click();

				}
			} catch (Exception StaleElementReferenceException) {
				// TODO: handle exception
			}

		}

	}

}
