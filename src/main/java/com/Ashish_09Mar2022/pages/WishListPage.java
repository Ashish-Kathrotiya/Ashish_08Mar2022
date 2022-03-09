package com.Ashish_09Mar2022.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.Ashish_09Mar2022.utility.CommonDriverUtils;

public class WishListPage extends CommonDriverUtils {

	String listItem = "//*[contains(text(),'%s')]";
	String listPrice = "//*[contains(text(),'%s')]/following-sibling::div";

	public static String wishListProductDetail;
	public static String wishListProductPrice;

	public void getWishListProductDetail(String productName) {
		if (isElementDisplay(getDriver(), By.xpath(String.format(listItem, productName)))) {
			wishListProductDetail = getDriver().findElement(By.xpath(String.format(listItem, productName))).getText().trim().replaceAll(" +", " ");
			wishListProductPrice = getDriver().findElement(By.xpath(String.format(listPrice, productName))).getText().trim().replaceAll(" +", " ");
		}
	}
	
	public void verifyFormAndWishlistDetails() {
		System.out.println("wishListProductDetail >>" + wishListProductDetail);
		System.out.println("wishListProductPrice  >>" + wishListProductPrice);
		
		System.out.println("productPrice >>" + SerchPage.productPrice);
		System.out.println("productDetail >>" + SerchPage.productDetail);
		
		Assert.assertTrue("item description shpuld match", wishListProductDetail.equals(SerchPage.productDetail));
		Assert.assertTrue("item description shpuld match", wishListProductPrice.equals(SerchPage.productPrice));
		
	}

}
