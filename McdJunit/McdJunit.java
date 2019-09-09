import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class McdJunit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","/Users/himanshumehta/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mcdonalds.com/ca/en-ca.html");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testTitle() {
		
	}

	
	@Test
	public void testPosEmailSignup() {
		
	}
	
	
	@Test
	public void testNegEmailSignup() {
		
	}
	
	
	
}
