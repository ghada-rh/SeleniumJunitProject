package www.amazon.gestionUtilisatuers.fr;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mifmif.common.regex.Generex;

public class AdminAuthenticationTestSuite {

	WebDriver d;

	@Before
	public void initRun() {


		String url = "https://www.amazon.fr/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Formation11\\F18\\chromedriver.exe");

		d = new ChromeDriver();
		

		d.get(url);

		d.manage().window().maximize();

	}

	// Classe d'exécusion des scénarios de tests relatifs a l'authentification

	// Le Nom de la classe est le nom de mon suite de test

	// Nous alllons exécuter a l'aide des annotations spéciale pour l'exécusion de
	// un ou plusieurs tests Cases

	// Le nom de chaque méthode est le nom de chaque scénario de test

	@Test
	public void authenticationDashbordProfilAdminCorrecte() {

		String login = "proservicetestauto@gmail.com";
		String pwd = "AdminProService";

		// Configuration

		// Arrange


		d.findElement(By.id("sp-cc-accept")).click(); // accepter les cookies

		// Actions
		d.findElement(By.id("nav-link-accountList-nav-line-1")).click();


		d.findElement(By.id("continue")).click();

		d.findElement(By.id("ap_password")).sendKeys(pwd);

		d.findElement(By.id("signInSubmit")).click();

		WebElement element = d.findElement(By.id("nav-link-accountList-nav-line-1"));

		String resultatActuel = element.getText();

		String resultatAttendu = "Bonjour admin";

		// Assertion

//		if (resultatActuel.equals(resultatAttendu)) {
//			
//			System.out.println("Passed");
//			
//		} else {
//			
//			System.out.println("Failed");
//
//		}

		Assert.assertEquals(resultatAttendu, resultatActuel);

	}

	@Test
	public void authenticationDashbordProfilAdminIncorrect() {

		String login = "proservicetestauto@gmail.com";
		String pwd = "AdminProService";



		d.findElement(By.id("sp-cc-accept")).click(); // accepter les cookies

		d.findElement(By.id("nav-link-accountList-nav-line-1")).click();

		d.findElement(By.id("ap_email")).sendKeys(login);

		d.findElement(By.id("continue")).click();

		d.findElement(By.id("ap_password")).sendKeys(pwd);

		d.findElement(By.id("signInSubmit")).click();

		WebElement element = d.findElement(By.id("nav-link-accountList-nav-line-1"));

		String resultatActuel = element.getText();

		String resultatInattendu = "Bonjour User";

		Assert.assertNotEquals(resultatInattendu, resultatActuel);

	}
//
//	@After
//	public void tearDown() {
//
//		d.close();
//		d.quit();
//
//	}

}
