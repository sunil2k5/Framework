package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	
	public void addNewAddress() {
		driver.findElement(savedAddress).click();
		driver.findElement(addNewAddress).click();
		driver.findElement(pinCode).sendKeys("700136");
		driver.findElement(name).sendKeys("vandana kumari");
		driver.findElement(addressField).sendKeys("arush apartment, near vaisno devi temple");
		driver.findElement(mobileNumber).sendKeys("7296053865");
		driver.findElement(addThisAddress).click();
	
	}
	
	public String verifyMessage() {
		return driver.findElement(addressAddedMessage).getText();
	}
	

}
