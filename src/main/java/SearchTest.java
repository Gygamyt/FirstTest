import Pages.CatalogMobilePage;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SearchTest extends AbstractTest {

    static String request = "Мобильные телефоны";

    static ArrayList<String> checkList = new ArrayList<>() {{
        add("Смартфон Samsung Galaxy M30s 4GB/64GB (черный)");
        add("Смартфон Apple iPhone 13 Pro Max 1TB (альпийский зеленый)");
        add("Смартфон Apple iPhone 12 Pro Max 512GB (золотой)");
    }};

    static ArrayList<String> resultList = new ArrayList<>();

    @Test
    private static void testSearch() throws InterruptedException {
        MainPage.searchBarClick();
        MainPage.inputSearchBar(request);
        MainPage.switchFrame();
        MainPage.targetClick();
        CatalogMobilePage.schemaButtonClick();
        CatalogMobilePage.sortButtonClick();
        Thread.sleep(1000);
        resultList.add(CatalogMobilePage.firstPhone.getText());
        resultList.add(CatalogMobilePage.secondPhone.getText());
        resultList.add(CatalogMobilePage.thirdPhone.getText());
        Assert.assertEquals(resultList, checkList);
    }
}
