package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogMobilePage {

    public CatalogMobilePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//div[@class=\"schema-order\"]")
    private static WebElement schemaButton;

    @FindBy(xpath = "//span[text()=\"Дорогие\"]")
    private static WebElement sortButton;

    @FindBy(xpath = "(//div[@class=\"schema-product__group\"]//span[@data-bind=\"html: product.extended_name || product.full_name\"])[1]")
    public static WebElement firstPhone;

    @FindBy(xpath = "(//div[@class=\"schema-product__group\"]//span[@data-bind=\"html: product.extended_name || product.full_name\"])[2]")
    public static WebElement secondPhone;

    @FindBy(xpath = "(//div[@class=\"schema-product__group\"]//span[@data-bind=\"html: product.extended_name || product.full_name\"])[3]")
    public static WebElement thirdPhone;

    public static void schemaButtonClick() {
        schemaButton.click();
    }

    public static void sortButtonClick() {
        sortButton.click();
    }

}
