package com.Ashish_09Mar2022.pages;

import org.openqa.selenium.By;

import com.Ashish_09Mar2022.utility.CommonDriverUtils;

public class SerchPage extends CommonDriverUtils {
	
	String searchField = "css:fieldset>input";
	String listItem = "//*[contains(text(),'%s')]";
	String listPrice = "//*[contains(text(),'%s')]/following-sibling::div";
	String addToWishList = "css:.wishlist__icon[value*='Boys Premium T-Shirt']";
	
	public static String productDetail;
	public static String productPrice;
	
	public void searchIteam(String iteam) {
		enter(iteam).into(searchField);
		waitForAngularRequestsToFinish();
	}
	
	public void getProductDetail(String productName) {
		if(isElementDisplay(getDriver(), By.xpath(String.format(listItem, productName)))) {
			productDetail = getDriver().findElement(By.xpath(String.format(listItem, productName))).getText().trim().replaceAll(" +", " ");
			productPrice = getDriver().findElement(By.xpath(String.format(listPrice, productName))).getText().trim().replace("\n", " ");
			
			System.out.println("price >>>" + productPrice);
		}
	}
	
	public void addToWishlist() {
		$(addToWishList).click();
	}
	
}
