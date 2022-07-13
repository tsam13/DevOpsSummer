
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
	
	@Test
	void OpenBrowser() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		driver.get("https://www.usf.edu/");
		//String url = "https://www.usf.edu/";
		System.out.println(driver.getTitle());
		//assertTrue(driver.getTitle().equals("Welcome to the University of South Florida | Tampa, St. Petersburg, Sarasota-Manatee, FL"));
		System.out.println("flag 1");
		Actions action = new Actions(driver);
		WebElement d=driver.findElement(By.xpath("//img[@alt='New Era. Preeminent Research University.']"));  
		System.out.println(d);
		d.click();
		  //action.moveToElement(d).moveToElement(driver.findElement(By.xpath("//a[@href='/work-at-usf/']"))).click().build().perform();
		  //action.moveToElement(button).moveToElement(webdriver.findElement(By.linkText("Registry Settings")).click().build().perform();
		// WebElement x = driver.findElement(By.xpath("//a[@href='/work-at-usf/']"));
		//  x.click();
		//WebElement items = driver.findElement(By.tagName("li"));
		//  System.out.println(items);
		System.out.println("flag 2");
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/work-at-usf/']")));
		WebElement p=driver.findElement(By.xpath("//a[@href='/work-at-usf/']"));
	      p.click();
	    System.out.println("flag 3");
	    String title = driver.getTitle();
	      System.out.println("Page title after link click : " + title);
	      driver.close();
		
	}
	
}