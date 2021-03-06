package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class checkout extends TestBase {

	 
	@FindBy (xpath="//*[@id='gh-cart']")    
	WebElement CartQuantity;
	
	@FindBy (xpath="//*[contains(@id,'isCartBtn_btn')]")    
	WebElement Cartlink;
	
             
	@FindBy (xpath="//*[@data-test-id='cart-remove-item']")      
	WebElement RemoveBtn;
	
	//initialize the elements
	public checkout() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public void shoppingcart() {
		Cartlink.click();
	       }
	public void cartQuantity() {
		CartQuantity.click();
	       }
	public void removeProduct() {
		RemoveBtn.click();
	       }
}
