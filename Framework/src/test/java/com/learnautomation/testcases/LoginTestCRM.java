package com.learnautomation.testcases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;
import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.Helper;

public class LoginTestCRM extends BaseClass {

	LoginPage objLogin;

	@Test(priority=1)
	public void loginApp() throws InterruptedException {

		objLogin = new LoginPage(driver);
		// objLogin.LoginToCRM(excel.getStringData("Login", 0, 0),
		// excel.getStringData("Login", 0, 1));
		
		objLogin.LoginToCRM(config.getUserName(), config.getPassword());
		String textAtHomePage = objLogin.getHomeText();
		Assert.assertEquals(textAtHomePage, "HEY, SUNIL");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Helper.captureScreenshot(driver);
	}

}
