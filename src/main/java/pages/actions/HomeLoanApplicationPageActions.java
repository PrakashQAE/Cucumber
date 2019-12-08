package pages.actions;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.HomeLoanApplicationPageLocators;
import utils.T24wrapper;

public class HomeLoanApplicationPageActions {

	HomeLoanApplicationPageLocators homeLoanApplicationPageLocators = null;

	public HomeLoanApplicationPageActions() {
		// TODO Auto-generated constructor stub		
		this.homeLoanApplicationPageLocators = new HomeLoanApplicationPageLocators();
		PageFactory.initElements(T24wrapper.getDriver(), homeLoanApplicationPageLocators);
	} 


	public void selectCityNameFromDropDown(String City_Name) throws InterruptedException{
		
		Thread.sleep(5000);
		
			try {
				Select city = new Select(homeLoanApplicationPageLocators.CityDropDown);
				
				//Select city = new Select(T24wrapper.getDriver().findElement(By.xpath("//select[@id='property_city']")));
				
				city.selectByVisibleText(City_Name);
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				System.out.println("Unknown error");
			}		
	}

	public void selectPurposeOfLoanFromDropDown(String Loan_Purpose) throws InterruptedException{

		try {
			
			Select loanPurpose = new Select(homeLoanApplicationPageLocators.LoanPurposeDropDown);

			loanPurpose.selectByVisibleText(Loan_Purpose);
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Unknown error");
		}

	}

	public void enterDateOfBirthInputBox(String DateOfBirth){

		try {
			homeLoanApplicationPageLocators.DateOfBirthCalendarInputBox.sendKeys(DateOfBirth);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public void selectResidentTypeFromDropDown(String Resident_Type){

		try {
			Select select = new Select(homeLoanApplicationPageLocators.ResidentTypeDropdown);

			select.selectByVisibleText(Resident_Type);
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Unknown Exception");
		}		
	}

	public void selectEmploymentTypeFromDropDown(String Employment_Type){

		try {
			Select select = new Select(homeLoanApplicationPageLocators.EmploymentTypeDropdown);

			select.selectByVisibleText(Employment_Type);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Unknown Exception");
		}		
	}

	public void enterEmailIDInputBox(String Email_ID){

		homeLoanApplicationPageLocators.EmailIDInputBox.sendKeys(Email_ID);
	}

	public void enterMobileNumberInputBox(String Mobile_Number){

		homeLoanApplicationPageLocators.MobileNumberInputBox.sendKeys(Mobile_Number);
	}

	public void enterCaptachaInputBox(String Captach_Text){

		Captach_Text =  homeLoanApplicationPageLocators.Captcha.getText();

		homeLoanApplicationPageLocators.CaptchaInputBox.sendKeys(Captach_Text);


	}

}
