package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private static WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        MainPage.webDriver = webDriver;
    }

    @FindBy(xpath = "//div[@class=\"auth-bar__item auth-bar__item--text\"]")
    private static WebElement loginButton;

    @FindBy(xpath = "//input[@class=\"fast-search__input\"]")
    private static WebElement searchBar;

    @FindBy(xpath = "//iframe[@class=\"modal-iframe\"]")
    private static WebElement iFrameForSwitch;

    @FindBy(xpath = "//html//a[text() = \"Мобильные телефоны\"]")
    private static WebElement target;

    public static void loginButtonClick() {
        loginButton.click();
    }

    public static void searchBarClick() {
        searchBar.click();
    }

    public static void inputSearchBar(String request) {
        searchBar.sendKeys(request);
        searchBar.sendKeys(Keys.ENTER);
    }

    public static void targetClick() {
        target.click();
    }

    public static void switchFrame() {
        webDriver.switchTo().frame(iFrameForSwitch);
    }


}
