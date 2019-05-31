package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.pages.MyAccountPage;

public class MyAccountChange extends BaseClass {
	MyAccountPage objMyaccount;
	LoginPage objLogin;

	@Test(priority = 1)
	public void login() throws InterruptedException {
		objLogin = new LoginPage(driver);
		objLogin.LoginToApp(config.getUserName(), config.getPassword());

	}

	@Test(priority = 2)
	public void myAccountVerification() {

		objMyaccount = new MyAccountPage(driver);
		objMyaccount.myAccount();
		Assert.assertEquals(objMyaccount.MyAccountTitle(), "YOUR ACCOUNT");

	}

	@Test(priority = 3)
	public void personalInfoChange() {

		objMyaccount.personalInfoChange();
		Assert.assertEquals(objMyaccount.updationMessage(), "Profile updated successfully");
		System.out.println("Profile updated successfully");

	}

}
