package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pages.AddressPage;
import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.pages.MyAccountPage;

public class AddNewAddressTest extends BaseClass {

	LoginPage objLogin;
	MyAccountPage objMyaccount;
	AddressPage objAddressPage;

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
	public void addNewAddressVerification() {
		AddressPage objAddressPage = new AddressPage(driver);
		objAddressPage.addNewAddress();
		Assert.assertEquals(objAddressPage.verifyMessage(), "Address added successfully");
		System.out.println("Address added successfully");
	}
}
