package www.wiki.gestionAchats.tn;

import java.util.ArrayList;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AccessoiresPeripheriquesTestSuite {
	
	WebDriver driver;
	 String xpathSpanAccessoirePeripherique ="//header/section[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/span[1]";
	
	 String xpathCableUSB = "//header/section[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]";

	 String xpathAjoutCablePanier = "//body/section[@id='page']/section[@id='columns']/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/a[1]";
	
	 String xpathCommander = "//span[contains(text(),'Continuer mes achats')]";
	 
	 String xpathPanier = "//header/section[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[7]/div[1]/div[1]/div[2]/a[1]/span[1]/span[1]";
	 
	@Before
	public void initRun() {

		String url = "https://www.wiki.tn/";

		System.setProperty("webdriver.chrome.driver", "D:\\Formation11\\F18\\chromedriver.exe");

		// Arrange
		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

	}
	
	
	@Test
	public void ajoutCommandePanierEtabli() throws InterruptedException {
		
		WebElement accessoirePeripheriqueElement =  driver.findElement(By.xpath(xpathSpanAccessoirePeripherique));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(accessoirePeripheriqueElement).perform();
		
		driver.findElement(By.xpath(xpathCableUSB)).click();
		
		driver.findElement(By.xpath(xpathAjoutCablePanier)).click();
		
	    Set<String>   handlist	= driver.getWindowHandles();
	
   
		ArrayList<String> handlesetList = new ArrayList<String>(handlist);
		
		
		driver.switchTo().window(handlesetList.get(0));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(xpathCommander)).click();
		
		 WebElement panierElem = driver.findElement(By.xpath(xpathPanier)); 
		
		act.moveToElement(panierElem).perform();
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.cssSelector("body.order.hide-left-column.hide-right-column.lang_fr.fullwidth:nth-child(2) section.header-container div.nav div.container div.inner div.blockcart_top.pull-right:nth-child(8) div.shopping_cart div.cart_block.block.exclusive div.block_content div.cart_block_list dl.products dt.last_item:nth-child(4) div.cart-info div.product-name > a.cart_block_product_name"));

		
		System.out.println("111111111111111111111111111" + element.getText());
		
		System.out.println("222222222222222222222" + element.getText().split(" \\(")[0]);

		
		Assert.assertTrue(element.getText().contains("RALLONGE"));
		
		
	}
	
	
	@After
	public void tearDown() {
		
		driver.close();
		driver.quit();
		
		
	}
	
	

}
