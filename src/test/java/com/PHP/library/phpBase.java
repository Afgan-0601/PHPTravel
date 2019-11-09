package com.PHP.library;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.PHP.library.phpLibrary;

public class phpBase {

	final static Logger logger = Logger.getLogger(phpBase.class);
	public static WebDriver driver;
	public static phpLibrary phpLibrary;
	public String browser;
	public boolean isCaptureScreenshot = true;
	

	@BeforeClass
	public void beforeEachClass() {
		JavaPropManager readingProperty = new JavaPropManager("src/test/resources/config.properties");
		browser = readingProperty.readProperty("browserType");
		logger.info("Before all tests starts...");
		phpLibrary = new phpLibrary(driver);

	}

	@AfterClass
	public void afterEachClass() {
		logger.info("After all tests");

		if (driver != null) {
			driver.quit();
		}

	}

	@BeforeMethod
	public void beforeEachTest() {

		logger.info("Before each Test");
		driver = phpLibrary.locaBrowsers(browser);

	}

	@AfterMethod
	 public void afterEachTest(ITestResult result) {
        logger.info("After each test completed ...");
        if (isCaptureScreenshot) {
            if (ITestResult.FAILURE == result.getStatus()) {
                logger.error("Error: Test Failed...",result.getThrowable());
                phpLibrary.captureScreenshot(result.getName(), "");
            }
        }
        //myLibrary.customWait(30);
        driver.close();
    }

}