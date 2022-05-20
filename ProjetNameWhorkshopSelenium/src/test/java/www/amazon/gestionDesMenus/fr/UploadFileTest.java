package www.amazon.gestionDesMenus.fr;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;


public class UploadFileTest {
	
	
	@Test
	public void uploadFile() throws InterruptedException {
		
		
		String url = "https://the-internet.herokuapp.com";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stoufa\\Desktop\\FormationTestManuel\\TestAuto\\Selenium\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();	
		driver.get(url);
		
		System.out.println("Upload file test");
		WebElement pageLink = driver.findElement(By.xpath("//a[contains(text(),'File Upload')]"));
		pageLink.click();
		WebElement uploadFileLink = driver.findElement(By.cssSelector("input#file-upload"));
		uploadFileLink.sendKeys("C:\\Users\\stoufa\\Desktop\\FormationSelenium\\seleniumFeatures.jpg");
		WebElement uploadSubmit = driver.findElement(By.cssSelector("input[type='submit']"));
		uploadSubmit.click();	
		
		WebElement ele = driver.findElement(By.id("uploaded-files"));
		
		System.out.println(ele.getAttribute("outerHTML"));
		
		String el = ele.getAttribute("innerHTML");
		
		Assert.assertTrue(!el.isEmpty());
		
	}

}
