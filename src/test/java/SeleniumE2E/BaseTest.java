package SeleniumE2E;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    protected WebDriver driver;

   // @Parameters(value = {"Browser"})
    @BeforeMethod
    public void setUp() {
        //if (browser.equalsIgnoreCase("chrome")) {
            //WebDriverManager.chromedriver().setup();
            //driver = new ChromeDriver();
         /*else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }*/
             WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://ecommerce-playground.lambdatest.io/");
        }

        @AfterMethod
        public void tearDown () {
        driver.quit();
        }
    }

