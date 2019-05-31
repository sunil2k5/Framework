package com.automation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL) {

		if (browserName.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver(options);

		} else if (browserName.equals("firefox")) {			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer32.exe");
			driver = new InternetExplorerDriver();

		} else {
			System.out.println("Bwoser does not supported");
		}
		
		EventFiringWebDriver e_driver= new EventFiringWebDriver(driver);
		WebListener eventListener=new WebListener();
		e_driver.register(eventListener);
		driver=e_driver;
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(appURL);
		driver.manage().window().maximize();
		return driver;

	}

	public static void quidBrowser(WebDriver driver) {		
		driver.close();
	}
}
