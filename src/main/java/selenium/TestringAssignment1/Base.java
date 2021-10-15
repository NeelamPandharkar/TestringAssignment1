package selenium.TestringAssignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;

	public WebDriver driverInitializer() {

		WebDriverManager.chromedriver().setup();// third party s/w which allowed to setup driver exe.
		driver = new ChromeDriver();// creating object of ChromeDriver class with WebDriver Interface
		return driver;

	}
}
