package com.learnautomation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.pages.MyAccountPage;

public class MyAccountChange extends BaseClass {
	MyAccountPage objMyaccount;
	LoginPage objLogin;

	@Test(priority = 1)
	public void login() throws InterruptedException {
		objLogin = new LoginPage(driver);
		objLogin.LoginToCRM(config.getUserName(), config.getPassword());

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

	}

}
