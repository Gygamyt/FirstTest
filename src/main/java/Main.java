import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class Main {

    static String firstElementForCheck = "Смартфон Apple iPhone 13 Pro 1TB (небесно-голубой)";
    static String secondElementForCheck = "Смартфон Apple iPhone 13 Pro Max 1TB (альпийский зеленый)";
    static String thirdElementForCheck = "Смартфон Xiaomi Mi Note 10 Pro 8GB/256GB международная версия (зеленый)";
    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_102\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

        String login = "testaccichserezhi@gmail.com";
        String pass = "hdoey28nf98234";

        WebElement loginElement = driver.findElement(By.xpath("//div[@class=\"auth-bar__item auth-bar__item--text\"]"));
        loginElement.click();

        WebElement emailElement = driver.findElement(By.xpath("//input[@placeholder=\"Ник или e-mail\"]"));

        emailElement.sendKeys(login);

        WebElement passElement = driver.findElement(By.xpath("//input[@placeholder=\"Пароль\"]"));
        passElement.sendKeys(pass);
        Thread.sleep(1000);

        driver.get("https://www.onliner.by/");

        WebElement searchBar = driver.findElement(By.xpath("//input[@class=\"fast-search__input\"]"));
        searchBar.sendKeys("мобильные телефоны");
        Thread.sleep(1000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"modal-iframe\"]")));
        Thread.sleep(1000);
        WebElement target = driver.findElement(By.xpath("//html//a[text() = \"Мобильные телефоны\"]"));
        target.click();

        driver.switchTo().parentFrame();

        WebElement schemaButton = driver.findElement(By.xpath("//div[@class=\"schema-order\"]"));
        schemaButton.click();

        WebElement sortButton = driver.findElement(By.xpath("//span[text()=\"Дорогие\"]"));

        if (sortButton.isEnabled()) {
            sortButton.click();
        }

        Thread.sleep(3000);

        WebElement firstCheck = driver.findElement(By.xpath("(//div[@class=\"schema-product__group\"]//span[@data-bind=\"html: product.extended_name || product.full_name\"])[1]"));
        String firstElement = firstCheck.getText();
        Thread.sleep(1000);
        WebElement secondCheck = driver.findElement(By.xpath("(//div[@class=\"schema-product__group\"]//span[@data-bind=\"html: product.extended_name || product.full_name\"])[2]"));
        String secondElement = secondCheck.getText();
        Thread.sleep(1000);
        WebElement thirdCheck = driver.findElement(By.xpath("(//div[@class=\"schema-product__group\"]//span[@data-bind=\"html: product.extended_name || product.full_name\"])[3]"));
        String thirdElement = thirdCheck.getText();
        Thread.sleep(1000);
        System.out.println(firstElement.equals(firstElementForCheck) && secondElement.equals(secondElementForCheck) && thirdElement.equals(thirdElementForCheck));
        
    }
}
