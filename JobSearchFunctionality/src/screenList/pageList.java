package screenList;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageDetails.*;

public class pageList extends BasePage {
	
	private By signInLink = By.linkText("Sign in");
	private By createAcc = By.linkText("Create account");
	private By homePage = By.linkText("Home");
	private By findJob = By.linkText("Find a job");
	private By jobAlert = By.linkText("Job alerts");
	private By searchRecruiter = By.linkText("Search recruiters");
	private By jobBlog = By.linkText("Jobs blog");
	private By keyword = By.id("keywords");
	private By location = By.id("location");
	private By search = By.xpath("//*[@id=\"main\"]/div[2]/div/section/div/div/form/fieldset/div[4]/div/input");
	private By sectorList = By.xpath("//*[@id=\"main\"]/div[3]/div/section/div/div/ul");
	
	
	public pageList(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getSignIn() {
		return getElement(signInLink);
	}
	
	public WebElement getCreateAccount() {
		return getElement(createAcc);
	}
	
	public WebElement getHomePage() {
		return getElement(homePage);
	}
	
	public WebElement getFindJob() {
		return getElement(findJob);
	}
	
	public WebElement getJobAlert() {
		return getElement(jobAlert);
	}
	
	public WebElement getSearchRecruiter() {
		return getElement(searchRecruiter);
	}
	
	public WebElement getJobBlog() {
		return getElement(jobBlog);
	}
	
	public WebElement getKeyword() {
		return getElement(keyword);
	}
	
	public WebElement getLocation() {
		return getElement(location);
	}
	
	public WebElement getSearchButton() {
		return getElement(search);
	}
	
	public WebElement getListofSector() {
		return getElement(sectorList);		
	}
	
	public String performJobSearch() {
		getKeyword().sendKeys("test");
		getLocation().sendKeys("London");
		getSearchButton().click();
		return getPageTitle();
	}
	
	public String SignInPage() {
		getSignIn().click();
		return getPageTitle();
	}
	
	public String CreateAccPage() {
		getCreateAccount().click();
		return getPageTitle();
	}
	
	public String HomePage() {
		getHomePage().click();
		return getPageTitle();
	}
	
	public String FindJobPage() {
		getFindJob().click();
		return getPageTitle();
	}
	
	public String JobAlertPage() {
		getJobAlert().click();
		return  getPageTitle();
	}
	
	public String SearchRecPage() {
		getSearchRecruiter().click();
		return getPageTitle();
	}
	
	public String JobBlog() {
		getJobBlog().click();
		return getPageTitle();
	}
	
	public String SectorList() {
		List<WebElement> li = sectorList.findElements((SearchContext) By.tagName("li"));
		for (int i=0;i<li.size();i++) {
			Random r=new Random();
			li.get(r.nextInt(5)).click();
		}
		return getPageTitle();
	}
}
	
