package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {

	public WebDriver driver;

	By CheckInButton = By.xpath("//input[@id='search-widget-checkin-input']");
	By SelectCheckInDate = By.xpath("//span[@data-testid='date_23_9_2021']");
	By SelectCheckOutDate = By.xpath("//span[@data-testid='date_2_10_2021']");
	By GuestAndRoom = By.xpath("//input[@value='2 Guests in 1 Room ']");
	By RoomIncreaseButton = By.xpath("(//span[contains(text(),'Rooms')])[1]/following-sibling::div/span[2]");
	By AdultIncreaseButton = By.xpath("(//span[contains(text(),'Adults')])[1]/following-sibling::div/span[2]");
	By ChildrenIncreseButton = By.xpath("(//span[contains(text(),'Children')])[1]/following-sibling::div/span[2]");
	By ChildAge1 = By.xpath("(//span[contains(text(),'Age')])[1]/parent::span/following-sibling::div");
	By ChildAgeSelect1 = By.xpath("//ul//li[2][contains(text(),'2')]");
	By ChildAge2 = By.xpath("(//span[contains(text(),'Age')])[2]/parent::span/following-sibling::div");
	By ChildAgeSelect2 = By.xpath("//ul//li[3][contains(text(),'3')]");
	By DoneButton = By.xpath("//button[contains(text(),'Done')]");
	By HotelsButton = By.xpath("//a[@class='nav-link active']");

	public ResultPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCheckInButton() {
		return driver.findElement(CheckInButton);
	}

	public WebElement getSelectCheckInDate() {
		return driver.findElement(SelectCheckInDate);
	}

	public WebElement getSelectCheckOutDate() {
		return driver.findElement(SelectCheckOutDate);
	}

	public WebElement getGuestAndRoom() {
		return driver.findElement(GuestAndRoom);
	}

	public WebElement getRoomIncreaseButton() {
		return driver.findElement(RoomIncreaseButton);
	}

	public WebElement getAdultIncreaseButton() {
		return driver.findElement(AdultIncreaseButton);
	}

	public WebElement getChildrenIncreseButton() {
		return driver.findElement(ChildrenIncreseButton);
	}

	public WebElement getChildAge1() {
		return driver.findElement(ChildAge1);
	}

	public WebElement getChildAgeSelect1() {
		return driver.findElement(ChildAgeSelect1);
	}

	public WebElement getChildAge2() {
		return driver.findElement(ChildAge2);
	}

	public WebElement getChildAgeSelect2() {
		return driver.findElement(ChildAgeSelect2);
	}

	public WebElement getDoneButton() {
		return driver.findElement(DoneButton);
	}

	public WebElement getHotelsButton() {
		return driver.findElement(HotelsButton);
	}

}
