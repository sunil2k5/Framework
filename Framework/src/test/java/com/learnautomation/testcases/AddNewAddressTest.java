package com.learnautomation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.pages.AddressPage;
import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.pages.MyAccountPage;

public class AddNewAddressTest extends BaseClass {

	LoginPage objLogin;
	MyAccountPage objMyaccount;
	AddressPage objAddressPage;

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
	public void addNewAddressVerification() {
		AddressPage objAddressPage = new AddressPage(driver);
		objAddressPage.addNewAddress();
		Assert.assertEquals(objAddressPage.verifyMessage(), "Address added successfully");
		System.out.println("Address added successfully");

	}
}
