package Pratiksha.Selenium_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Redbus extends code_dynamic {

	public static void main(String[] args) {

		browser_launch("chrome");

		url_hit("https://www.redbus.in/");

		WebElement from = driver.findElement(By.cssSelector("input#src"));

		from.sendKeys("nagpur");

		List<WebElement> from_options = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//child::li "));

		for (int m = 0; m <= from_options.size(); m++) {

			try {
				if (from_options.get(m).getText().contains("Dharampeth")) {
					from_options.get(m).click();

				}
			} catch (Exception IndexOutOfBoundsException) {
				// TODO: handle exception
			}
		}

		WebElement to = driver.findElement(By.cssSelector("input#dest"));

		to.sendKeys("pune");

		List<WebElement> to_options = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//child::li"));

		for (int n = 0; n <= to_options.size(); n++) {
			try {
				if (to_options.get(n).getText().contains("Sangamwadi")) {
					to_options.get(n).click();
				}

			}

			catch (Exception IndexOutOfBoundsException) {
				// TODO: handle exception
			}

		}

	}
}
