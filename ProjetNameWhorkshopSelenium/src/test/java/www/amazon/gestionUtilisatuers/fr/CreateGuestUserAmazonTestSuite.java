package www.amazon.gestionUtilisatuers.fr;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mifmif.common.regex.Generex;

public class CreateGuestUserAmazonTestSuite {
	
	WebDriver d;

	@Before
	public void initRun() {


		String url = "https://www.amazon.fr/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.fr%2Fgp%2Fcss%2Fhomepage.html%3Fref_%3Dnav_signin&prevRID=4RJJ3Z7RG1H4BYSQTNJ2&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=frflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=frflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Formation11\\F18\\chromedriver.exe");

		d = new ChromeDriver();
		

		d.get(url);

		d.manage().window().maximize();

	}
	
	
	@Test
	public void createGestUserEmailGenaratorOK() {
		
		
		String guestUserName = "GestUser";
		
		d.findElement(By.id("ap_customer_name")).sendKeys(guestUserName);
		
		String regex = "\\d{8}\\@gmail\\.com";
		
		Generex g = new Generex(regex);
		
		
		
		WebElement ele = d.findElement(By.id("ap_email"));
		
		ele.sendKeys(g.random());
		
		
	  System.out.println(ele.getText());
		
		
		
	}
	
	

}
