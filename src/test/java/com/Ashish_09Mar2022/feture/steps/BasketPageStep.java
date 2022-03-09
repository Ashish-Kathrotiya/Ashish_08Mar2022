package com.Ashish_09Mar2022.feture.steps;

import com.Ashish_09Mar2022.enumTypes.TestData;
import com.Ashish_09Mar2022.pages.BasketPage;
import com.Ashish_09Mar2022.utility.FileUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasketPageStep {

	BasketPage basketpage;

	@Then("^verify product details on cart screen$")
	public void verifyProductDetail() throws Throwable {
		basketpage.closeAd();
		basketpage.verifyProductDetail(FileUtils.readData(TestData.SIZE.getColumnNumber()),
				FileUtils.readData(TestData.THREAD_COLOR.getColumnNumber()));
	}

	@And("^verify product preview on cart screen$")
	public void verifyPreview() throws Throwable {
		basketpage.verifyImagePreview();
	}

	@When("^user clicks on \"([^\"]*)\" option$")
	public void clickOnEditDesign(String text) throws Throwable {
		basketpage.clickOnEditDesign(text);
	}

	@Then("^verify updated product details on cart screen$")
	public void verifyUpdatedProductDetailOnCart() throws Throwable {
		basketpage.verifyProductDetail(FileUtils.readData(TestData.UPDATED_SIZE.getColumnNumber()),
				FileUtils.readData(TestData.UPDATED_THREAD_COLOR.getColumnNumber()));
	}

	@And("^user deletes product form the cart$")
	public void removeproductFromCart() throws Throwable {
		basketpage.removeProductFromCart();
	}
	
	@Then("^verify empty basket message$")
    public void verify_empty_basket_message() throws Throwable {
		basketpage.verifyEmptyBasketMesage();
    }

}
