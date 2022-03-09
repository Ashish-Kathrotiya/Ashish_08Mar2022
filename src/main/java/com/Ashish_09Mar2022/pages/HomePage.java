package com.Ashish_09Mar2022.pages;

import org.openqa.selenium.By;

import com.Ashish_09Mar2022.enumTypes.TestData;
import com.Ashish_09Mar2022.utility.CommonDriverUtils;
import com.Ashish_09Mar2022.utility.FileUtils;

public class HomePage extends CommonDriverUtils {
	
	By closeSpinner = By.cssSelector(".close--spinner");
	String idSearch = "css:#lnkSearch";
	String wishlistIcon = "css:.icon--wishlist__img[shape-rendering='initial']";
	
	public void navigatesToURL() {
		getDriver().get(FileUtils.readData(TestData.TEST_URL.getColumnNumber()));
		getDriver().manage().window().maximize();
	}
	
	public void closeSpingToWin() {
		waitForSomeTime(getDriver());
		if(isElementDisplay(getDriver(), closeSpinner)) {
			$(closeSpinner).click();
		}
		
	}
	
	public void clickSearch() {
		$(idSearch).click();
	}
	
	public void navigateToWishlist() {
		$(wishlistIcon).click();
		waitForAngularRequestsToFinish();
	}

}
