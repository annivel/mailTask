package pagesMail;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import referencies.Links;

import java.util.concurrent.TimeUnit;

public class DriverPage {

    protected static WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(Links.get_URL);
    }

    public DriverPage() {
        PageFactory.initElements(driver, this);
    }
}
