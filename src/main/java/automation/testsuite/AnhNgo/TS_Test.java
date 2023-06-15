package automation.testsuite.AnhNgo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

public final class TS_Test extends CommonBase {

	@BeforeMethod
	public void init() {
		driver = initDriverTest("https://bepantoan.vn/danh-muc/may-hut-mui");
	}

	@Test
	public void practiceLocationElement() {
		pause(3000);
		driver.findElement(By.partialLinkText("Hút Mùi Ống Khói"));
		System.out.println("linkText is OK");
		driver.close();
	}
}
