package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL) {

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("Firefox")) {
			System.out.println("currently not implemented");
		}

		else if (browserName.equals("IE")) {
			System.out.println("currently not implemented");

		} else {
			System.out.println("Bwoser does not supported");
		}

		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appURL);
		driver.manage().window().maximize();

		return driver;

	}

	public static void quidBrowser(WebDriver driver) {
		
		driver.close();
	}
}
