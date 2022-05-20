package www.internet.herokuapp.com;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DynamicLoadingTestSuite {
	WebDriver driver;

	
	
	@Before
	public void init() {
		



			String url = "http://the-internet.herokuapp.com/dynamic_loading/1";

			System.setProperty("webdriver.chrome.driver", "D:\\Formation11\\F18\\chromedriver.exe");

			
			// Arrange
			driver = new ChromeDriver();

			driver.get(url);

			driver.manage().window().maximize();
            
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
		
		}
	
	
	@Test
	public void HelloWordAfficheApresStartAction() {
		
		
		WebElement eleStart =driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
		
		eleStart.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		 WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello World!')]")));
				
		 
		System.out.println(ele.getAttribute("innerHTML"));
		 
		 
	     org.junit.Assert.assertEquals("Hello World!", ele.getText());
		
		
	}

		
	}
	
	


