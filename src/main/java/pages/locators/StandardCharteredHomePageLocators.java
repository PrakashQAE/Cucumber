package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StandardCharteredHomePageLocators {
	
	@FindBy(how=How.XPATH,using="(//button[@class='sc-hdr__btn sc-hdr__menu'])[1]")
	public WebElement OurProductsMenu;
	
	@FindBy(how=How.XPATH,using="//button[text()='Loans and Mortgages']")
	public WebElement LoansAndMortgagesLink;
	
	@FindBy(how=How.XPATH,using="(//a[@title='Home Loan'])[1]")
	public WebElement HomeLoanLink;
	
	
	
	
	

}
