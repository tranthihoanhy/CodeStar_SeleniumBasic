package automation.testsuite.TrangNguyen;

import static org.testng.AssertJUnit.assertFalse;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import automation.pageLocatorTrangNTH.*;
import automation.common.CommonBase;
import automation.constant.CT_Account;

public class Login_Test_factory extends CommonBase {
	WebDriver driver;

//    @BeforeTest
//	public void openChromeDriver() {
//		driver = initChromeDirvier(CT_Account.webURL);
//		
//	}
	@Test
	public void LoginSS() {
		driver = initChromeDirvier(CT_Account.webURL);
		LoginPage_days14 login = new LoginPage_days14(driver);
		login.LoginFunction("admin@demo.com", "riseDemo");
		WebElement titleDasboard = driver.findElement(DashboardPage.textDashboard);
		assertTrue(titleDasboard.isDisplayed());
		driver.close();
	}

	@Test
	public void LoginUSS() {
		driver = initChromeDirvier(CT_Account.webURL);
		LoginPage_days14 login = new LoginPage_days14(driver);
		login.LoginFunction("admi1n@demo.com", "riseDemo");
		WebElement txtError = driver.findElement(LoginPage_days14.errorAuthentication);
		assertTrue(txtError.isDisplayed());
		driver.close();
	}

	@Test
	public void LoginUnSS_not_valid_username() {
		driver = initChromeDirvier(CT_Account.webURL);
		LoginPage_days14 login = new LoginPage_days14(driver);
		login.LoginFunction("admin1@demo.com", "riseDemo");
		WebElement txtError = driver.findElement(LoginPage_days14.errorAuthentication);
		assertTrue(txtError.isDisplayed());
		driver.close();
	}

	@Test
	public void LoginUnSS_username_is_Blank() {
		driver = initChromeDirvier(CT_Account.webURL);
		LoginPage_days14 login = new LoginPage_days14(driver);
		login.LoginFunction("", "riseDemo");
		WebElement txtError = driver.findElement(LoginPage_days14.Emailisrequired);
		assertTrue(txtError.isDisplayed());
		driver.close();	}

//	@Test
//	public void LoginUnSS_username_have_space_between() {
//		driver = initChromeDirvier(CT_Account.webURL);
//		LoginPage login = new LoginPage(driver);
//		login.LoginFunction("admin @demo.com", "riseDemo");
//		WebElement txtError = driver.findElement(LoginPage.Emailisinvalid);
//		assertTrue(txtError.isDisplayed());
//		driver.close();
//	}

	@Test
	public void LoginUnSS_not_valid_password() {
		driver = initChromeDirvier(CT_Account.webURL);
		LoginPage_days14 login = new LoginPage_days14(driver);
		login.LoginFunction("admin@demo.com", "rise1Dem1o");
		WebElement txtError = driver.findElement(LoginPage_days14.errorAuthentication);
		assertTrue(txtError.isDisplayed());
		driver.close();
	}

	@Test
	public void LoginUnSS_password_is_Blank() {
		driver = initChromeDirvier(CT_Account.webURL);
		LoginPage_days14 login = new LoginPage_days14(driver);
		login.LoginFunction("admin@demo.com", "");
		WebElement txtError = driver.findElement(LoginPage_days14.PWisrequired);
		assertTrue(txtError.isDisplayed());
		driver.close();
	}

	@Test
	public void LoginUnSS_password_have_space_between() {
		driver = initChromeDirvier(CT_Account.webURL);
		LoginPage_days14 login = new LoginPage_days14(driver);
		login.LoginFunction("admin@demo.com", "rise Demo");
		WebElement txtError = driver.findElement(LoginPage_days14.errorAuthentication);
		assertTrue(txtError.isDisplayed());
		driver.close();
	}

	@AfterTest
	public void closeChromeBrower() {
		driver.close();
	}
}
