import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class McdJunit {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
//		System.setProperty("webdriver.chrome.driver","/Users/himanshumehta/Desktop/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.mcdonalds.com/ca/en-ca.html");
//		
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testTitle() {	
		
		// Test case 1 :Title of the subscription feature is “Subscribe to my Mcd’s”
		
		System.setProperty("webdriver.chrome.driver","/Users/himanshumehta/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mcdonalds.com/ca/en-ca.html");
		WebElement SubscribeText = driver.findElement(By.className("click-before-outline"));
		String SubscribeTextData = SubscribeText.getText();
		
		assertEquals("Subscribe to My McD’s®", SubscribeTextData);
		
	}

	
	@Test
	public void testPosEmailSignup() {
		System.setProperty("webdriver.chrome.driver","/Users/himanshumehta/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mcdonalds.com/ca/en-ca.html");
		WebElement FirstName = driver.findElement(By.id("firstname2"));
		FirstName.sendKeys("Shikhar");
		
		WebElement Email = driver.findElement(By.id("email2"));
		Email.sendKeys("hmehta095@gmail.com");
		
		WebElement PostCode = driver.findElement(By.className("postalcode"));
		PostCode.sendKeys("00000M1V");
		
		
		WebElement SubscribeButton = driver.findElement(By.id("g-recaptcha-btn-2"));
		SubscribeButton.click();
	}
	
	
	@Test
	public void testNegEmailSignup() {

	}
	
	
	
}
