package com.juaracoding.shopdemoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.shopdemoqa.driver.DriverSingleton;

public class Checkout {
	private WebDriver driver;
	private Select se;
	
	public Checkout() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#nav-menu-item-cart > a")
	private WebElement btnCart;
	
	public void clickButtonCart() {
		btnCart.click();
	}
	
	@FindBy(css = "#post-6 > div > div > div.cart-collaterals > div.cart_totals > div > a")
	private WebElement btnCheckout;
	
	public void clickCheckoutButton() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,900)");
		btnCheckout.click();
	}
	
	
	@FindBy(id = "billing_first_name")
	private WebElement txtFirstName;
	
	@FindBy(id = "billing_last_name")
	private WebElement txtLastName;
	
	@FindBy(id = "billing_company")
	private WebElement txtCompany;
	
	@FindBy()
	private WebElement txtCountry;
	
	@FindBy(id = "billing_address_1")
	private WebElement txtAddress1;
	
	@FindBy(id = "billing_address_2")
	private WebElement txtAddress2;
	
	@FindBy(id  = "billing_city")
	private WebElement txtCity;
	
	@FindBy()
	private WebElement txtState;
	
	@FindBy(id = "billing_postcode")
	private WebElement txtPostcode;
	
	@FindBy(id = "billing_phone")
	private WebElement txtPhone;
	
	@FindBy(id = "terms")
	private WebElement checkTerms;
	
	@FindBy(id = "place_order")
	private WebElement btnPlaceOrder;
	
	public void inputFormOrder(String firstName, String lastName, String company, String country, String address1, String address2, String city, String state, String postcode, String phone) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		txtFirstName.sendKeys(firstName);
		txtLastName.sendKeys(lastName);
		txtCompany.sendKeys(company);
		
		se = new Select(driver.findElement(By.id("billing_country")));
		se.selectByValue(country);
		
		txtAddress1.sendKeys(address1);
		jse.executeScript("window.scrollBy(0,500)");
		txtAddress2.sendKeys(address2);
		txtCity.sendKeys(city);
		
		se = new Select(driver.findElement(By.id("billing_state")));
		se.selectByValue(state);
		
		txtPostcode.sendKeys(postcode);
		txtPhone.sendKeys(phone);
		
	}
	
	public void clickTerms() {
		checkTerms.click();	
	}
	
	public void clickPlaceOrderButton() {
		btnPlaceOrder.click();
	}

}
