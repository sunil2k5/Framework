package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

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
		Thread.sleep(19000);
	}

	@Test(priority = 2)
	public void myAccountVerification() throws InterruptedException {

		objMyaccount = new MyAccountPage(driver);
		objMyaccount.myAccount();
		Assert.assertEquals(objMyaccount.MyAccountTitle(), "YOUR ACCOUNT");
		Thread.sleep(19000);
	}

	@Test(priority = 3)
	public void personalInfoChange() throws InterruptedException {
		
		objMyaccount.personalInfoChange();
		Assert.assertEquals(objMyaccount.updationMessage(), "Profile updated successfully");
		Thread.sleep(19000);

	}

}
