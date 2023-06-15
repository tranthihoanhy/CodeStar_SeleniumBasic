package automation.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import static org.testng.Assert.assertTrue;

public final class TS_Test extends CommonBase {

	@BeforeMethod
	public void init() {
		driver = initDriverTest("https://partners-staging.capa.ai/");
	}

	@AfterMethod
//  public void after() {
//    quitDriver(driver);}

	@Test
	public void Demo_Testcase() {
		assertTrue(true);
		pause(3000);
	}

}
