package automation.testsuite.TrangNguyen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automation.common.CommonBase;

@Test
public class testbuoi10 extends CommonBase {

	
	//public void isSingleCheckboxSelected() {
		// multil
//		driver = initDriverTest("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
//		boolean isSelected = false;
//		if (isSelected == false) {
//			driver.findElement(By.id("isAgeSelected")).click();
//			System.out.println("checkbox đang được select");
//		}
//		driver.close();
//	// radio
//		public void isRadioButtonSelected() {
//		driver = initDriverTest("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
//		WebElement checkboxMale=driver.findElement(By.xpath("(//input[@value='Male' and @type ='radio'])[2]"));
//		//tìm và check vào checkbox male đã được chọn hay chưa
//		boolean isSelected = checkboxMale.isSelected();
//		if (isSelected == false) {
//			//nếu false tức là chưa chọn thì sẽ click
//			checkboxMale.click();
//			System.out.println("checkbox đang được select");	 
//		}
//		else {
//			//nếu true thì mk sẽ check vào tk còn lại 
//			//tìm locator của female, sau đó click vào female và in ra
//			WebElement checkboxFemale=driver.findElement(By.xpath("(//input[@value='Female' and @type ='radio'])[2]"));
//			checkboxFemale.click();
//			System.out.println("checkbox female đang được select");	
//		}
//		driver.close();
//	} 	
	// Dropdownlist
	public void Dropdownlist() {
	driver = initDriverTest("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	//Select dates = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));​​
	//dates.selectByVisibleText("Monday");
//	System.out.println("size is:"+dates.getOptions().size());​
	WebElement Monday =driver.findElement(By.xpath("//select[@id='select-demo']"));
	Monday.click(); //mở droplist 
	Select dates = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
//	((Select) Monday).selectByIndex(2);
//	Monday.click(); //đóng droplist ​
//	driver.close();
	
}

}
