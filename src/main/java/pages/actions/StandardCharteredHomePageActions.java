package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.StandardCharteredHomePageLocators;
import utils.T24wrapper;

public class StandardCharteredHomePageActions {
	
	StandardCharteredHomePageLocators standardCharteredHomePageLocators = null;
	
	public StandardCharteredHomePageActions(){
		
		this.standardCharteredHomePageLocators = new StandardCharteredHomePageLocators();
		PageFactory.initElements(T24wrapper.getDriver(), standardCharteredHomePageLocators);
				
	}

	public void clickOnOurProductLink(){
		
		standardCharteredHomePageLocators.OurProductsMenu.click();		
	}
	
	public void clickOnLoansAndMortgagesLink(){
		
		standardCharteredHomePageLocators.LoansAndMortgagesLink.click();		
		
	}
	
	public void clickOnHomeLoanLink(){
		
		standardCharteredHomePageLocators.HomeLoanLink.click();
		
	}
}
