package base;

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;

	import utils.Log;

	public class BaseTest {
		private static WebDriver driver;
		
		@BeforeSuite
		public void setUp() {
			Log.info("Opening the browser.");
			setDriver(new ChromeDriver());
			
			 getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		     getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		        
			getDriver().manage().window().maximize();
			getDriver().get("https://parabank.parasoft.com/parabank/register.htm");
		}
		
		@AfterSuite
		public void tearDown() {
			if(getDriver() != null) {
				getDriver().quit();
				Log.info("Browser Closed :)");
			}
		}

		public static WebDriver getDriver() {
			return driver;
		}

		public static void setDriver(WebDriver driver) {
			BaseTest.driver = driver;
		}

	}


