package www.internet.herokuapp.com;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSConfirmTestSuite {

	WebDriver d;

	@Before
	public void initRun() {

		String url = "https://the-internet.herokuapp.com/javascript_alerts";

		System.setProperty("webdriver.chrome.driver", "D:\\Formation11\\F18\\chromedriver.exe");

		
		// Arrange
		d = new ChromeDriver();

		d.get(url);

		d.manage().window().maximize();

	}


	public void resultatPositiveApresValidationAlert() {

		d.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();

		Alert a = d.switchTo().alert();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		// Act
		a.accept();

		
		// Partie Validation
		
		// Assert
		
		
	}
	
	
	@Test
	public void AjouterTextApresClickOk() throws InterruptedException {
		
		
		d.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		
	
		
	//arrange

		
		
		
		d.switchTo().alert().sendKeys("FormationTestAuto");
		Thread.sleep(2000);
		
		d.switchTo().alert().accept();
		
		WebElement element = d.findElement(By.id("result"));
		
		
		String abc ="abcd user and pass: (admin)";
	

		
		//Assert
		
		System.out.println("111111111111111111111111111      " + abc);
		
		
		
		System.out.println("222222222222222222222222222      " + abc.split(" \\(")[0]);
		
		 Boolean expectedResult = element.getText().contains("FormationTestAuto");
		
		Assert.assertTrue(expectedResult);
		
	}

	
}
