package www.szimek.gestionSignature.contracts.com;

import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GestionSignatureTestSuite {

	WebDriver d;
	
	private static String downloadPath = "D:\\seleniumdownloads";


	@Before
	public void initRun() {

		String url = "https://szimek.github.io/signature_pad/";

		System.setProperty("webdriver.chrome.driver", "D:\\Formation11\\F18\\chromedriver.exe");

		// Arrange
		d = new ChromeDriver();

		d.get(url);

		d.manage().window().maximize();

	}
	
	
   @Test
	public void signationContratNonEtablieJusquaDownloadImg() {
			

	
	WebElement	saveImgSignature = d.findElement(By.xpath("//button[contains(text(),'Save as JPG')]"));
	
	
	saveImgSignature.click();
	
	WebDriverWait wait = new WebDriverWait(d, 3);
	
	wait.until(ExpectedConditions.alertIsPresent());
	

//	
//	Alert a = d.switchTo().alert();
//	
//	System.out.println(a.getText());
//	
//	Assert.assertFalse(saveImgSignature.isEnabled());
		
		

	}

   @Test
	public void signationContratEtablieJusquaDownloadImg() {
		
		WebElement boxSignatureElem = d.findElement(By.xpath("//body/div[@id='signature-pad']/div[1]/canvas[1]"));
		
		
		
		Actions drawSignature = new Actions(d);
		
	Action 	act  = 	drawSignature.moveToElement(boxSignatureElem, 1, 1)  // start point 
		.clickAndHold(boxSignatureElem)
		.moveByOffset(100, 60)
		.moveByOffset(0, 0)		
		.moveByOffset(90, 50)
		.moveByOffset(100, 0)
		.moveByOffset(-300, 0)
		.moveByOffset(-50, -200)
		.release(boxSignatureElem)
		
		.build();
		
		
		
		// build() : Construire la chaine ( l'ensemble des actions ) 
		// perform() :  exécuter la chaine 
		
		
	
		act.perform();
		
		WebDriverWait wait = new WebDriverWait(d, 5);
		
		wait.until(ExpectedConditions.alertIsPresent());
		
	WebElement	saveImgSignature = d.findElement(By.xpath("//button[contains(text(),'Save as JPG')]"));
	
//	Assert.assertTrue(saveImgSignature.isEnabled());

	
		
	saveImgSignature.click();
	

		


	}
   
   


}
