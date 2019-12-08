package utils;


import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumHelper {
	 

	public static boolean isElementPresent(WebElement webElement) {
		try {
			boolean isPresent = webElement.isDisplayed();
			return isPresent;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

	public static void switchToLastWindow() throws InterruptedException{
		
		Thread.sleep(7000);

		Set<String> allWindowHandles = T24wrapper.getDriver().getWindowHandles();
		List<String> allHandles = new ArrayList<String>();
		allHandles.addAll(allWindowHandles);
		T24wrapper.getDriver().switchTo().window(allHandles.get(1));

		
	}

	public static String verifyPageTitle(){

		String Page_Title = T24wrapper.getDriver().getTitle();

		System.out.println(Page_Title);

		return Page_Title;
	}

}
