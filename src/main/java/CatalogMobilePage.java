import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogMobilePage {
    public WebDriver webDriver;

    public CatalogMobilePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//div[@class=\"schema-order\"]")
    private WebElement schemaButton;

    @FindBy(xpath = "//span[text()=\"Дорогие\"]")
    private WebElement sortButton;

    @FindBy(xpath = "(//div[@class=\"schema-product__group\"]//span[@data-bind=\"html: product.extended_name || product.full_name\"])[1]")
    public WebElement firstPhone;

    @FindBy(xpath = "(//div[@class=\"schema-product__group\"]//span[@data-bind=\"html: product.extended_name || product.full_name\"])[2]")
    public WebElement secondPhone;

    @FindBy(xpath = "(//div[@class=\"schema-product__group\"]//span[@data-bind=\"html: product.extended_name || product.full_name\"])[3]")
    public WebElement thirdPhone;

    public void schemaButtonClick() {
        schemaButton.click();
    }

    public void sortButtonClick() {
        sortButton.click();
    }

}
