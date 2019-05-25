package com.learnautomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.utility.Utility;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By signinLink = By.xpath("(//a[@class='dialogify'])[1]");
	By signInWithGoogle = By.xpath("(//span[@class='signin-span'])[1]");
	By userName = By.xpath("(//input[@class='whsOnd zHQkBf'])[1]");
	By nextButton = By.xpath("(//span[@class='RveJvd snByac'])[1]");
	By password = By.xpath("//input[@class='whsOnd zHQkBf'][@type='password']");
	By homeText = By.xpath("(//a[ @href='https://www.jabong.com/account/'])[1]");

	public void LoginToCRM(String userName1, String password1) throws InterruptedException {

		Utility.clickOn(driver, signinLink, 20);
		Utility.clickOn(driver, signInWithGoogle, 20);
		Utility.sendKey(driver, userName, 20, userName1);
		Utility.clickOn(driver, nextButton, 20);
		Thread.sleep(4000);
		Utility.sendKey(driver, password, 20, password1);
		Utility.clickOn(driver, nextButton, 20);
	}

	public String getHomeText() {

		return Utility.getText(driver, homeText, 20);

	}
}