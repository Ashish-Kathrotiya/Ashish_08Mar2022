package com.Ashish_09Mar2022.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.Ashish_09Mar2022.utility.CommonDriverUtils;

public class DesignPage extends CommonDriverUtils {
	
	String lblDesign = "//h3[contains(text(),'%s')]";
	String btnStartDesign = "//img[@alt='Boys Premium T-Shirt']/parent::div/following-sibling::span[contains(text(),'%s')]";
	String ddSize = "xpath://*[text()='Size:']/following-sibling::select";
	String anchorThreadColor = "//img[contains(@alt,'%s')]/ancestor::a";
	String btnDesign = "//button[contains(text(),'%s')]";
	String ImagAndText = "css:a[qa-id='designOptionsTab']";
	String btnRemove = "css:button.remove";
	By upload = By.xpath("//p[text()='upload']");
	By addText = By.xpath("//p[text()='Add Text']");
	By facebook = By.xpath("//p[text()='FACEBOOK']");
	By instagram = By.xpath("//p[text()='INSTAGRAM']");
	By clipArt = By.xpath("//p[text()='Clip Art']");
	By faceTool = By.xpath("//p[text()='Face Tool']");
	By wordArt = By.xpath("//p[text()='Word Art']");
	By closeIcon = By.cssSelector(".ico--close");
	By imgflag = By.xpath("(//li[@class='asset-image-li'])[1]");
	By back = By.xpath("//p[text()='Back']");
	By btnPreview = By.cssSelector("button#btnFinalPreview");
	By btnProceedToCart = By.cssSelector("button#btnProceedToCart");
	
	public void verifyDesginPageTitle(String header) {
		Assert.assertTrue("User is navigates on Start Design Page", isElementDisplay(getDriver(), By.xpath(String.format(lblDesign, header))));
	}
	
	public void startDesigningProduct(String action) {
		getDriver().findElement(By.xpath(String.format(btnStartDesign,action))).click();
	}
	
	public void selectSize(String size){
		selectByVisibleText($(ddSize), size);
	}
	
	public void selectThreadColor(String color) {
		getDriver().findElement(By.xpath(String.format(anchorThreadColor, color))).click();
	}
	
	public void clickDesignButton(String buttonText) {
		getDriver().findElement(By.xpath(String.format(btnDesign, buttonText)));
		waitForAngularRequestsToFinish();
	}
	
	public void verifyDesignPrompt() {
		Assert.assertTrue("Element is not visible", isElementDisplay(getDriver(), upload));
		Assert.assertTrue("Element is not visible", isElementDisplay(getDriver(), addText));
		Assert.assertTrue("Element is not visible", isElementDisplay(getDriver(), facebook));
		Assert.assertTrue("Element is not visible", isElementDisplay(getDriver(), instagram));
		Assert.assertTrue("Element is not visible", isElementDisplay(getDriver(), clipArt));
		Assert.assertTrue("Element is not visible", isElementDisplay(getDriver(), faceTool));
		Assert.assertTrue("Element is not visible", isElementDisplay(getDriver(), wordArt));
		Assert.assertTrue("Element is not visible", isElementDisplay(getDriver(), closeIcon));
	}
	
	public void clickOnClipArt() {
		$(clipArt).click();
		$(imgflag).click();
	}
	
	public void clickBack() {
		$(back).click();
	}
	
	public void clickOnPreviewAndBuy() {
		$(btnPreview).click();
	}
	
	public void proceedToCart() {
		$(btnProceedToCart).click();
		waitForAngularRequestsToFinish();
		withAction().sendKeys(Keys.ESCAPE).build().perform();
	}
	
	public void updateProductDesign(String size, String color) {
		selectByVisibleText($(ddSize), size);
		getDriver().findElement(By.xpath(String.format(anchorThreadColor, color))).click();
	}
	
	public void ImageAndTool() {
		$(ImagAndText).click();
	}
	
	public void clickOnRemove() {
		$(btnRemove).click();
	}

}
