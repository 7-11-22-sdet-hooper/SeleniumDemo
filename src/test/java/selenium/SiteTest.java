package selenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SiteTest {

	WebDriver browser;

	@BeforeSuite
	public void beforeTests() {
		System.setProperty("webdriver.chrome.driver", "C://webdriver//chromedriver.exe");
		browser = new ChromeDriver();
	}

	@Test
	public void test() {

		browser.get("https://www.google.com");

		WebElement href = browser.findElement(By.xpath("//a[@href='https://accounts.saucelabs.com/']"));
		assertTrue((href.isDisplayed()));

	}

	@AfterSuite
	public void closeAll() {
		browser.close();
		browser.quit();
	}

}
