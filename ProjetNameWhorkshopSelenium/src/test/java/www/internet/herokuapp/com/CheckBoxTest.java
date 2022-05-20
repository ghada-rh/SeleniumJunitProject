package www.internet.herokuapp.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	WebDriver driver;

	@Test
	public void allcheckBoxesSelectedTes() {

		String url = "https://the-internet.herokuapp.com/checkboxes";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stoufa\\Desktop\\FormationTestManuel\\TestAuto\\Selenium\\chromedriver.exe");

		// Arrange
		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		List<WebElement> checkBoxElements = driver.findElements(By.tagName("input"));
		
		System.out.println("le nombre de check boxes est : " + checkBoxElements.size());

		
		for (WebElement checkBox:checkBoxElements) {
			
			
			if(!checkBox.isSelected()) {
				
				checkBox.click();
			}
			
			Assert.assertTrue(checkBox.isSelected());
			
		}

	}

}
