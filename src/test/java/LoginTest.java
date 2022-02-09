import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginTest {
    private WebDriver driver;
    LoginPage page;

    @BeforeAll
    public void beforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                Utils.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        page = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Utils.BASE_URL);
    }

    @AfterAll
    public void afterClass() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    void logTest() throws Exception {
        page.login("Sebastian", "123");
    }
}
