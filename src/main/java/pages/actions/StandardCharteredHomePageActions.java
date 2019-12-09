package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
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

		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) T24wrapper.getDriver();

			jsExecutor.executeScript("arguments[0].style.border='3px solid red'", standardCharteredHomePageLocators.OurProductsMenu);

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Exception");
		}finally {
			
			standardCharteredHomePageLocators.OurProductsMenu.click();
		}

	}

	public void clickOnLoansAndMortgagesLink() throws InterruptedException{
		
		Thread.sleep(2000);

		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) T24wrapper.getDriver();

			jsExecutor.executeScript("arguments[0].style.border='3px solid red'", standardCharteredHomePageLocators.LoansAndMortgagesLink);
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Exception");
		}	finally {
			
			standardCharteredHomePageLocators.LoansAndMortgagesLink.click();
			
		}		

	}

	public void clickOnHomeLoanLink(){

		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) T24wrapper.getDriver();

			jsExecutor.executeScript("arguments[0].style.border='3px solid red'", standardCharteredHomePageLocators.HomeLoanLink);
	
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Exception ");
		}
		
		finally {
			
			standardCharteredHomePageLocators.HomeLoanLink.click();
		}

	}
}
