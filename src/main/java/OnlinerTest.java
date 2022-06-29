import org.testng.annotations.*;

public class OnlinerTest {

    public static String request = "Мобильные телефоны";

    @BeforeMethod
    public static void start() {
        Setuper.setup();
    }

    @AfterMethod
    public static void close() {
        Setuper.close();
    }

    @Test
    public static void loginTest() {
        LoginTest.testLogin();
    }

    @Test
    public static void searchTest() {
        SearchTest.testSearch();
    }
}