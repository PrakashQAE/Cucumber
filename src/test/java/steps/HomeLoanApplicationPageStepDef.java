package steps;

import cucumber.api.java.en.And;
import pages.actions.HomeLoanApplicationPageActions;
import utils.SeleniumHelper;

public class HomeLoanApplicationPageStepDef extends SeleniumHelper{

	HomeLoanApplicationPageActions homeLoanApplicationPageActions = new HomeLoanApplicationPageActions();

	 @And("^page title should be \"([^\"]*)\"$")
	    public void page_title_should_be_something(String Page_Title) throws Throwable {
		 
		 Thread.sleep(4000);
		 
		 System.out.println(Page_Title+" User Data");
		 
		 String Actual_Page_Title = verifyPageTitle();
		 
		 if(Page_Title.contains(Actual_Page_Title)){
			 
			 System.out.println("Landed on correct Page");
			 
		 }
		 
	    }	 

	    @And("^selects (.+) from City Dropdown$")
	    public void selects_from_city_dropdown(String City_Name) throws Throwable {
	    	
	    	homeLoanApplicationPageActions.selectCityNameFromDropDown(City_Name);
	       
	    }

	    @And("^selects (.+) from PurposeOfLoan Dropdown$")
	    public void selects_from_purposeofloan_dropdown(String Loan_Purpose) throws Throwable {
	    	
	    	homeLoanApplicationPageActions.selectPurposeOfLoanFromDropDown(Loan_Purpose);
	    }

	    @And("^enters (.+) in Date Of Birth InputBox$")
	    public void enters_in_date_of_birth_inputbox(String DateOfBirth) throws Throwable {
	    	
	    	homeLoanApplicationPageActions.enterDateOfBirthInputBox(DateOfBirth);
	       
	    }

	    @And("^selects (.+) from ResidentType Dropdown$")
	    public void selects_from_residenttype_dropdown(String Resident_Type) throws Throwable {
	    	
	    	homeLoanApplicationPageActions.selectResidentTypeFromDropDown(Resident_Type);
	       
	    }

	    @And("^selects (.+) from EmploymentType Dropdown$")
	    public void selects_from_employmenttype_dropdown(String Employment_Type) throws Throwable {
	    	
	    	homeLoanApplicationPageActions.selectEmploymentTypeFromDropDown(Employment_Type);
	       
	    }

	    @And("^enters (.+) in EmailID InputBox$")
	    public void enters_in_emailid_inputbox(String emailid) throws Throwable {
	       
	    }

	    @And("^enters (.+) in Mobile Number InputBox$")
	    public void enters_in_mobile_number_inputbox(String mobilenumber) throws Throwable {
	       
	    }

	    @And("^enters (.+) in CaptchaText InputBox$")
	    public void enters_in_captchatext_inputbox(String captachtext) throws Throwable {
	       
	    }

}
