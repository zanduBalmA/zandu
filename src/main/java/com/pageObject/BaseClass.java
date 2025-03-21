package com.pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.testBase.DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;

	@Parameters("browserName")
	@BeforeTest
	public void openBrowser(String browser) throws InterruptedException {
	    if (browser.equals("chrome")) {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    }

	    if (browser.equals("firefox")) {
	        driver = new FirefoxDriver();
	    }

	    if (browser.equals("edge")) {
	        driver = new EdgeDriver();
	    }

	    driver.manage().window().maximize();
	    driver.get("https://parabank.parasoft.com/parabank/index.htm");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    // Set WebDriver instance in DriverFactory
	    DriverFactory.getInstance().setDriver(driver);
	}


	@AfterTest
	public void closeBrowser() {
		driver.close();

		System.gc();
	}
}
