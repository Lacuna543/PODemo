import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class GoogleTestPage {
    ChromeDriver driver;
    @Before
    public void setUp(){
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //delay before connecting
        driver.get("http://google.com");
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void testSearch() {
        HomePage home = new HomePage(driver);
        ResultPage result = home.search("automated testing info");
        assertTrue(result.getFirstLink().contains("automated"));
    }
}
