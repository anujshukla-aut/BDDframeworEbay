package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {

	//eBay Logo
	@FindBy(xpath = "//*[contains(@id,'gh-logo')]")
	WebElement ebaylogo;
	//Search text box
	@FindBy (xpath="//*[contains(@name,'_nkw')]")
	WebElement searchbox;
	//search button
	@FindBy(xpath="//*[contains(@id,'gh-btn')]")
	WebElement searchbtn;
	//selecting a search result
	@FindBy(xpath="//*[@id=\"srp-river-results-listing6\"]/div/div[2]/a/h3\r\n")
	WebElement searchresultLink;
	//add to cart button
	@FindBy(xpath="//*[contains(@id,'isCartBtn_btn')]")
	WebElement addToCartbtn;

	//initializing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public String validateTitle() {
		return driver.getTitle();
	}
	public boolean validateEBaylogo() {
		return ebaylogo.isDisplayed();
	
		}
	public void searchProduct() {
		 searchbox.sendKeys("Books");
	       }
	public void search() {
		searchbtn.click();
	       }
	public void selectProduct() {
		searchresultLink.click();
	      
			}
	public void addToCart() {
		addToCartbtn.click();
	      
			}
	
	
	
	
	
	
}
