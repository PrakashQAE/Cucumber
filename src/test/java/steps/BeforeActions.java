package steps;
import cucumber.api.java.Before;
import utils.SeleniumDriver;
import utils.T24wrapper;

public class BeforeActions  {

	@Before
	public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		System.out.println("Before Hook executed Successfully");
		//SeleniumDriver.setUpDriver();
		T24wrapper.setUpDriver();
	}
}
