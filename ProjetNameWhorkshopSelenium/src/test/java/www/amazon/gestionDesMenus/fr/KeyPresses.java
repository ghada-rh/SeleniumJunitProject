package www.amazon.gestionDesMenus.fr;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPresses {
	
	
	@Test
	public void allOptionsExists() throws InterruptedException {
		
		
		String url = "https://the-internet.herokuapp.com";

		System.setProperty("webdriver.chrome.driver", "D:\\Formation11\\F18\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();	
		driver.get(url);
		
		driver.findElement(By.xpath("//a[contains(text(),'Key Presses')]")).click();
		Actions action = new Actions(driver);
		action.sendKeys("S").perform();
		System.out.println(driver.findElement(By.cssSelector("p#result")).getText());
		
		Thread.sleep(3000);
		driver.quit();
	}

}
