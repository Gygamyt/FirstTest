import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//div[@class=\"auth-bar__item auth-bar__item--text\"]")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@class=\"fast-search__input\"]")
    private WebElement searchBar;

    @FindBy(xpath = "//iframe[@class=\"modal-iframe\"]")
    private WebElement iFrameForSwitch;

    @FindBy(xpath = "//html//a[text() = \"Мобильные телефоны\"]")
    private WebElement target;

    public void loginButtonClick() {
        loginButton.click();
    }

    public void searchBarClick() {
        searchBar.click();
    }

    public void inputSearchBar(String request) {
        searchBar.sendKeys(request);
        searchBar.sendKeys(Keys.ENTER);
    }

    public void targetClick() {
        target.click();
    }

    public void switchFrame() {
        webDriver.switchTo().frame(iFrameForSwitch);
    }


}
