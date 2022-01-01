package com.juaracoding.shopdemoqa.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.shopdemoqa.driver.DriverSingleton;

public class Register {
	private WebDriver driver;
	
	public Register() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "body > p > a")
	private WebElement btnDismiss;
	
	public void dismissButton() {
		btnDismiss.click();
	}
	
	@FindBy(css = "#noo-site > header > div.noo-topbar > div > ul.pull-right.noo-topbar-right > li")
	private List<WebElement>btnMyAccount;
	
	public void gotoRegisterPage() {
		btnMyAccount.get(1).click();
	}
	
	@FindBy(id = "reg_username")
	private WebElement txtUsername;
	
	@FindBy(id = "reg_email")
	private WebElement txtEmail;
	
	@FindBy(id = "reg_password")
	private WebElement txtPassword;
	
	@FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(5) > button")
	private WebElement btnRegister;
	
	public void inputUsername(String username) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		txtUsername.sendKeys(username);
	}
	
	public void inputEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void inputPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void buttonRegister() {
		btnRegister.click();
	}
	
}
