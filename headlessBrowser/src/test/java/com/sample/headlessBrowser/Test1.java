package com.sample.headlessBrowser;

import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	HtmlUnitDriver driver = new HtmlUnitDriver();
	public static final Logger log = LogManager.getLogger(Test1.class.getName());

	@Test
	public void test() {
		assertTrue(true);
	}

	@BeforeTest
	public void beforeTest() {

		driver.get("https://learn.letskodeit.com/p/practice");
		WebElement w1 = driver.findElement(By.xpath("//a[@class='fedora-navbar-link navbar-link']"));
		log.info("  text is : " + w1.getText());
	}

	@AfterTest
	public void after() {
		driver.quit();
		log.info("  CLOSE");
	}

}
