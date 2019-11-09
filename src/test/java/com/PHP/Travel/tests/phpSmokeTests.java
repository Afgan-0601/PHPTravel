package com.PHP.Travel.tests;

import org.testng.annotations.Test;

import com.PHP.library.phpBase;

import com.selenium.phptravel.pages.DemoAdminPage;
import com.selenium.phptravel.pages.HomePage;
import com.selenium.phptravel.pages.LogInPage;

public class phpSmokeTests extends phpBase {

	HomePage myHomePage = new HomePage();
	DemoAdminPage adminPanel;
	LogInPage userLogin = new LogInPage();

	@Test(enabled = true)
	public void checking_homePage_test() {
		myHomePage.go_to_PHPTravel();
		phpLibrary.customWait(2);
		myHomePage.clickFrontEndPage();
		phpLibrary.customWait(2);
		myHomePage.clickBackEndPage();
		phpLibrary.customWait(2);

	}

	@Test(enabled = false)
	public void checking_backEnd_page() {
		adminPanel.go_to_adminPanelPositive();
		adminPanel.go_to_adminPanelNegativeEmailAndPassword();

	}

	@Test(enabled = false)
	public void userSignUp() throws Exception {
		userLogin.userLoginPositive();
		userLogin.userLoginNegativeEmail();
		userLogin.userLoginNegativePassword();
	}

}
