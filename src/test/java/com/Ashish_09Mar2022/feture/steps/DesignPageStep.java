package com.Ashish_09Mar2022.feture.steps;

import com.Ashish_09Mar2022.enumTypes.TestData;
import com.Ashish_09Mar2022.pages.DesignPage;
import com.Ashish_09Mar2022.utility.FileUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DesignPageStep {

	DesignPage designpage;

	@Then("^verify user navigates to \"([^\"]*)\" prompt$")
	public void verifyPageHeader(String header) throws Throwable {
		designpage.verifyDesginPageTitle(header);
	}

	@When("^user selects \"([^\"]*)\" option for product from list$")
	public void startDesigningProduct(String process) throws Throwable {
		designpage.startDesigningProduct(process);
	}

	@And("^user selects size detail from design screen$")
	public void selectSize() throws Throwable {
		designpage.selectSize(FileUtils.readData(TestData.SIZE.getColumnNumber()));
	}

	@And("^user selects thread colour details from design screen$")
	public void selectThreadColour() throws Throwable {
		designpage.selectThreadColor(FileUtils.readData(TestData.THREAD_COLOR.getColumnNumber()));
	}

	@And("^user clicks on the \"([^\"]*)\" button$")
	public void clickDesignButton(String button) throws Throwable {
		designpage.clickDesignButton(button);
	}

	@Then("^verify system prompt one pop up$")
	public void verifyDesignPrompt() throws Throwable {
		designpage.verifyDesignPrompt();
	}

	@When("^user clicks Clip Art tab to select country flag$")
	public void clickOnClipArt() throws Throwable {
		designpage.clickOnClipArt();
	}

	@And("^user clicks on the Back view of the product$")
	public void ClickOnBackView() throws Throwable {
		designpage.clickBack();
	}

	@And("^user clicks Clip Art tab to select same country flag$")
	public void clickClipArtAndSelectFlag() throws Throwable {
		designpage.clickOnClipArt();
	}

	@When("^user clicks on Preview and Buy option$")
	public void previewAndBuy() throws Throwable {
		designpage.clickOnPreviewAndBuy();
	}

	@And("^user clicks on Proceed to cart option$")
	public void proceedToCart() throws Throwable {
		designpage.proceedToCart();
	}

	@And("^user updates details of product$")
	public void updateProduct() throws Throwable {
		designpage.updateProductDesign(FileUtils.readData(TestData.UPDATED_SIZE.getColumnNumber()),
				FileUtils.readData(TestData.UPDATED_THREAD_COLOR.getColumnNumber()));
	}
	
	@And("^user navigates to Image & Text Tools tab$")
    public void ImageAndToolNavigation() throws Throwable {
        designpage.ImageAndTool();
    }
	
	@And("^user clicks on Remove option$")
    public void clicksOnRemove() throws Throwable {
		designpage.clickOnRemove();
    }


}
