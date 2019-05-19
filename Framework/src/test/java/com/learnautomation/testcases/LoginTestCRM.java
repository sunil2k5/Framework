package com.learnautomation.testcases;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;

//import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;
import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.Helper;

public class LoginTestCRM extends BaseClass {

	LoginPage objLogin;
	
	@Test
	public void loginApp() {		
		
		objLogin= new LoginPage( driver);
		//objLogin.LoginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		objLogin.LoginToCRM(config.getUserName(),config.getPassword());
		String textAtHomePage=objLogin.getHomeText();
		Assert.assertEquals(textAtHomePage, "HEY, SUNIL");
		
		Helper.captureScreenshot(driver);
	}

}
