package pages.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ApplyForHomeLoanPageLocators;
import utils.SeleniumHelper;
import utils.T24wrapper;

public class ApplyForHomeLoanPageActions {

	ApplyForHomeLoanPageLocators applyForHomeLoanPageLocators = null;

	public ApplyForHomeLoanPageActions(){

		this.applyForHomeLoanPageLocators = new ApplyForHomeLoanPageLocators();
		PageFactory.initElements(T24wrapper.getDriver(), applyForHomeLoanPageLocators);	

	}

	public void clickOnApplyNowButton() throws InterruptedException{

		Thread.sleep(3000);		
		applyForHomeLoanPageLocators.ApplyNowButton.click();

	}

	public void switchToNextWindow() throws InterruptedException{	
		
		Thread.sleep(4000);
		Set<String> allWindowHandles = T24wrapper.getDriver().getWindowHandles();
		List<String> allHandles = new ArrayList<String>();
		allHandles.addAll(allWindowHandles);
		T24wrapper.getDriver().switchTo().window(allHandles.get(1));
	}

}
