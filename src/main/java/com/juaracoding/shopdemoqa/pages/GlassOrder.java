package com.juaracoding.shopdemoqa.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.shopdemoqa.driver.DriverSingleton;

public class GlassOrder {
	private WebDriver driver;
	private Select se;
	
	public GlassOrder() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#noo-site > header > div.navbar-wrapper > div > div > div > a")
	private WebElement btnSearch;
	
	public void clickSearchButton() {
		btnSearch.click();
	}
	
	@FindBy(css = "#noo-site > header > div.search-header.search-header-eff > div.noo-container > form > input.form-control")
	private WebElement inputSearch;
	
	public void inputSearch(String search) {
		inputSearch.sendKeys(search);
		inputSearch.sendKeys(Keys.ENTER);
	}
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1348.product.type-product.status-publish.has-post-thumbnail.product_cat-sun-glasses.product_tag-sun-glasses.product_tag-women.has-featured.first.instock.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-slider.owl-carousel.owl-theme > div.owl-wrapper-outer.autoHeight > div > div.owl-item.active > a")
	private WebElement glassThumbnail;
	
	public void clickGlassThumbnail() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		glassThumbnail.click();
	}
	
	public void selectGlassColor(String colorGlass) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,900)");
		se = new Select(driver.findElement(By.id("pa_color")));
		se.selectByValue(colorGlass);
	}
	
	public void selectGlassSize(String sizeGlass) {
		se = new Select(driver.findElement(By.id("pa_size")));
		se.selectByValue(sizeGlass);
	}
	
	@FindBy(xpath = "//div[@class='woocommerce-variation-add-to-cart variations_button woocommerce-variation-add-to-cart-enabled']//button[@class='single_add_to_cart_button button alt']")
	private WebElement btnAddtoCart;
	
	public void clickAddtoCart() {
		btnAddtoCart.click();
	}
}

