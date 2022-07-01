import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class AbstractTest {
    @BeforeClass
    public static void start() {
        Setuper.setup();
    }

    @AfterClass
    public static void close() {
        Setuper.close();
    }
}