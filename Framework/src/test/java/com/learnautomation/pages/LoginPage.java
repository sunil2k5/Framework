package com.learnautomation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver Idriver) {
		this.driver = Idriver;
	}

	//WebElement userName1 = driver.findElement(By.xpath("//input[@name='uid']"));
	//WebElement Password1 = driver.findElement(By.xpath("//input[@name='password']"));
	//WebElement LoginButton1 = driver.findElement(By.xpath("//input[@name='btnLogin']"));

	@FindBy(name="uid")WebElement userName1;
	@FindBy(name="password")WebElement Password1;
	@FindBy(name="btnLogin")WebElement LoginButton1;
	
	
	
 public void LoginToCRM(String UserName, String Password) {
	 
	 userName1.sendKeys(UserName);
	 Password1.sendKeys(Password);
	 LoginButton1.click();
	 
 }	 
 }