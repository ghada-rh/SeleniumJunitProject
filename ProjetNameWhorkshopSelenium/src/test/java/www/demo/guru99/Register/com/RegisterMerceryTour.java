package www.demo.guru99.Register.com;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helper.Utiles;

public class RegisterMerceryTour {
	
	
	WebDriver d;
	
	String xpathselectCountry = "//select[@name='country']";
	
	String xpathSelectAlgeria = "//option[contains(text(),'ALGERIA')]";

	@Before
	public void initRun() {

		String url = "https://demo.guru99.com/test/newtours/register.php";

		System.setProperty("webdriver.chrome.driver", "D:\\Formation11\\F18\\chromedriver.exe");

		
		// Arrange
		d = new ChromeDriver();

		d.get(url);

		d.manage().window().maximize();

	}
	
	@Test
	public void registerWithCorrectValuteFromAlgeria() {
		
		// On suppose qu'on a renseigné tous les champs
		
		WebElement elemeMenu = d.findElement(By.xpath(xpathselectCountry));
		Select s = new Select(elemeMenu);
		
	
		
	//	s.selectByVisibleText("ALGERIA");
		
//	    WebElement elementAlgeria =	d.findElement(By.xpath(xpathSelectAlgeria));
	 
//	    Assert.assertTrue("Element is not selected", elementAlgeria.isSelected());
	    
		

		
		
	}

}
