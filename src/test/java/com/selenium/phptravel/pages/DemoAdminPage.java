package com.selenium.phptravel.pages;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.PHP.library.phpBase;

public class DemoAdminPage extends phpBase {
	HomePage myHomePage = new HomePage();

	@Test
	// This test for Positive Test
	public void go_to_adminPanelPositive() {

		driver.get("https://www.phptravels.net/admin");
		phpLibrary.customWait(1.5);
		WebElement adminEmail = driver.findElement(By.name("email"));
		adminEmail.sendKeys("admin@phptravels.com");
		phpLibrary.customWait(1.5);
		driver.findElement(By.cssSelector(".form-signin")).click();
		WebElement adminPassword = driver.findElement(By.name("password"));
		adminPassword.sendKeys("demoadmin");
		phpLibrary.customWait(1);
		driver.findElement(By.cssSelector(".iCheck-helper")).click();
		phpLibrary.customWait(1);
		driver.findElement(By.cssSelector(".btn-block")).click();
		phpLibrary.customWait(1);

	}

	@Test
	// This test for Positive Test
	public void go_to_adminPanelNegativeEmailAndPassword() {
		driver.get("https://www.phptravels.net/admin");
		phpLibrary.customWait(1.5);
		WebElement adminEmail = driver.findElement(By.name("email"));
		adminEmail.sendKeys("shahguliyev@gmail.com");
		phpLibrary.customWait(1.5);
		driver.findElement(By.cssSelector(".form-signin")).click();
		WebElement adminPassword = driver.findElement(By.name("password"));
		adminPassword.sendKeys("Afgan-0601");
		phpLibrary.customWait(1);
		driver.findElement(By.cssSelector(".iCheck-helper")).click();
		phpLibrary.customWait(1);
		driver.findElement(By.cssSelector(".btn-block")).click();
		phpLibrary.customWait(1);

	}

	@Test
	// This test for Positive Test
	public void go_to_adminPanelNegativePassword() {
		driver.get("https://www.phptravels.net/admin");
		phpLibrary.customWait(1.5);
		WebElement adminEmail = driver.findElement(By.name("email"));
		adminEmail.sendKeys("admin@phptravels.com");
		phpLibrary.customWait(1.5);
		driver.findElement(By.cssSelector(".form-signin")).click();
		WebElement adminPassword = driver.findElement(By.name("password"));
		adminPassword.sendKeys("Afgan-0601");
		phpLibrary.customWait(1);
		driver.findElement(By.cssSelector(".iCheck-helper")).click();
		phpLibrary.customWait(1);
		driver.findElement(By.cssSelector(".btn-block")).click();
		phpLibrary.customWait(1);

	}

	@Test
	// This test for Positive Test
	public void go_to_adminPanelNegative() {
		driver.get("https://www.phptravels.net/admin");
		phpLibrary.customWait(1.5);
		WebElement adminEmail = driver.findElement(By.name("email"));
		adminEmail.sendKeys("shahguliyev@gmail.com");
		phpLibrary.customWait(1.5);
		driver.findElement(By.cssSelector(".form-signin")).click();
		WebElement adminPassword = driver.findElement(By.name("password"));
		adminPassword.sendKeys("demoadmin");
		phpLibrary.customWait(1);
		driver.findElement(By.cssSelector(".iCheck-helper")).click();
		phpLibrary.customWait(1);
		driver.findElement(By.cssSelector(".btn-block")).click();
		phpLibrary.customWait(1);

	}

}
