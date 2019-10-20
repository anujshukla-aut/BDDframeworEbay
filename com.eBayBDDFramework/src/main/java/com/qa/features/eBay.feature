Feature: eBay application Test

Scenario: Search Books add to cart and remove from cart

	Given user opens browser
	Then user is on homepage
	Then user verify title of Homepage
	Then user enter Books in search field
	Then user click on search button
	Then user select first Book
	Then user add book to cart
	Then user verify eBay logo in checkoutpage
	Then user verify book added to cart
	Then user remove book from cart
	Then user verify cart is empty