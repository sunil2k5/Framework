package com.learnautomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By signInWithGoogle = By.xpath("(//span[@class='signin-span'])[1]");
	// By userName = By.xpath("//input[@id='login-email']");
	By userName = By.xpath("(//input[@class='whsOnd zHQkBf'])[1]");
	By nextButton = By.xpath("(//span[@class='RveJvd snByac'])[1]");
	// By password = By.xpath("//input[@id='login-pwd']");
	By password = By.xpath("//input[@class='whsOnd zHQkBf'][@type='password']");

	By loginButton = By.xpath("//button[@id='btn-login']");
	By signinLink = By.xpath("(//a[@class='dialogify'])[1]");
	By homeText = By.xpath("(//a[ @href='https://www.jabong.com/account/'])[1]");

	public void LoginToCRM(String userName1, String password1) throws InterruptedException {

		driver.findElement(signinLink).click();
		driver.findElement(signInWithGoogle).click();
		driver.findElement(userName).sendKeys(userName1);
		driver.findElement(nextButton).click();
		driver.findElement(password).sendKeys(password1);
		Thread.sleep(4000);
		driver.findElement(nextButton).click();
		// driver.findElement(loginButton).click();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public String getHomeText() {
		return driver.findElement(homeText).getText();

	}
}