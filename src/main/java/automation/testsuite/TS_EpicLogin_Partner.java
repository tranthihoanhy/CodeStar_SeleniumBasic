package automation.testsuite;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public final class TS_EpicLogin_Partner extends automation.common.CommonBase {
	@BeforeMethod
	public void init() {
		driver = initDriverTest("https://partners-staging.capa.ai/");
	}

	@AfterMethod
	public void after() {
		quitDriver(driver);
	}

	@Test
	public void CA_1_Login_1() {
		click(By.xpath("//span[contains(text(),'로그인/회원가입')]"));
		//getElementPresent(By.xpath("//h4[contains(text(),'카파 파트너스 로그인')]"));
	}

	@Test
	public void CA_1_Login_2() {
		click(By.xpath("//div[contains(@class,'MuiGrid-root MuiGrid-item')]//span[text()='파트너 가입 신청']"));
		//getElementPresent(By.xpath("//h3[contains(text(),'회원가입')]"));
	}

	@Test
	public void CA_1_Login_3() {
		click(By.xpath("//div[contains(@class,'MuiBox-root')]//span[text()='파트너 가입 신청']"));
		//getElementPresent(By.xpath("//h3[contains(text(),'회원가입')]"));
	}

	@Test
	public void CA_1_Login_4() {
		click(By.xpath("//span[contains(text(),'로그인/회원가입')]"));
		//type(By.xpath("//input[@name='email']"), "quannh1+1@gemvietnam.com", false);
		//type(By.xpath("//input[@name='password']"), "quannh1@", false);
		click(By.xpath("//span[text()='로그인']"));
	}
}