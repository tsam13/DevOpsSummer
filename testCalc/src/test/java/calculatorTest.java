
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.Assert;
import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;


//1

class calculatorTest {

	@Test
	void testAdd() {
		var calc = new calculator();
		assertEquals(15, calc.add(7,8));
		}

	@Test
	void testSubtract() {
		var calc = new calculator();
		assertEquals(8, calc.subtract(15,7));
	}

	@Test
	void testMultiply() {
		var calc = new calculator();
		assertEquals(15, calc.multiply(3,5));
	}
	
	//@Test
	//void OpenBrowser() {
	//	WebDriver driver;
	//	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	//	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("headless");
	//	driver = new ChromeDriver(options);
	//	driver.get("https://www.usf.edu/");
	//	System.out.println(driver.getTitle());
	//	assertTrue("Page title is not correct",driver.getTitle().equals("Welcome to the University of South Florida | Tampa, St. Petersburg, Sarasota-Manatee,\r\n"
	//			+ "      FL"));
		
	//}
	
}