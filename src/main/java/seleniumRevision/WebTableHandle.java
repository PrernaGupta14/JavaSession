package seleniumRevision;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import seleniumRevision.BrowserUtil;
//import seleniumRevision.ElementUtil;

public class WebTableHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();
		driver = bUtil.launchBrowser("chrome");

		bUtil.enterUrl("https://selectorshub.com/xpath-practice-page/");

//		ElementUtil eUtil = new ElementUtil(driver);
//
//		By table_checkbox = By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']");
//		eUtil.doClick(table_checkbox);
		
		selectCheckbox("Joe.Root");
		System.out.println(getEmpInfo("Joe.Root"));
}
	
	public static void selectCheckbox(String Emp_name) {
		driver.findElement(By.xpath("//a[text()='"+Emp_name+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static List<String> getEmpInfo(String Emp_name)
	{
		List<WebElement> info_list=   driver.findElements(By.xpath("// a[text()='"+Emp_name+"']/parent::td/following-sibling::td"));
		System.out.println(info_list.size());
		
		//to store values in array
		List<String> infovalList = new ArrayList<String>();
			
		for (WebElement e : info_list) {
			String text = e.getText();
			infovalList.add(text);
		}
		return infovalList;
	}

}

// a[text()='Joe.Root']/parent::td/ancestor::tr//input[@type='checkbox']
