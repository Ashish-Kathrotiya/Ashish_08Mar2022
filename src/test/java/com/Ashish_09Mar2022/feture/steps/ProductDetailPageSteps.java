package com.Ashish_09Mar2022.feture.steps;

import com.Ashish_09Mar2022.pages.ProductDetailPage;

import io.cucumber.java.en.And;

public class ProductDetailPageSteps {
	
	ProductDetailPage productPage;
	
	@And("^click on \"([^\"]*)\" option$")
    public void navigateToStartDesign(String btnName) throws Throwable {
		productPage.navigateToStartDesignPage(btnName);
    }

}
