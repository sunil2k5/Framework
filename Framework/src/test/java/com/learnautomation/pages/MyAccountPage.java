package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

	WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;

	}

	By myAccountLink = By.xpath("(//a[@ href='https://www.jabong.com/account/'])[1]");
	By myAccount = By.xpath("//a[@ href='https://www.jabong.com/customer/order/']");
	By basketLink= By.xpath("//a[@class='goto-link ']");
	By MyAccountTitle=By.xpath("//span[@class='page-heading']");
	By personalInfo = By.xpath("//a [@href='/account/profile']");
	By editCustomerInfo=By.xpath("//button[@class='btn-edit btn btn-secondary btn-small edit-profile']");
	By lastName=By.xpath("//input[@id='lastname']");
	By subitButton= By.xpath("//button[@id='btn-editForm']");
	By updationMessage=By.xpath("//div[@class='tab-alert alert alert-success']");
	
	

	public void myAccount()  {
		
		driver.findElement(myAccountLink).click();
		driver.findElement(myAccountLink).click();		

	}
	public String MyAccountTitle() {
		return driver.findElement(MyAccountTitle).getText();
	}
	
	public void personalInfoChange() {
		driver.findElement(personalInfo).click();
		driver.findElement(editCustomerInfo).click();
		driver.findElement(lastName).sendKeys("kumar");
		driver.findElement(subitButton).click();		
	}
	
	public String updationMessage() {
		return driver.findElement(updationMessage).getText();
	}
	
}
