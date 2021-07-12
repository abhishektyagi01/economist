package testFeature;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import screenList.pageList;


public class mainTest extends basicTest {
	
pageList listTopBar;
	
	@Test(alwaysRun=true)
	public void goToSignInPage() {
		String SignInPageTitle = page.getInstance(pageList.class).SignInPage();
		assertEquals(SignInPageTitle, "Logon | Jobs.Economist.com");
	}

	@Test(alwaysRun=true)
	public void goToCreateAccPage() {
		String CreateAccPageTitle = page.getInstance(pageList.class).CreateAccPage();
		assertEquals(CreateAccPageTitle, "Register | Jobs.Economist.com");
	}
	
	@Test(alwaysRun=true)
	public void goToJobsBlogPage() {
		String JobsBlogPageTitle = page.getInstance(pageList.class).JobBlog();
		assertEquals(JobsBlogPageTitle, "Articles and career information on Jobs.Economist.com");
	}
	
	@Test(alwaysRun=true)
	public void goToSrchRecPage() {
		String SrchRecPageTitle = page.getInstance(pageList.class).SearchRecPage();
		assertEquals(SrchRecPageTitle, "Recruiters on Jobs.Economist.com");
	}
	
	@Test(alwaysRun=true)
	public void goToJobAlertPage() {
		String JobAlertPageTitle = page.getInstance(pageList.class).JobAlertPage();
		assertEquals(JobAlertPageTitle, "New Job By Email | Jobs.Economist.com");
	}
	
	@Test(alwaysRun=true)
	public void goToFindJobPage() {
		String FindJobPageTitle = page.getInstance(pageList.class).FindJobPage();
		assertEquals(FindJobPageTitle, " Browse jobs | Jobs.Economist.com ");
	}
	
	@Test(alwaysRun=true)
	public void goToHomePage() {
		String HomePageTitle = page.getInstance(pageList.class).HomePage();
		assertEquals(HomePageTitle, " Jobs.Economist.com | jobs | Choose from 63 live vacancies ");
	}

}
