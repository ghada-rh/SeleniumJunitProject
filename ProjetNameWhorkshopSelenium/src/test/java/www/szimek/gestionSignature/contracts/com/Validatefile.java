package www.szimek.gestionSignature.contracts.com;

import java.io.File;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validatefile {
	
	
	
	private static WebDriver driver;

	private static String fileDownloadpath = "C:\\Téléchargements";

	private String URL="https://file-examples.com/index.php/sample-documents-download/sample-doc-download/";

		//Open Browser

	@Before

	public void browser(){

	System.setProperty("webdriver.chrome.driver","D:\\Formation11\\F18\\chromedriver.exe");

	driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().deleteAllCookies();
	
	

	}

	// Download the file and Validate file with Name

	@Test

	 public void verifywithName(){

		driver.get("http://uitestpractice.com/Students/");
		System.out.println(driver.getCurrentUrl());
		List<WebElement> accordionLinks = driver.findElements(By.tagName("span")) ;
		System.out.println(accordionLinks.size());
		for(WebElement element:accordionLinks) {
			if(element.getText().equals("Coded UI")){
				element.findElement(By.tagName("span")).click();
			}
		}		
		
//		driver.quit();
	}	
	

	// Check the downloaded file in the download folder



	 public boolean isFileDownloaded(String fileDownloadpath, String fileName) {

	boolean flag = false;

	File directory = new File(fileDownloadpath);

	File[] content = directory.listFiles();

	 for (int i = 0; i < content.length; i++) {
	 if (content[i].getName().equals(fileName))
	return flag=true;
	  		}
	return flag;
	 }
	//Quit from browser		 
//	@After
//	 public void closebrowser(){
//	 driver.quit();
//	 	}		 
//	
}
