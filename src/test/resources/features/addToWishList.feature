Feature: Validate add to wishlist functionality 

Scenario: verify product detail inside wishlist screen 
	Given user navigate to contrado website
	And user close spin to win pop up as soon as it appears
	When user clicks on search option
	And user searches for "T-shirts"
	And user check for the product from list
	And user add product to whishlist
	And user navigates to wishlist page
	Then user validates product details againts search page details
	And user close the browser