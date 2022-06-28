import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;

public class TestOnliner {
    public static MainPage mainPage;
    public static CatalogMobilePage catalogMobilePage;
    public static LoginPage loginPage;
    public static WebDriver driver;

    public static String login = "testaccichserezhi@gmail.com";
    public static String password = "hdoey28nf98234";
    public static String request = "Мобильные телефоны";

    public static ArrayList<String> checkList = new ArrayList<>() {{
        add("Смартфон Samsung Galaxy M30s 4GB/64GB (черный)");
        add("Смартфон Apple iPhone 13 Pro Max 1TB (альпийский зеленый)");
        add("Смартфон Apple iPhone 12 Pro Max 512GB (золотой)");
    }};
    public static ArrayList<String> resultList = new ArrayList<>();

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfPropertiesReader.getProperty("chromeDriver"));
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        catalogMobilePage = new CatalogMobilePage(driver);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfPropertiesReader.getProperty("basePage"));
    }

    @Test
    public static void testLogin() {
        setup();
        mainPage.loginButtonClick();
        loginPage.inputEmail(login);
        loginPage.inputPassword(password);
        loginPage.loginButtonClick();
        //не смог пока что придумать нормальный ассерт под это дело, т.к. выскакивает капча и надо как то подло это сделать))0)
        driver.close();
    }

    @Test
    public static void testSearch() throws InterruptedException {
        setup();
        mainPage.searchBarClick();
        mainPage.inputSearchBar(request);
        mainPage.switchFrame();
        mainPage.targetClick();

        catalogMobilePage.schemaButtonClick();
        catalogMobilePage.sortButtonClick();
        Thread.sleep(1000);
        resultList.add(catalogMobilePage.firstPhone.getText());
        resultList.add(catalogMobilePage.secondPhone.getText());
        resultList.add(catalogMobilePage.thirdPhone.getText());
        Assert.assertEquals(resultList, checkList);
        driver.close();
    }
}
