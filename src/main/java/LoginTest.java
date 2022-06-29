import Pages.LoginPage;
import Pages.MainPage;

public class LoginTest extends AbstractTest {

    public static void testLogin() {
        MainPage.loginButtonClick();
        LoginPage.inputEmail(ConfPropertiesReader.getProperty("login"));
        LoginPage.inputPassword(ConfPropertiesReader.getProperty("password"));
        LoginPage.loginButtonClick();
        //не смог пока что придумать нормальный ассерт под это дело, т.к. выскакивает капча и надо как то подло это сделать))0)
    }
}
