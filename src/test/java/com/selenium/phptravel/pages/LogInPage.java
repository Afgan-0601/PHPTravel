package com.selenium.phptravel.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PHP.library.phpBase;
import com.PHP.library.phpLibrary;

public class LogInPage extends phpBase {

	@Test(enabled = true)
	// in this Test I will use right email and right Password
	public void userLoginPositive() throws Exception {
		driver.get("https://www.phptravels.net/");
		phpLibrary.customWait(1.5);
		WebElement myAccount1 = driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Offers'])[1]/following::a[1]"));
		phpLibrary.highlightElement(myAccount1);
		myAccount1.click();
		WebElement myAccount2 = driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My Account'])[2]/following::a[1]"));
		phpLibrary.highlightElement(myAccount2);
		myAccount2.click();
		phpLibrary.customWait(1.5);

		driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		phpLibrary.customWait(1.5);
		driver.findElement(By.name("password")).sendKeys("demouser");
		phpLibrary.customWait(1.5);
		driver.findElement(By.id("remember-me")).click();
		phpLibrary.customWait(1.5);
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]"))
				.click();
		phpLibrary.customWait(1.5);
	}

	@Test(enabled = true)
	// in this Test I will use wrong email and right Password
	public void userLoginNegativeEmail() throws Exception {
		driver.get("https://www.phptravels.net/");
		phpLibrary.customWait(1.5);
		WebElement myAccount1 = driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Offers'])[1]/following::a[1]"));
		phpLibrary.highlightElement(myAccount1);
		myAccount1.click();
		WebElement myAccount2 = driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My Account'])[2]/following::a[1]"));
		phpLibrary.highlightElement(myAccount2);
		myAccount2.click();
		phpLibrary.customWait(1.5);

		driver.findElement(By.name("username")).sendKeys("user@phptravels");
		phpLibrary.customWait(1.5);
		driver.findElement(By.name("password")).sendKeys("demouser");
		phpLibrary.customWait(1.5);
		driver.findElement(By.id("remember-me")).click();
		phpLibrary.customWait(1.5);
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]"))
				.click();
		phpLibrary.customWait(1.5);
	}
	
	@Test(enabled = true)
	// in this Test I will use wrong email and right Password
	public void userLoginNegativePassword() throws Exception {
		driver.get("https://www.phptravels.net/");
		phpLibrary.customWait(1.5);
		WebElement myAccount1 = driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Offers'])[1]/following::a[1]"));
		phpLibrary.highlightElement(myAccount1);
		myAccount1.click();
		WebElement myAccount2 = driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My Account'])[2]/following::a[1]"));
		phpLibrary.highlightElement(myAccount2);
		myAccount2.click();
		phpLibrary.customWait(1.5);

		driver.findElement(By.name("username")).sendKeys("user@phptravels");
		phpLibrary.customWait(1.5);
		driver.findElement(By.name("password")).sendKeys("demouser1234");
		phpLibrary.customWait(1.5);
		driver.findElement(By.id("remember-me")).click();
		phpLibrary.customWait(1.5);
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]"))
				.click();
		phpLibrary.customWait(1.5);
	}
	
	
	@Test(enabled = true)
	// in this Test I will use wrong email and right Password
	public void userLoginNegativeEmailandPassword() throws Exception {
		driver.get("https://www.phptravels.net/");
		phpLibrary.customWait(1.5);
		WebElement myAccount1 = driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Offers'])[1]/following::a[1]"));
		phpLibrary.highlightElement(myAccount1);
		myAccount1.click();
		WebElement myAccount2 = driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My Account'])[2]/following::a[1]"));
		phpLibrary.highlightElement(myAccount2);
		myAccount2.click();
		phpLibrary.customWait(1.5);

		driver.findElement(By.name("username")).sendKeys("user@phptravels");
		phpLibrary.customWait(1.5);
		driver.findElement(By.name("password")).sendKeys("demouser");
		phpLibrary.customWait(1.5);
		driver.findElement(By.id("remember-me")).click();
		phpLibrary.customWait(1.5);
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]"))
				.click();
		phpLibrary.customWait(1.5);
	}

}
