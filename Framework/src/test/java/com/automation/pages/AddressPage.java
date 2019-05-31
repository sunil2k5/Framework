package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.utility.Utility;

public class AddressPage {
	
	WebDriver driver;
	
	public AddressPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By savedAddress=By.xpath("//a [@href='/account/addresses/']");
	By addNewAddress=By.xpath("//button[@class='btn add-new-list btn-secondary btn-small']");
	By pinCode=By.xpath("//input[@name='pincode']");
	By name=By.xpath("//input[@name='name']");
	By addressField=By.xpath("//textarea[@name='address']");
	By mobileNumber=By.xpath("//input[@name='mobile']");
	By addThisAddress=By.xpath("//button[@class='btn btn-primary add-new-btn']");
	By addressAddedMessage=By.xpath("//div[@class='address-added']");
	By savedAddressLink=By.xpath("//a[@class='add-gift-credits address-detail-list']");
	
	
	public void addNewAddress() {
		
		Utility.clickOn(driver, savedAddress, 20);
		Utility.clickOn(driver, addNewAddress, 20);
		Utility.sendKey(driver, pinCode, 20, "700136");
		Utility.sendKey(driver, name, 20, "vandana kumari");
		Utility.sendKey(driver, addressField, 20, "arush apartment, near vaisno devi temple");
		Utility.sendKey(driver, mobileNumber, 20, "7296053865");
		Utility.clickOn(driver, addThisAddress, 20);
		
		
		
		
		
		/*
		 * driver.findElement(savedAddress).click();
		 * driver.findElement(addNewAddress).click();
		 * driver.findElement(pinCode).sendKeys("700136");
		 * driver.findElement(name).sendKeys("vandana kumari");
		 * driver.findElement(addressField).
		 * sendKeys("arush apartment, near vaisno devi temple");
		 * driver.findElement(mobileNumber).sendKeys("7296053865");
		 * driver.findElement(addThisAddress).click();
		 */
	
	}
	
	public void clickOnSavedAddress() {
		
		Utility.clickOn(driver, savedAddressLink, 20);
	}
	
	public String verifyMessage() {
		return Utility.getText(driver, addressAddedMessage, 20);
		//return driver.findElement(addressAddedMessage).getText();
	}
	

}
