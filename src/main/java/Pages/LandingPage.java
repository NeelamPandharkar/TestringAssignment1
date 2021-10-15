package Pages;

import org.openqa.selenium.*;

public class LandingPage {

	public WebDriver driver;

	By RadioButton = By.xpath("//input[@type='radio']");
	By SearchCity = By.xpath("//input[@data-testid='home-autosuggest-input']");
	By SelectCity = By.xpath("//*[contains(@class,'TrendingDestinationsUI')] //*[contains(text(),'Mumbai')]");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getRadioButton() {
		return driver.findElement(RadioButton);
	}

	public WebElement getSearchCity() {
		return driver.findElement(SearchCity);
	}

	public WebElement getSelectCity() {
		return driver.findElement(SelectCity);
	}

}
