package com.qa.stepDefinations;


import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.checkout;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomepageSteps extends TestBase {
	HomePage masterpage;
	checkout paymentpage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		TestBase.initialization();
	  }
	@Then("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		boolean logo=masterpage.validateEBaylogo();
		Assert.assertEquals("True",logo);
		 
		}
	@Then("^user verify title of Homepage$")
	public void user_verify_title_of_Homepage() throws Throwable {
		String hometitle =masterpage.validateTitle();
		Assert.assertEquals("Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay",hometitle);
	 
	  }
	@Then("^user enter Books in search field$")
	public void user_enter_Books_in_search_field() throws Throwable {
		masterpage.searchProduct();
	  }
	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		masterpage.search();
	  }
	@Then("^user select first Book$")
	public void user_select_first_Book() throws Throwable {
		masterpage.selectProduct();
	  }
	@Then("^user add book to cart$")
	public void user_add_book_to_cart() throws Throwable {
		masterpage.addToCart();
	  }
	@Then("^user verify eBay logo in checkoutpage$")
	public void user_verify_eBay_logo_in_checkoutpage() throws Throwable {
		boolean logo=masterpage.validateEBaylogo();
		Assert.assertEquals("True",logo);
		 
	  }
	
	//to be written tommarow
	@Then("^user verify book added to cart$")
	public void user_verify_book_added_to_cart() throws Throwable {
		paymentpage.cartQuantity();
	  }
	@Then("^user remove book from cart$")
	public void user_remove_book_from_cart() throws Throwable {
		paymentpage.removeProduct();
	  }
	@Then("^user verify cart is empty$")
	public void user_verify_cart_is_empty() throws Throwable {
		
	  }
	
	
	
	
}
