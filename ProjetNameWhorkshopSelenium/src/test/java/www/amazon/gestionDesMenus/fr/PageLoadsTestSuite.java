package www.amazon.gestionDesMenus.fr;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utiles;

public class PageLoadsTestSuite {

	WebDriver d;
	
	String url = "https://www.amazon.fr/";
     
	String titleAmazonPage0 = 	"Amazon.fr : livres, DVD, jeammar ";


	@Before
	public void initRun() {


		System.setProperty("webdriver.chrome.driver", "D:\\Formation11\\F18\\chromedriver.exe");

		// Arrange
		d = new ChromeDriver();

	}
	
	@Test
	public void pageLoadAmazonPage0LessThan5() {
		
		
		Utiles.assertResponseTimePageLoadLessThan(d, url, 20000);
	}

	
	
	@Test
	public void titlePageAmazonValid() {
		
		
		Utiles.assertTitleEquals(d, titleAmazonPage0);
		
	}
	
}
