package automation.testsuite.TrangNguyen;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.pageLocatorTrangNTH.*;

public class loginTest extends CommonBase {
	WebDriver driver;
 @BeforeTest
 public void openChromeDriver()
{
	driver = initChromeDirvier(CT_Account.webURL);
}
	 
 @Test
 public void LoginSS() {
	 LoginPage login = new LoginPage(driver);
	 login.Login("admin@demo.com", "riseDemo"); 
 }
 @Test
 public void LoginUnSS() {
	 LoginPage login = new LoginPage(driver);
	 login.Login("admin1@demo.com", "rise1Demo");
	 WebElement txtError = driver.findElement(LoginPage.errorAuthentication);
			 assertTrue(txtError.isDisplayed());
 }
 @AfterTest
 public void closeChromeBrower() 
 {
	 quitDriver(driver);
}
}