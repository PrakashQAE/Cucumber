package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.actions.ApplyForHomeLoanPageActions;
import utils.T24wrapper;

public class ApplyForHomeLoanPageStepDef {	

	ApplyForHomeLoanPageActions applyForHomeLoanActions = new ApplyForHomeLoanPageActions();

	@And("^clicks on ApplyNow Button$")
	public void clicks_on_applynow_button() throws Throwable {

		applyForHomeLoanActions.clickOnApplyNowButton();

	}
	
	@Then("^switch to next window$")
	public void switch_to_next_window() throws Throwable {
		
		applyForHomeLoanActions.switchToNextWindow();

	}




}
