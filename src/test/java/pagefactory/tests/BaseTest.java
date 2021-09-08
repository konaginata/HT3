package pagefactory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagefactory.pages.AppleAirPodsPage;
import pagefactory.pages.HomePage;
import pagefactory.pages.LogitechKeyboardsPage;
import pagefactory.pages.SearchResultPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public LogitechKeyboardsPage getLogitechKeyboardsPage() {
        return new LogitechKeyboardsPage(getDriver());
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(getDriver());
    }

    public AppleAirPodsPage getAppleAirPodsPage() {
        return new AppleAirPodsPage(getDriver());
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
