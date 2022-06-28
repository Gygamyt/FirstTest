import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//input[@placeholder=\"Ник или e-mail\"]") //email field
    private WebElement emailElement;

    @FindBy(xpath = "//input[@placeholder=\"Пароль\"]") //password field
    private WebElement passwordElement;

    @FindBy(xpath = "(//button[@type=\"submit\"])[2]")
    private WebElement loginButton;

    public void inputEmail(String email) {
        emailElement.click();
        emailElement.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordElement.click();
        passwordElement.sendKeys(password);
    }

    public void loginButtonClick() {
        loginButton.click();
    }

}
