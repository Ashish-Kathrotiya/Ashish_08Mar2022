package com.Ashish_09Mar2022.feture.steps;

import com.Ashish_09Mar2022.enumTypes.TestData;
import com.Ashish_09Mar2022.pages.SerchPage;
import com.Ashish_09Mar2022.utility.FileUtils;

import io.cucumber.java.en.And;

public class SearchPageSteps {
	
	SerchPage searchpage;
	
	@And("^user searches for \"([^\"]*)\"$")
    public void searchProduct(String product) throws Throwable {
		searchpage.searchIteam(product);
    }
	
	@And("^user check for the product from list$")
    public void lookForProductDetail() throws Throwable {
        searchpage.getProductDetail(FileUtils.readData(TestData.PRODUCT_CATEGORY.getColumnNumber()));
    }
	
	@And("^user add product to whishlist$")
    public void addProductToWishList() throws Throwable {
		searchpage.addToWishlist();
	}
	
	@And("^navigate to product detail page by clicking product from list$")
    public void navigateToProductDetailPage() throws Throwable {
		searchpage.navigateToProductDetailPage(FileUtils.readData(TestData.PRODUCT_CATEGORY.getColumnNumber()));
	}

}
