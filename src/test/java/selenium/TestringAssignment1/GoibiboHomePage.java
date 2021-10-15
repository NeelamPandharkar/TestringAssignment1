package selenium.TestringAssignment1;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.EndingPage;
import Pages.LandingPage;
import Pages.ResultPage;

public class GoibiboHomePage extends Base {

	@BeforeClass
	public void setUp() {
		driver = driverInitializer();
		driver.get("https://www.goibibo.com/hotels/");// URL of website
		driver.manage().window().maximize();// maximizing the window
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// gloabal wait which is applicable for all
																		// webelement

	}

	@Test(priority=1)

	public void selectCity() {

		LandingPage lp = new LandingPage(driver);
		lp.getRadioButton().click();
		lp.getSearchCity().click();
		lp.getSelectCity().click();

		

		

	}
	@Test(priority=2)
	public void selectDateAndPeople()
	{
		ResultPage rp = new ResultPage(driver);
		rp.getCheckInButton().click();
		rp.getSelectCheckInDate().click();
		rp.getSelectCheckOutDate().click();
		rp.getGuestAndRoom().click();
		rp.getRoomIncreaseButton().click();
		rp.getAdultIncreaseButton().click();
		for (int i = 0; i < 2; i++)
			rp.getChildrenIncreseButton().click();
		rp.getChildAge1().click();
		rp.getChildAgeSelect1().click();
		rp.getChildAge2().click();
		rp.getChildAgeSelect2().click();
		rp.getDoneButton().click();
		rp.getHotelsButton().click();
	}
	@Test(priority=3)
	public void searchHotel()
	{
		EndingPage ep = new EndingPage(driver);
		ep.getSearchHotelButton().click();
	}
	

	@AfterClass
	public void setDown() {
		driver.quit();
	}

}
