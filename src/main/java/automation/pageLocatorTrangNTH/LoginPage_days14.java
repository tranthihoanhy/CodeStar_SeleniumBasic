package automation.pageLocatorTrangNTH;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage_days14 {
	private WebDriver driver;

//	private WebDriverWait driverWaited;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement txtEmail;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement txtPass;

	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	private WebElement btnLogin;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	public static By errorAuthentication = By.xpath("//div[@class='alert alert-danger']");

	@FindBy(xpath = "//span[@class='Please enter a valid email address")
	public static By ErrorUsername = By.xpath("//div[@class='alert alert-danger']");

	@FindBy(xpath = "//span[@id='email-error']")
	public static By Emailisrequired = By.xpath("//span[@id='email-error']");

	@FindBy(xpath = "//span[@id='email-error']")
	public static By Emailisinvalid = By.xpath("//span[@id='email-error']");

	@FindBy(xpath = "//span[@id='email-error']")
	public static By PWisrequired = By.xpath("//span[@id='password-error']");

	public LoginPage_days14(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void LoginFunction(String email, String password) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		txtPass.clear();
		txtPass.sendKeys(password);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		btnLogin.click();
	}
}
