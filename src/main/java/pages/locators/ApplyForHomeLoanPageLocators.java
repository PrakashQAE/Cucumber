package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ApplyForHomeLoanPageLocators {	

	@FindBy(how=How.XPATH,using="//a[@title='Apply Now']")
	public WebElement ApplyNowButton;

}
