package com.Ashish_09Mar2022.feture.steps;

import com.Ashish_09Mar2022.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	HomePage homepage;
	
	@Given("^user navigate to contrado website$")
    public void navigateToUrl() throws Throwable {
		homepage.navigatesToURL();
    }
	
	@And("^user close spin to win pop up as soon as it appears$")
    public void waitAndCLoseSpinToWin() throws Throwable {
        homepage.closeSpingToWin();
    }

    @When("^user clicks on search option$")
    public void clickSearchIcon() throws Throwable {
       homepage.clickSearch();
    }
    
    @And("^user navigates to wishlist page$")
    public void clickOnWishlistIcon() throws Throwable {
    	homepage.navigateToWishlist();
    }

}
