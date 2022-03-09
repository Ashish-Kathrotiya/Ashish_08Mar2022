package com.Ashish_09Mar2022.feture.steps;

import com.Ashish_09Mar2022.enumTypes.TestData;
import com.Ashish_09Mar2022.pages.WishListPage;
import com.Ashish_09Mar2022.utility.FileUtils;

import io.cucumber.java.en.Then;

public class WishListPageSteps {

	WishListPage wishlist;

	@Then("^user validates product details againts search page details$")
	public void validateDetails() throws Throwable {
		wishlist.getWishListProductDetail(FileUtils.readData(TestData.PRODUCT_CATEGORY.getColumnNumber()));
		wishlist.verifyFormAndWishlistDetails();
	}

}
