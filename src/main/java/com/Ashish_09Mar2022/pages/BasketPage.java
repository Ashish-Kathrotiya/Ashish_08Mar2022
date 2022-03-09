package com.Ashish_09Mar2022.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.Ashish_09Mar2022.utility.CommonDriverUtils;

public class BasketPage extends CommonDriverUtils{
	
	
	String lblYears = "//*[text()='%s']";
	String lblThreadColor = "//p/*[contains(text(),'%s')]";
	String editDesign = "(//a[contains(text(),'%s')])[2]";
	By imgPreview = By.xpath("(//img[@src='https://static.contrado.com/BasketItems/2022-3/9d1803e7-c9fe-4eb8-86f9-e967706f6750/9d1803e7-c9fe-4eb8-86f9-e967706f6750_version_82b874d2-62f2-401b-bdaf-cf10171a4a1c_0.jpeg'])[2]");
	
	
	public void verifyProductDetail(String year, String threadColor) {
		Assert.assertTrue("Product detail match", isElementDisplay(getDriver(), By.xpath(String.format(lblYears, year))));
		Assert.assertTrue("Thread color detail match", isElementDisplay(getDriver(), By.xpath(String.format(lblThreadColor, threadColor))));
	}
	
	public void verifyImagePreview() {
		Assert.assertTrue("Image preview is visible", isElementDisplay(getDriver(), imgPreview));
	}
	
	public void clickOnEditDesign(String text) {
		getDriver().findElement(By.xpath(String.format(editDesign, text))).click();
	}
	
	

}
