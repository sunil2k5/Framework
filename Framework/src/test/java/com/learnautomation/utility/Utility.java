package com.learnautomation.utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Utility {

	WebDriver driver;

	public Utility(WebDriver driver) {
		this.driver = driver;
	}

	public static void sendKey(WebDriver driver, By byXpath, int timeout, String value) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(byXpath));
		driver.findElement(byXpath).sendKeys(value);
	}

	public static void clickOn(WebDriver driver, By byXpath, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(byXpath));
		driver.findElement(byXpath).click();
	}

	public static String getText(WebDriver driver, By byXpath, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(byXpath));
		return driver.findElement(byXpath).getText();
	}
	
	
	public static void clearField(WebDriver driver,By byXpath,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(byXpath));
		driver.findElement(byXpath).clear();
	}

	public static void captureScreenshot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("./Screenshots/demo"+ getCurrentDateTime()+".png"));
		} catch (Exception e) {
			System.out.println("Unable to take screenshot"+e.getMessage());
		}
	}
	
	
	  public static String getCurrentDateTime() {
		  DateFormat dat= new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss"); 
		  Date dat1= new Date();
		 return dat.format(dat1);
		  }

}
