package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JabongPoingPage {

	WebDriver driver;

	public JabongPoingPage(WebDriver driver) {
		this.driver = driver;
	}

	By myAccountLink = By.xpath("(//a[@ href='https://www.jabong.com/account/'])[1]");
	By jbongPointLink = By.xpath("//a[@href='/customer/points/history/']");
	By jabongPoint = By.xpath("(//p[@class='jp-details']/span)[1]");

	
	public void clickOnJabongLink() {
		
		driver.findElement(jbongPointLink).click();
	}
	
	public String getJabongPoint() {
		return driver.findElement(jabongPoint).getText();
	}

}
