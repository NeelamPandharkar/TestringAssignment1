package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EndingPage {

	public WebDriver driver;

	By SearchHotelButton = By.xpath("//button[contains(text(),'Search Hotels')]");

	public EndingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearchHotelButton() {
		return driver.findElement(SearchHotelButton);
	}

}
