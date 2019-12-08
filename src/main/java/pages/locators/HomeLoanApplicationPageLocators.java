package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeLoanApplicationPageLocators {
	

	@FindBy(how=How.XPATH,using="//select[@id='property_city']")
	public WebElement CityDropDown;
	
	@FindBy(how=How.XPATH,using="//select[@id='loanPurpose']")
	public WebElement LoanPurposeDropDown;
	
	@FindBy(how=How.ID,using="date_of_birth")
	public WebElement DateOfBirthCalendarInputBox;
	
	@FindBy(how=How.ID,using="residentType")
	public WebElement ResidentTypeDropdown;
	
	@FindBy(how=How.ID,using="employmentType")
	public WebElement EmploymentTypeDropdown;
	
	@FindBy(how=How.ID,using="emailid")
	public WebElement EmailIDInputBox;
	
	@FindBy(how=How.ID,using="mobile")
	public WebElement MobileNumberInputBox;	

	@FindBy(how=How.XPATH,using="//span[@id='captch_div']")
	public WebElement Captcha;
	
	@FindBy(how=How.ID,using="recaptcha_response_field")
	public WebElement CaptchaInputBox;	
	
	 
	
	
	
	
	
	
	
}
