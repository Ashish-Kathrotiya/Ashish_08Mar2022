package com.Ashish_09Mar2022.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.Ashish_09Mar2022.utility.CommonDriverUtils;

public class BasketPage extends CommonDriverUtils{
	
	
	String lblYears = "//*[text()='%s']";
	String lblThreadColor = "//p/*[contains(text(),'%s')]";
	String editDesign = "(//a[contains(text(),'%s')])[2]";
	String closeIcon = "xpath://h2[contains(text(),'Would')]/following-sibling::img";
	By imgPreview = By.xpath("(//img[@alt='Boys Premium T-Shirt'])");
	By removeProduct = By.cssSelector("a.remove__button.basket-hide-on-mobile.js-remove-item-toggle");
	By btnRemoveProduct = By.cssSelector("button.items__remove--yes.js-btn-with-loader.js-delete-line-item");
	By lblEmptyBasket = By.xpath("//p[text()='Your basket is currently empty.']");
	
	
	public void verifyProductDetail(String year, String threadColor) {
		Assert.assertTrue("Product detail match", isElementDisplay(getDriver(), By.xpath(String.format(lblYears, year))));
		Assert.assertTrue("Thread color detail match", isElementDisplay(getDriver(), By.xpath(String.format(lblThreadColor, threadColor))));
	}
	
	public void verifyImagePreview() {
		Assert.assertTrue("Image preview is visible", isElementDisplay(getDriver(), imgPreview));
	}
	
	public void closeAd() {
		$(closeIcon).click();
	}
	
	public void clickOnEditDesign(String text) {
		getDriver().findElement(By.xpath(String.format(editDesign, text))).click();
	}
	
	public void removeProductFromCart() {
		$(removeProduct).click();
		$(btnRemoveProduct).click();
	}
	
	public void verifyEmptyBasketMesage() {
		Assert.assertTrue("EmptyBasketMessage is shown", isElementDisplay(getDriver(), lblEmptyBasket));
	}
	
	

}
