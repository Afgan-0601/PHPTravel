package com.selenium.phptravel.pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.PHP.library.phpBase;

public class HomePage extends phpBase {

	@Test(enabled = false)
	public HomePage go_to_PHPTravel() {
		driver.get("https://phptravels.com/demo/");
		assertEquals(driver.getTitle(), "Demo Script Test drive - PHPTRAVELS");
		return this;
	}

	@Test(enabled = true)
	public void go_to_companyLogo() {
		driver.get("https://phptravels.com/demo/");
		assertEquals(driver.getTitle(), "Demo Script Test drive - PHPTRAVELS");

		WebElement companyLogo = phpLibrary.moveMouseToElement(By.xpath("//*[@id=\"ShopifyMainNav\"]/div"));
		phpLibrary.highlightElement(companyLogo);
		companyLogo.click();
	}

	@Test(enabled = true)
	public void clickFrontEndPage() {
		driver.get("https://phptravels.com/demo/");
		WebElement frontEndPage = phpLibrary.moveMouseToElement(
				By.xpath("//*[@id=\"Main\"]/section[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/a"));
		phpLibrary.highlightElement(frontEndPage);
		phpLibrary.captureScreenshot("PHPTravelHomePage", "");
		phpLibrary.captureScreenshot("PHPTravelHomePage",
				"C:/Users/AFGAN/Desktop/Musabey Technologies/Project/PHPTravel/");
		phpLibrary.customWait(1);
		frontEndPage.click();

	}

	@Test(enabled = true)
	public void clickBackEndPage() {
		driver.get("https://phptravels.com/demo/");
		WebElement backEndPage = phpLibrary.moveMouseToElement(
				By.xpath("//*[@id=\"Main\"]/section[2]/div/div/div[3]/div/div/div[2]/div[2]/div/div[1]/div/a"));
		phpLibrary.scrollToWebElementByPixel();
		phpLibrary.highlightElement(backEndPage);
		phpLibrary.customWait(2);
		backEndPage.click();

	}
}
