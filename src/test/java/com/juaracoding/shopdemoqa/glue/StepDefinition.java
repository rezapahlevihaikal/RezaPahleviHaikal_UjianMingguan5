package com.juaracoding.shopdemoqa.glue;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.shopdemoqa.config.AutomationFrameworkConfig;
import com.juaracoding.shopdemoqa.driver.DriverSingleton;
import com.juaracoding.shopdemoqa.pages.Checkout;
import com.juaracoding.shopdemoqa.pages.GlassOrder;
import com.juaracoding.shopdemoqa.pages.Login;
import com.juaracoding.shopdemoqa.pages.Register;
import com.juaracoding.shopdemoqa.pages.ShoesOder;
import com.juaracoding.shopdemoqa.utils.ConfigurationProperties;
import com.juaracoding.shopdemoqa.utils.Constants;
import com.juaracoding.shopdemoqa.utils.TestCases;
import com.juaracoding.shopdemoqa.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {
	private WebDriver driver;
	private Register register;
	private Login login;
	private ShoesOder shoes;
	private GlassOrder glass;
	private Checkout co;

	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configProperties.getBrowser());
		register = new Register();
		login= new Login();
		shoes = new ShoesOder();
		glass = new GlassOrder();
		co = new Checkout();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	//======================= Register Activity ==========================
	@Given("^User go to the Website")
	public void User_go_to_the_Website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS,"Navigating to " + Constants.URL);
	}
	
	@When("^User click dismiss button")
	public void User_click_dismiss_button() {
		register.dismissButton();
	}
	
	@When("^User click my account button")
	public void User_click_my_account_button() {
		register.gotoRegisterPage();
		extentTest.log(LogStatus.PASS,"User click my account button");
	}
	
	@When("^User input username")
	public void User_input_username() {
		register.inputUsername(configProperties.getUsername());
		extentTest.log(LogStatus.PASS,"User input username");
	}
	
	@When("^User input email")
	public void User_input_email() {
		register.inputEmail(configProperties.getEmail());
		extentTest.log(LogStatus.PASS,"User input email");	
	}
	
	@When("^User input password")
	public void User_input_password() {
		register.inputPassword(configProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User input password");
	}
	
	@Then("^User input register button")
	public void User_input_register_button() {
		register.buttonRegister();
		extentTest.log(LogStatus.PASS, "User input register button");
	}
	
	//=================== Login Activity ==========================
	@When("^User input username login")
	public void User_input_username_login() {
		login.inputUsernameLogin(configProperties.getEmail());
	}
	
	@When("^User input password login")
	public void User_input_password_login() {
		login.inputPasswordLogin(configProperties.getPassword());
	}
	
	@Then("^User click login button")
	public void User_click_login_button() {
		login.clickButtonLogin();
	}
	
	
	//===================== Shoes Order Activity =======================
	@When("^User click cart button")
	public void User_click_cart_button() {
		shoes.cartButton();
	}
	
	@When("^User click return to shop button")
	public void User_click_return_to_shop_button() {
		shoes.buttonReturnShop();
	}
	
//	@When("^User click compare button")
//	public void User_click_compare_button() {
//		shoes.compareButtonShoes();
//	}
//	
//	@When("^User click select option button")
//	public void User_click_select_option_button() {
//		shoes.buttonSelectOption();
//	}
	
	@When("^User click thumbnail")
	public void User_click_thumbnail() {
		shoes.clickThumbnail();
	}
	
	@When("^User click the color")
	public void User_click_the_color() {
		shoes.selectColor(configProperties.getValueShoesColor());
	}
	
	@When("^User click the size")
	public void User_click_the_size() {
		shoes.selectSize(configProperties.getValueShoesSize());
	}
	
	@Then("^User click add to cart")
	public void User_click_add_to_cart() {
		shoes.addCartShoes();
	}
	
	
	//======================== Glass Order Activity =======================
	@When("^User click search button")
	public void User_click_search_button() {
		glass.clickSearchButton();
	}
	
	@When("^User input type glass")
	public void User_input_type_glass() {
		glass.inputSearch(configProperties.getInputSearch());
	}
	
	@When("^User click glass thumbnail")
	public void User_click_glass_thumbnail() {
		glass.clickGlassThumbnail();
	}
	
	@When("^User input color")
	public void User_input_color() {
		glass.selectGlassColor(configProperties.getValueGlassColor());
	}
	
	@When("^User input size")
	public void User_input_size() {
		glass.selectGlassSize(configProperties.getValueGlassSize());
	}
	
	@Then("^User click add to cart button")
	public void User_click_add_to_cart_button() {
		glass.clickAddtoCart();
	}
	
	//========================= Checkout Activity ===========================
	@When("^User click cart checkout button")
	public void User_click_cart_checkout_button() {
		co.clickButtonCart();
	}
	
	@When("^User click proceed to checkout button")
	public void User_click_proceed_to_checkout_button() {
		co.clickCheckoutButton();
	}
	
	@When("^User input form")
	public void User_input_form() {
		co.inputFormOrder(
				configProperties.getFirstName(),
				configProperties.getLastName(),
				configProperties.getCompany(),
				configProperties.getValueCountry(),
				configProperties.getAddress1(),
				configProperties.getAddress2(),
				configProperties.getCity(),
				configProperties.getValueState(),
				configProperties.getPostcode(),
				configProperties.getPhone()
		);
	}
	
	@When("^User click terms")
	public void User_click_terms() {
		co.clickTerms();
	}
	
	@Then("^User click place order button")
	public void User_click_place_order_button() {
		co.clickPlaceOrderButton();
	}
	
//	@After
//	public void closeObject() {
//		report.endTest(extentTest);
//		report.flush();
//	}
}
