package www.internet.herokuapp.com;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	
	
	WebDriver driver;

	@Test
	public void allcheckBoxesSelectedTes() {

		String url = "https://the-internet.herokuapp.com/upload";

		System.setProperty("webdriver.chrome.driver", "D:\\Formation11\\F18\\chromedriver.exe");

		// Arrange
		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

}
