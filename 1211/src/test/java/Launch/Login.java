package Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {
	

	  WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        // Set the path to the GeckoDriver executable
	        System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");

	    //    System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

	        // Initialize the FirefoxDriver
	     //  driver = new FirefoxDriver();
	         driver = new ChromeDriver();
	         
	       // System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
	   //     FirefoxBinary firefoxBinary = new FirefoxBinary();
	     //   firefoxBinary.addCommandLineOptions("--headless");
	    }

	    @Test
	    public void openBrowser() {
	        // Navigate to a website
	        driver.get("https://webapps.tekstac.com/SeleniumApp2/Library/LibraryCard.html");
	        
	      
	        // Perform some actions or assertions if needed
	        // For example, you can check the title of the page
	       String pageTitle = driver.getTitle();
	        System.out.println("Page Title: " + pageTitle);
	    }
	    
	    


	    @AfterClass
	    public void tearDown() {
	    	System.out.println("Page Title: browser should remain open " );
	    }
	}
