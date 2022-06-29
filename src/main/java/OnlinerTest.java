import org.testng.annotations.Test;

public class OnlinerTest {

    public static String request = "Мобильные телефоны";

    @Test
    public static void loginTest() {
        LoginTest.setup();
        LoginTest.testLogin();
        LoginTest.close();
    }

    @Test
    public static void searchTest() {
        try {
            SearchTest.setup();
            SearchTest.testSearch();
        } finally {
            SearchTest.close();
        }
    }
}
