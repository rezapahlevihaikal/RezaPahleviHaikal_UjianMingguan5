package com.juaracoding.shopdemoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.shopdemoqa.driver.DriverSingleton;

public class Login {
	private WebDriver driver;
	
	public Login() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user_login")
	private WebElement txtUsername;
	
	@FindBy(id = "user_pass")
	private WebElement txtPassword;
	
	@FindBy(id = "wp-submit")
	private WebElement btnLogin;
	
	public void inputUsernameLogin(String username) {
		txtUsername.sendKeys(username);
	}
	
	public void inputPasswordLogin(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickButtonLogin() {
		btnLogin.click();
	}
}
