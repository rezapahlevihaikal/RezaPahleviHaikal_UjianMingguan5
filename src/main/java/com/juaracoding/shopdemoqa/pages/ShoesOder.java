package com.juaracoding.shopdemoqa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.shopdemoqa.driver.DriverSingleton;

public class ShoesOder {
	private WebDriver driver;
	private Select se;
	
	public ShoesOder() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#nav-menu-item-cart > a")
	private WebElement btnCart;
	
	public void cartButton() {
		btnCart.click();
	}
	
	@FindBy(css = "#post-6 > div > div > p.return-to-shop > a\r\n")
	private WebElement btnReturnShop;
	
	public void buttonReturnShop() {
		btnReturnShop.click();
	}
	
//	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1281.product.type-product.status-publish.has-post-thumbnail.product_cat-shoes.product_tag-shoes.product_tag-women.has-featured.instock.sale.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-meta > div.woocommerce.product.compare-button > a")
//	private WebElement compareShoes;
//	
//	public void compareButtonShoes() {
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,500)");
//		compareShoes.click();
//	}
//	
//	@FindBy(xpath = "//a[@aria-label='Select options for “black pointed toe barely there patent heels”']")
//	private WebElement btnSelectOption; <-- i couldn't found the css or xpath :) 
//	
//	public void buttonSelectOption() {
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,300)");
//		btnSelectOption.click();
//	}
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1281.product.type-product.status-publish.has-post-thumbnail.product_cat-shoes.product_tag-shoes.product_tag-women.has-featured.instock.sale.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-slider.owl-carousel.owl-theme")
	private WebElement thumbnail;
	
	public void clickThumbnail() {
		thumbnail.click();
	}
	
	public void selectColor(String colorShoes) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,900)");
		se = new Select(driver.findElement(By.id("pa_color")));
		se.selectByValue(colorShoes);
	}
	
	public void selectSize(String sizeShoes) {
		se = new Select(driver.findElement(By.id("pa_size")));
		se.selectByValue(sizeShoes);
	}
	
	@FindBy(xpath = "//div[@class='woocommerce-variation-add-to-cart variations_button woocommerce-variation-add-to-cart-enabled']//button[@class='single_add_to_cart_button button alt']")
	private WebElement addCartShoesButton;
	
	public void addCartShoes() {
		addCartShoesButton.click();
	}
	
}
