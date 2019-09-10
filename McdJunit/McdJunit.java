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
//		WebElement popScreen = driver.findElement(By.cssSelector("a.exit"));
//		popScreen.click();
//		
	}

	@After
	public void tearDown() throws Exception {
//		Thread.sleep(5000);
//		driver.close();
	}

	@Test
	public void testTitle() throws InterruptedException {	
		
		// Test case 1 :Title of the subscription feature is “Subscribe to my Mcd’s”
		
		System.setProperty("webdriver.chrome.driver","/Users/himanshumehta/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mcdonalds.com/ca/en-ca.html");
		WebElement popScreen = driver.findElement(By.cssSelector("a.exit"));
		popScreen.click();
		WebElement SubscribeText = driver.findElement(By.className("click-before-outline"));
		String SubscribeTextData = SubscribeText.getText();
		
		assertEquals("Subscribe to My McD’s®", SubscribeTextData);
		Thread.sleep(5000);
		driver.close();
		
	}

	
	@Test
	public void testPosEmailSignup() throws InterruptedException {
		
		//Test case 2: Email signup with valid details
		
		System.setProperty("webdriver.chrome.driver","/Users/himanshumehta/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mcdonalds.com/ca/en-ca.html");

		WebElement popScreen = driver.findElement(By.cssSelector("a.exit"));
		popScreen.click();
		WebElement FirstName = driver.findElement(By.id("firstname2"));
		FirstName.sendKeys("Himanshu Mehta");
		
		WebElement Email = driver.findElement(By.id("email2"));
		Email.sendKeys("simranbal01@gmail.com");
		
		WebElement PostCode = driver.findElement(By.className("postalcode"));
		PostCode.sendKeys("    M1V");
		
		
		WebElement SubscribeButton = driver.findElement(By.id("g-recaptcha-btn-2"));
		SubscribeButton.click();
		
//		WebElement VerifyButton = driver.findElement(By.id("recaptcha-verify-button"));
//		VerifyButton.click();
		
		Thread.sleep(5000);
		driver.close();

		
		
	}
	



	@Test
	public void testNegEmailSignup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/Users/himanshumehta/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mcdonalds.com/ca/en-ca.html");

		WebElement popScreen = driver.findElement(By.cssSelector("a.exit"));
		popScreen.click();

		WebElement SubscribeButton = driver.findElement(By.id("g-recaptcha-btn-2"));
		SubscribeButton.click();
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
}
