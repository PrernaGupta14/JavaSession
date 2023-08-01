package seleniumRevision;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import CustomException.BrowserException;

public class ElementUtil {

	// Default value of driver is pointing to NULL so make it private for unnecssary
	// access in other class
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	// *****************************Element Methods***********************
	public void doSendKeys(By locator, String value) {
		if (value == null) {
			throw new BrowserException("ValueCanNotBeNull");

		}
		getElement(locator).sendKeys(value);
	}

	public boolean elementIsDisable(By locator) {
		String dis_val = getElement(locator).getAttribute("disabled");
		if (dis_val.equals("true")) {
			return true;
		}
		return false;
	}

	public boolean elementIsEnable(By locator) {
		boolean flag = getElement(locator).isEnabled();
		return flag;
	}

	public String getElementText(By locator) {
		return getElement(locator).getText();
	}

	public String getAttributeValue(By locator, String name) {
		String attrValue = getElement(locator).getAttribute(name);
		return attrValue;
	}

	public boolean checkElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public String getLinkText(By locator) {
		String string = getElement(locator).getText();
		return string;
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	// return of findElement method is Web element so method type will be WebElement
	// inplace of void
	public WebElement getElement(By locator) {
		// intially web element value is null
		WebElement element = null;

		// handle exception if given locator is not availble on page
		try {
			element = driver.findElement(locator);
		} catch (NoSuchElementException e) {
			System.out.println("getting element exception");
			e.printStackTrace();
			// may be page not loaded properly so again applying 2 sec static wait to find
			// the locator on page
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			element = driver.findElement(locator);
		}
		return element;
	}

	// **********************Element List Method**********************
	public String getElementsListText(By locator) {
		int count = 0;
		String list_text = "";
		for (WebElement e : getElements(locator)) {
			list_text = e.getText();

			// check for blank spaces which link don't have ant text
			if (!list_text.isEmpty()) {
				System.out.println(count + "  " + list_text);
			}
			count++;
		}
		return list_text;
	}

	public void clickOnListElement(By locator, String linktext) {
		List<WebElement> linkList = getElements(locator);
		for (WebElement e : linkList) {
			String text = e.getText();
			if (text.equals(linktext)) {
				e.click();
				break;
			}
		}
	}

	public void getElementsListAttribute(By locator, String name) {
		for (WebElement e : getElements(locator)) {
			String list_Attr_text = e.getAttribute(name);
			System.out.println(list_Attr_text);
		}
	}

	public int getElementsListCount(By locator) {
		return getElements(locator).size();
	}

	public List<WebElement> getElements(By locator) {
		// storing the list of locators in dynamic list of WebElements
		List<WebElement> locElements = driver.findElements(locator);
		return locElements;

	}

	// *********************Search Element Method****************************

	public void SearchText(By searchLocator, String searchName, By suggestionLocator, String name)
			throws InterruptedException {
		doSendKeys(searchLocator, searchName);
		Thread.sleep(4000);
		List<WebElement> suggList = getElements(suggestionLocator);
		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String suggestionText = e.getText();
			System.out.println(suggestionText);
			if (suggestionText.contains(name)) {
				e.click();
				break;
			}
		}
	}

	// ********************************Dropdown Utils*******************************

	public void SelectOptionWithoutSelectClass(By locator, String dropdownValue) {
		List<WebElement> opList = getElements(locator);
		for (WebElement e : opList) {
			String text = e.getText();
			if (text.contains(dropdownValue)) {
				e.click();
				break;
			}
		}
	}

	public void SelectOptionWithoutSelectMethods(By locator, String dropdownValue) {
		Select select = new Select(getElement(locator));
		List<WebElement> optList = select.getOptions();
		for (WebElement e : optList) {
			String text = e.getText();
			if (text.contains(dropdownValue)) {
				e.click();
				break;
			}
		}
	}

	public int optionsListCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}

	public List<String> getOptionsListText(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optiList = select.getOptions();
		List<String> optStrings = new ArrayList<String>();
		int count = 0;
		for (WebElement e : optiList) {
			String text = e.getText();
			System.out.println(count + "  " + text);
			optStrings.add(text);
			count++;
		}
		return optStrings;
	}

	public void SelectDropdownOptionByIndex(By loactor, int index) {
		if (index < 0) {
			throw new BrowserException("IndexCanNotBeNegative");

		}
		Select select = new Select(getElement(loactor));
		select.selectByIndex(index);
	}

	public void SelectDropdownOptionByValue(By loactor, String value) {
		if (value == null) {
			throw new BrowserException("ValueCanNotBeNull");

		}
		Select select = new Select(getElement(loactor));
		select.selectByValue(value);
	}

	public void SelectDropdownOptionByVisibleText(By locator, String text) {
		if (text == null) {
			throw new BrowserException("TextCanNotBeNull");

		}
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	// ********************Actions Class Utils*****************************

	public void selectRightClickOption(By contextLocator, String optionName) {
		Actions actions = new Actions(driver);
		actions.contextClick(getElement(contextLocator)).perform();
		By click_option= By.xpath("//*[text()='"+optionName+"']");
		getElement(click_option).click();			
	}


	public void twoLevelMenuHandling(By Parentlocator, By Childlocator) throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(getElement(Parentlocator)).perform();
		Thread.sleep(4000);
		getElement(Childlocator).click();
	}
	}
































