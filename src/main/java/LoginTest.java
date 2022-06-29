import Pages.LoginPage;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


@Test
public class LoginTest extends AbstractTest {
    private static MainPage mainPage;
    private static LoginPage loginPage;
    private static WebDriver driver;

    public static void setup() {
        Setuper.setup();
    }

    public static void testLogin() {
        MainPage.loginButtonClick();
        LoginPage.inputEmail(ConfPropertiesReader.getProperty("login"));
        LoginPage.inputPassword(ConfPropertiesReader.getProperty("password"));
        LoginPage.loginButtonClick();
        //не смог пока что придумать нормальный ассерт под это дело, т.к. выскакивает капча и надо как то подло это сделать))0)
    }

    public static void close() {
        Setuper.close();
    }

}
