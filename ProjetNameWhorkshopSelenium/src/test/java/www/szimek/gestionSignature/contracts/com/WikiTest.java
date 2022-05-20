package www.szimek.gestionSignature.contracts.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WikiTest {
	
	
	WebDriver d;

	@Before
	public void initRun() {

		String url = "https://www.wiki.tn/";

		System.setProperty("webdriver.chrome.driver", "D:\\Formation11\\F18\\chromedriver.exe");

		// Arrange
		d = new ChromeDriver();

		d.get(url);

		d.manage().window().maximize();

	}
	
	
	@Test
	public void test() {
		
	WebElement ele =	d.findElement(By.xpath("//header/section[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/span[1]"));
		
	Actions act = new Actions(d);
	
	act.moveToElement(ele).perform();
	
	d.findElement(By.xpath("//header/section[1]/div[2]/div[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]")).click();

	
	 // Perform the click operation that opens new window
	
	d.findElement(By.xpath("//body/section[@id='page']/section[@id='columns']/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/a[1]")).click();

	
	

   
   Set<String> handlesSet = d.getWindowHandles();
   List<String> handlesList = new ArrayList<String>(handlesSet);

   d.switchTo().window(handlesList.get(0));

   
   try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
WebElement el1 = d.findElement(By.xpath("//span[contains(text(),'Continuer mes achats')]"));

System.out.println(el1.getText());

el1.click();

//
//act.moveToElement(target).perform();
//
//target.click();

System.out.println("hhhhhhh2");



//	
	WebElement ele2 = d.findElement(By.xpath("//header/section[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[7]/div[1]/div[1]/div[2]/a[1]/span[1]/span[1]"));
//	
//	
	act.moveToElement(ele2).perform();
//	
//	}
//	
	}}
	


