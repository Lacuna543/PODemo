import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class HomePage {


    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ResultPage search(String text) {
        driver.findElement(By.name("q")).sendKeys(text);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        return new ResultPage(driver);
    }
}
