package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@placeholder=\"Ник или e-mail\"]") //email field
    private static WebElement emailElement;

    @FindBy(xpath = "//input[@placeholder=\"Пароль\"]") //password field
    private static WebElement passwordElement;

    @FindBy(xpath = "(//button[@type=\"submit\"])[2]")
    private static WebElement loginButton;

    public static void inputEmail(String email) {
        emailElement.click();
        emailElement.sendKeys(email);
    }

    public static void inputPassword(String password) {
        passwordElement.click();
        passwordElement.sendKeys(password);
    }

    public static void loginButtonClick() {
        loginButton.click();
    }

}
