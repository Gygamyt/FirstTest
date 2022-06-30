import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {

    @BeforeClass
    public static void start() {
        Setuper.setup();
    }

    @AfterClass
    public static void close() {
        Setuper.close();
    }

    @Test
    public static void testLogin() {
        MainPage.loginButtonClick();
        LoginPage.inputEmail(ConfPropertiesReader.getProperty("login"));
        LoginPage.inputPassword(ConfPropertiesReader.getProperty("password"));
        LoginPage.loginButtonClick();
        //не смог пока что придумать нормальный ассерт под это дело, т.к. выскакивает капча и надо как то подло это сделать))0)
    }
}
