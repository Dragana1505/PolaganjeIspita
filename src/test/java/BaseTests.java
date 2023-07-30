import Common.Navigator;
import Page.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class Tests {
    private WebDriver driver;
    protected HomePage homePage;
    protected Navigator navigator;
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        this.homePageInit();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void homePageInit() {

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        homePage = new HomePage(driver);
        navigator = new Navigator(driver);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
}
