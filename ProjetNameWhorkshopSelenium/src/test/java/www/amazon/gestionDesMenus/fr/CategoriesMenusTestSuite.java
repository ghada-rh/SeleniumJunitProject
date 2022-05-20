package www.amazon.gestionDesMenus.fr;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utiles;

public class CategoriesMenusTestSuite {
	
	
	WebDriver d;
	
	String xpathMenuCategorie = "//select[@id='searchDropdownBox']";
	
	
	@Before
	public void initRun() {

		String url = "https://www.amazon.fr/";

		System.setProperty("webdriver.chrome.driver", "D:\\Formation11\\F18\\chromedriver.exe");

		
		// Arrange
		d = new ChromeDriver();

		d.get(url);

		d.manage().window().maximize();

	}
	
	
	@Test
	public void allOptionsExists() {
		
	WebElement menuElem = d.findElement(By.xpath(xpathMenuCategorie));
	
	Utiles.assertMenuContainsOption(menuElem, "Bagages");
	
			
		
	}
	

	
	
	
	

}
