package seleniumRevision;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();
		
		/**
		 * ---1. We can access driver in this class beacuse in Utility class we does'nt make it private
			---2. 15th line will give NullPointerException in case of accessing non private driver
					bUtil.driver= new ChromeDriver();
					bUtil.driver.get("");
		 */
		
		
		//Launch browser and enter url
		bUtil.launchBrowser("firefox");
		bUtil.enterUrl("https://www.amazon.com/");
		
		//---Test Amazon Page Title
		String title= bUtil.getPageTitle();
		if (title.contains("Amazon")) {
			System.out.println("Page title is correct: "+title);
		}
		else {
			System.out.println("Page title is not correct");
		}
		
		//---Test Amazon Page Url
		String pageUrl =bUtil.getPageUrl();
		if (pageUrl.contains("amazon")) {
			System.out.println("Page url is correct: " + pageUrl);
		}
		else {
			{
				System.out.println("Page url is not correct");
			}
		}
		
		bUtil.closeBrowser();
	
		
	}

}
