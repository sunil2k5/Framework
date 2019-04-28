package com.learnautomation.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

		
	By userName= By.xpath("//input[@name='uid']");
	By password= By.xpath("//input[@name='password']");
	By loginButton= By.xpath("//input[@name='btnLogin']");
	
	public void LoginToCRM(String userName1, String password1) {
	 
	 driver.findElement(userName).sendKeys(userName1);
	 driver.findElement(password).sendKeys(password1);
	 driver.findElement(loginButton).click();
	 
	 
 }	 
 }