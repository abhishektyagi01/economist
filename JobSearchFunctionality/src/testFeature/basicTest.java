package testFeature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageDetails.AbstractPage;
import pageDetails.BasePage;


public class basicTest {
	
	public String baseUrl = "https://jobs.economist.com/";
	String driverPath = "C:\\Users\\Abhishek Tyagi\\eclipseupdated\\JobSearchFunctionality\\src\\\\resources\\chromedriver.exe";
	WebDriver driver ;
	
	@BeforeTest
	public void launchBrowser() {
	System.out.println("launching Chrome browser");
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.get(baseUrl);
	}
	
	public AbstractPage page = new BasePage(driver) ;

	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
