package automation.testsuite.TrangNguyen;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.support.pagefactory.*;

import automation.pageLocatorTrangNTH.LoginPage_days14;
import automation.common.CommonBase;
import automation.constant.CT_Account;

public class Client_test extends CommonBase {
	WebDriver driver;

	@BeforeTest
	public void openchromeDriver() {
		driver = initChromeDirvier(CT_Account.webURL);
	}

	public void addClient() {
		LoginPage_days14 login = new LoginPage_days14(driver);
		login.LoginFunction("admin@demo.com", "riseDemo");
		// sau đăng nhập click vào clientlink bên dashboard

		// gọi gàm addclient bên PageCLient
	}

}
