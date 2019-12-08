package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.StandardCharteredHomePageActions;
import utils.T24wrapper;

public class StandardCharteredHomePageStepDef {
	
	StandardCharteredHomePageActions standardCharteredHomePageActions = new StandardCharteredHomePageActions();
	
    @Given("^Customer is on \"([^\"]*)\" Webpage$")
    public void customer_is_on_something_webpage(String URL) throws Throwable {
    	
    	T24wrapper.openPage(URL);
       
    }

    @When("^Customer clicks on OurProducts Menu$")
    public void customer_clicks_on_ourproducts_menu() throws Throwable {
    	 
    	standardCharteredHomePageActions.clickOnOurProductLink();    	
    }

    @Then("^clicks on LoansAndMortgage Link$")
    public void clicks_on_loansandmortgage_link() throws Throwable {
    	
    	standardCharteredHomePageActions.clickOnLoansAndMortgagesLink();
         
    }

      @And("^clicks on HomeLoan Link$")
    public void clicks_on_homeloan_link() throws Throwable {
    	  
       standardCharteredHomePageActions.clickOnHomeLoanLink();
    	  
    }

    


}
