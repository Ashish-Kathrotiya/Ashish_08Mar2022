package com.Ashish_09Mar2022.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;

public class CommonDriverUtils extends PageObject {

	@SuppressWarnings("deprecation")
	public static void waitForSomeTime(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static boolean isElementDisplay(WebDriver driver, By element) {

		try {
			driver.findElement(element).isDisplayed();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public static boolean isElementDisplay(WebDriver driver, WebElement element) {

		try {
			element.isDisplayed();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}

	}

	public static void selectByVisibleText(WebElement dropDown, String value) {
		Select dd = new Select(dropDown);
		dd.selectByVisibleText(value);
	}
	
	public static String randomString(int size)
    {
  
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz";
  
        StringBuilder sb = new StringBuilder(size);
  
        for (int i = 0; i < size; i++) {
  
            int index
                = (int)(AlphaNumericString.length()
                        * Math.random());
  
            sb.append(AlphaNumericString
                          .charAt(index));
        }
  
        return sb.toString();
    }

}
