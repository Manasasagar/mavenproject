package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements IAutoConst {
	public WebDriver driver;
	@BeforeMethod
	public void precondition (){
	System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe" );
	driver = new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void postcondition(){
	driver.quit();}

}
