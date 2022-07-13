
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//2

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
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\trist\\OneDrive\\Desktop\\DEVOPS Proj SU22\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1280,720");
		driver = new ChromeDriver(options);
		//driver.manage().window().setSize(new Dimension(1920, 1080));
		//driver = new ChromeDriver();
		driver.get("https://www.usf.edu/");
		//String originalWindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		assertTrue(driver.getTitle().equals("Welcome to the University of South Florida | Tampa, St. Petersburg, Sarasota-Manatee, FL"));
			System.out.println("flag 1");
		//Actions action = new Actions(driver);
		WebElement d=driver.findElement(By.xpath("/html/body/header/div[3]/div/nav/ul/li[1]/div[1]/a"));  
		System.out.println(d);
		String t = d.getText();
		System.out.println(t);
		d.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			System.out.println("flag 2");
		WebElement x = driver.findElement(By.xpath("/html/body/header/div[3]/div/nav/ul/li[1]/div[2]/div/div[3]/ul/li[4]/a"));
		x.click();
	    	System.out.println("flag 3");
	    String title = driver.getTitle();
	      System.out.println("Page title after link click : " + title);
	      driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    WebElement y = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/a[2]"));
	    y.click();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    	System.out.println("flag 4");
	    //Loop through until we find a new window handle
	  //  for (String windowHandle : driver.getWindowHandles()) {
	 //       if(!originalWindow.contentEquals(windowHandle)) {
	 //           driver.switchTo().window(windowHandle);
	 //           break;
	 //       }
	 //   }
	    title = driver.getTitle();
	    System.out.println("Page title after link click : " + title);
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);  
	    WebElement z = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/p[5]/a"));
	    z.click();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    System.out.println("flag 5");
	    title = driver.getTitle();
	    System.out.println("Page title after link click : " + title);
	    driver.close();
	    driver.quit();
		
	}
	
}