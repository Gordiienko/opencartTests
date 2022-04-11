package pages;

import org.openqa.selenium.By;

import static java.lang.String.format;

public class MainPage extends BasePage {
    private final By accountIconButton = By.xpath("//a[@title='My Account']");
    private final By registerButton = By.xpath("//a[text()='Register']");
    private final By loginButton = By.xpath("//a[text()='Login']");
    private final By currencyButton = By.xpath("//i[@class='fa fa-caret-down']");

    private final By iphoneProductButton = By.xpath("//div//img[@title='iPhone']");
    private final By cameraMenuButton = By.xpath("//a[text()='Cameras']");

    public MainPage selectCurrency(String currency) {
        clickCurrencyButton();
        By by = By.xpath(format("//button[@name='%s']", currency));
        hoverMouseOverElementWithLocator(by);
        find(by).click();
        return this;
    }

    public CamerasPage clickCameraMenuButton() {
        find(cameraMenuButton).click();
        return new CamerasPage();
    }

    public MainPage clickMyAccountIcon() {
        find(accountIconButton).click();
        return this;

    }

    public RegisterAccountPage clickRegisterButton() {
        find(registerButton).click();
        return new RegisterAccountPage();
    }

    public LoginPage clickLoginButton() {
        find(loginButton).click();
        return new LoginPage();
    }

    private MainPage clickCurrencyButton() {
        find(currencyButton).click();
        return this;
    }

    public IphonePage clickIphoneProductButton() {
        find(iphoneProductButton).click();
        return new IphonePage();
    }


}
