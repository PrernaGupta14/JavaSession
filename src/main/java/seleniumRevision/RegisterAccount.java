package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccount {

	public static void main(String[] args) {

		BrowserUtil browserUtil = new BrowserUtil();
		WebDriver driver = browserUtil.launchBrowser("chrome");
		browserUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By eMail = By.id("input-email");
		By tele = By.id("input-telephone");
		By pwd = By.id("input-password");
		By Cpwd = By.id("input-confirm");
		By news = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		By policy = By.name("agree");
		By Cbtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

		ElementUtil elementUtil = new ElementUtil(driver);

		elementUtil.doSendKeys(fName, "Prerna");
		elementUtil.doSendKeys(lName, "Gupta");
		elementUtil.doSendKeys(eMail, "qa@gmail.com");
		elementUtil.doSendKeys(tele, "1234567890");
		elementUtil.doSendKeys(pwd, "Alpha1234");
		elementUtil.doSendKeys(Cpwd, "Alpha1234");
		elementUtil.doClick(news);
		elementUtil.doClick(policy);
		elementUtil.doClick(Cbtn);

		By createdBy = By.xpath("//*[@id=\"content\"]/div/div/a");
		elementUtil.doClick(createdBy);
		System.out.println("Account Registered Succesfully");

		// ---> if account is already registered then print the error and login to the
		// page

		By alreadyRegisterd = By
				.xpath("//*[@id=\"account-register\"]//div[@class=\"alert alert-danger alert-dismissible\"]");
		String str = elementUtil.getElement(alreadyRegisterd).getText();
		System.out.println(str);

		if (str.contains("already registered")) {
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			By loginId = By.name("email");
			By loginpwd = By.name("password");
			By lbtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

			elementUtil.doSendKeys(loginId, "raashigupta1402@gmail.com");
			elementUtil.doSendKeys(loginpwd, "Alpha1234");
			elementUtil.doClick(lbtn);
		}

		browserUtil.quitBrowser();

	}
}
