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

}
