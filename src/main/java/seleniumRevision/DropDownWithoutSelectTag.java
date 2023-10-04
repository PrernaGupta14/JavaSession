package seleniumRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelectTag {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");

		WebElement element = driver.findElement(By.xpath("//div[@class=' css-1hwfws3']/div[text()='Select Option']"));
		element.click();

		List<WebElement> dropdown_list = driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));
		System.out.println(dropdown_list.size());

		for (WebElement e : dropdown_list) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains("Group 1, option 1")) {
				e.click();
				break;
			}
			System.out.println(e.getText());

		}
	}

}
