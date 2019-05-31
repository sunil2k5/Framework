package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.JabongPoingPage;
import com.automation.pages.LoginPage;
import com.automation.pages.MyAccountPage;

public class FetchJabongPointTest extends BaseClass {

	LoginPage objLogin;
	JabongPoingPage objJabongPoint;
	MyAccountPage objMyAccount;

	@Test(priority = 1)
	public void loginApp() throws InterruptedException {

		objLogin = new LoginPage(driver);
		objLogin.LoginToApp(config.getUserName(), config.getPassword());
		String textAtHomePage = objLogin.getHomeText();
		Assert.assertEquals(textAtHomePage, "HEY, SUNIL");

	}

	@Test(priority = 2)
	public void jabongPoingVerification() {
		objJabongPoint = new JabongPoingPage(driver);
		MyAccountPage objMyAccount = new MyAccountPage(driver);

		objMyAccount.myAccount();
		objJabongPoint.clickOnJabongLink();
		String jabongPoint = objJabongPoint.getJabongPoint();
		System.out.println("jabong point is" + " " + jabongPoint);
		Assert.assertEquals(jabongPoint, jabongPoint);
	}

}
