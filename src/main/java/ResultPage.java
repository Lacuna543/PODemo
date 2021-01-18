import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Collection;

public class ResultPage {
    private final WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstLink() {
        return driver.findElement(By.xpath("(//*[@id=\"rso\"]//a)[1]")).getText();
    }
}
