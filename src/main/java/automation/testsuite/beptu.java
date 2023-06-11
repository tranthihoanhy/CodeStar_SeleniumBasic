package automation.testsuite;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class beptu {
	@Test
	public static void hienThiDanhSachBepTuTheoMucGia() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();// khởi tạo chrome driver
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// implicit wait, đợi trong 5 giây
		driver.get("https://bepantoan.vn/");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.xpath("/descendant::a[contains(text(),'Bếp Từ')][1]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Đợi đến khi có thể click vào element1
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(element1));
		element1.click();
		WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'5.000.000 > 10.000.000')]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Đợi đến khi có thể click vào element2
		wait.until(ExpectedConditions.elementToBeClickable(element2));
		element2.click();
		driver.close();
	}

	@Test
	public static void hienThiBepTuTheoXuatXu() { // tên Phương thức là hienThiBepTuTheoXuatXu
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();// khởi tạo chrome driver
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// implicit wait, đợi trong 5 giây
		driver.get("https://bepantoan.vn/");
		WebElement element1 = driver.findElement(By.xpath("/descendant::a[contains(text(),'Bếp Từ')][1]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element1.click();
		WebElement element2 = driver.findElement(By.xpath("//input[@id='england-1027']"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element2.click();
	}

	@Test
	public static void hienThiBepTuTheoSoBep() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();// khởi tạo chrome driver
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// implicit wait, đợi trong 5 giây
		driver.get("https://bepantoan.vn/");
		WebElement element1 = driver.findElement(By.xpath("/descendant::a[contains(text(),'Bếp Từ')][1]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element1.click();
		WebElement element2 = driver.findElement(By.xpath("//input[@id='6-bep-1014']"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element2.click();
	}

	public static void main4() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();// khởi tạo chrome driver
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// implicit wait, đợi trong 5 giây
		driver.get("https://bepantoan.vn/");
		WebElement element1 = driver.findElement(By.xpath("/descendant::a[contains(text(),'Bếp Từ')][1]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element1.click();
		WebElement element2 = driver.findElement(By.xpath("//input[@id='bep-tu-1009']"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element2.click();
	}

	public static void main5(String[] arg) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();// khởi tạo chrome driver
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// implicit wait, đợi trong 5 giây
		driver.get("https://bepantoan.vn/");
		WebElement element1 = driver.findElement(By.xpath("/descendant::a[contains(text(),'Bếp Từ')][1]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element1.click();
		WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'Giá cao')]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element2.click();
	}

	public static void main6(String[] arg) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();// khởi tạo chrome driver
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// implicit wait, đợi trong 5 giây
		driver.get("https://bepantoan.vn/");
		WebElement element1 = driver.findElement(By.xpath("/descendant::a[contains(text(),'Bếp Từ')][1]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element1.click();
		WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'Giá thấp')]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element2.click();
	}

	public static void main7(String[] arg) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();// khởi tạo chrome driver
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// implicit wait, đợi trong 5 giây
		driver.get("https://bepantoan.vn/");
		WebElement element1 = driver.findElement(By.xpath("/descendant::a[contains(text(),'Bếp Từ')][1]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element1.click();
		WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'Giảm giá nhiều')]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element2.click();
	}
}
