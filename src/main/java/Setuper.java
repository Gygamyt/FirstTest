import Pages.CatalogMobilePage;
import Pages.LoginPage;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Setuper {

    private static WebDriver driver;

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfPropertiesReader.getProperty("chromeDriver"));
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        CatalogMobilePage catalogMobilePage = new CatalogMobilePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfPropertiesReader.getProperty("basePage"));

    }

    public static void close() {
        driver.close();
    }
}
