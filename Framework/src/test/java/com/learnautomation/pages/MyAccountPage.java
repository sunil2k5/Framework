package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.utility.Utility;

public class MyAccountPage {

	WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;

	}

	By myAccountLink = By.xpath("(//a[@ href='https://www.jabong.com/account/'])[1]");
	By myAccount = By.xpath("//a[@ href='https://www.jabong.com/customer/order/']");
	By basketLink = By.xpath("//a[@class='goto-link ']");
	By MyAccountTitle = By.xpath("//span[@class='page-heading']");
	By personalInfo = By.xpath("//a [@href='/account/profile']");
	By editCustomerInfo = By.xpath("//button[@class='btn-edit btn btn-secondary btn-small edit-profile']");
	By lastName = By.xpath("//input[@id='lastname']");
	By subitButton = By.xpath("//button[@id='btn-editForm']");
	By updationMessage = By.xpath("//div[@class='tab-alert alert alert-success']");

	public void myAccount() {
		Utility.clickOn(driver, myAccountLink, 20);
		// driver.findElement(myAccountLink).click();
	}

	public String MyAccountTitle() {
		return Utility.getText(driver, MyAccountTitle, 20);
	}

	public void personalInfoChange() {
		Utility.clickOn(driver, personalInfo, 20);
		Utility.clickOn(driver, editCustomerInfo, 20);
		Utility.clearField(driver, lastName, 20);
		Utility.sendKey(driver, lastName, 20, "kumar");
		Utility.clickOn(driver, subitButton, 20);
	}

	public String updationMessage() {
		return Utility.getText(driver, updationMessage, 20);
	}

}
