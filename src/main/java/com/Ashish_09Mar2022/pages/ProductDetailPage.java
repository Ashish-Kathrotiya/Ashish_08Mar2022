package com.Ashish_09Mar2022.pages;

import org.openqa.selenium.By;

import com.Ashish_09Mar2022.utility.CommonDriverUtils;

public class ProductDetailPage extends CommonDriverUtils {
	
	String btnStartDesign = "(//a[contains(text(),'%s')])[2]";
	
	
	public void navigateToStartDesignPage(String btnName) {
		getDriver().findElement(By.xpath(String.format(btnStartDesign, btnName))).click();
	}

}
