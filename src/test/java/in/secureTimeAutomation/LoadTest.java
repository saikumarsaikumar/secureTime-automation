package in.secureTimeAutomation;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LoadTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String driverPath = System.getProperty("user.dir") + "/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    @Test
    public void testPageLoad() throws InterruptedException {
        driver.get("https://example.com");
        // Wait for 10 minutes (600,000 milliseconds)
        Thread.sleep(600_00);

        System.out.println("Page title is: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
