import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class AbstractTest {
    @BeforeClass
    private static void start() {
        Setuper.setup();
    }

    @AfterClass
    private static void close() {
        Setuper.close();
    }
}