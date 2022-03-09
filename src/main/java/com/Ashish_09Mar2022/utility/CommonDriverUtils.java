package com.Ashish_09Mar2022.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;

public class CommonDriverUtils extends PageObject {

	@SuppressWarnings("deprecation")
	public static void waitForSomeTime(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static boolean isElementDisplay(WebDriver driver, By closeSpinner) {

		try {
			driver.findElement(closeSpinner).isDisplayed();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

}
