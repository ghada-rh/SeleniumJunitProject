package helper;




import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utiles {

	// couche abstraction

	public static void delai(long ms) {

		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	
	
	public static void assertMenuContainsOption(WebElement element, String expectedOption) {

		Select select = new Select(element);

		Boolean res = false;

		for (WebElement optionElement : select.getOptions()) {

			if (optionElement.getText().equals(expectedOption)) {

				res = true;

			}

		}

		Assert.assertTrue("This OptionEelement is not found",res);

	}

	public static void assertTitleEquals(WebDriver driver, String expectedTitle) {

		Assert.assertEquals(expectedTitle, driver.getTitle());

	}
	
	
	
	
	public static void assertResponseTimePageLoadLessThan(WebDriver driver,String url,int msTime)
	{
		
		
	Long start 	=System.currentTimeMillis();
	
	driver.get(url);
	
	Long end  =System.currentTimeMillis();
	
	
	Long duree = end - start;
	
	
	Assert.assertTrue("La page a pris plus de temps que "+msTime,duree<msTime);

		
	}


}
