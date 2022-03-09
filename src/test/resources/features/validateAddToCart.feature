Feature: Validate add to cart functionality 

Scenario: verify flow to add product in cart
	Given user navigate to contrado website
	And user close spin to win pop up as soon as it appears
	When user clicks on search option
	And user searches for "T-shirts"
	And navigate to product detail page by clicking product from list
	And click on "Start Design" option
	Then verify user navigates to "Start Design" prompt
	When user selects "Start Design" option for product from list
	And user selects size detail from design screen
	And user selects thread colour details from design screen
	And user clicks on the "DESIGN" button
	Then verify system prompt one pop up
	When user clicks Clip Art tab to select country flag
	And user clicks on the Back view of the product
	And user clicks Clip Art tab to select same country flag
	When user clicks on Preview and Buy option
	And user clicks on Proceed to cart option
	Then verify product details on cart screen
	And verify product preview on cart screen
	When user clicks on "Edit Design" option
	And user updates details of product
	And user navigates to Image & Text Tools tab
	And user clicks on Remove option
#	And user clicks on "Delete" option from "Confirm Delete" popup
#	And user clicks on "Add Text" option
#	And user enters maximum character in "Add Text Here"
#	And user clicks on "Add Text" option
#	And user clicks on the "Auto Size" option to set text in the center
#	And user clicks on the "Update Design" option
#	And user clicks on "Proceed to cart" option
#	Then verify product details on cart screen
#	And verify product preview on cart screen
#	And user deletes product form the cart
#	Then verify empty basket message
	
