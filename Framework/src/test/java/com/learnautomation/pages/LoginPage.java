package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By userName = By.xpath("//input[@id='login-email']");
	By password = By.xpath("//input[@id='login-pwd']");
	By loginButton = By.xpath("//button[@id='btn-login']");
	By signinLink = By.xpath("(//a[@class='dialogify'])[1]");
	By homeText = By.xpath("(//a[ @href='https://www.jabong.com/account/'])[1]");

	public void LoginToCRM(String userName1, String password1) {

		driver.findElement(signinLink).click();
		driver.findElement(userName).sendKeys(userName1);
		driver.findElement(password).sendKeys(password1);
		driver.findElement(loginButton).click();
	}

	public String getHomeText() {
		return driver.findElement(homeText).getText();

	}
}