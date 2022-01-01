package com.juaracoding.shopdemoqa.strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy{
	public WebDriver setStrategy() {
		System.setProperty("webdriver.gecko.driver", "D:/App/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
