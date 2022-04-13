package pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {
    private final By accountIconButton = By.xpath("//a[@title='My Account']");
    private final By registerButton = By.xpath("//a[text()='Register']");
    private final By loginButton = By.xpath("//a[text()='Login']");
    private final By iphoneProductButton = By.xpath("//div//img[@title='iPhone']");
    private final By cameraMenuButton = By.xpath("//a[text()='Cameras']");
    private final By expectedCurrency = By.xpath("//strong[text()='$']");
    private final By currencyDollarButton = By.xpath("//li//button[contains(text(),'Dollar')]");

    public IphoneProductPage checkCurrencyIcon() {
        if (find(expectedCurrency).getText().equals(find(expectedCurrency).getText())) {
            find(iphoneProductButton).click();
        } else {
            find(currencyDollarButton).click();
            find(iphoneProductButton).click();
        }
        return new IphoneProductPage();
    }

    public RegisterAccountPage registrationSteps() {
        MainPage mainPage = new MainPage();
        mainPage.clickMyAccountIcon()
                .clickRegisterButton();
        return new RegisterAccountPage();
    }

    public PersonalAccountPage loginSteps() {
        MainPage mainPage = new MainPage();
        mainPage.clickMyAccountIcon()
                .clickLoginButton()
                .enterEmail("gordiienko_ievgenii@hotmail.com")
                .enterPassword("07ujin15gopro")
                .clickOnLoginButton();
        return new PersonalAccountPage();
    }

    public CameraProductsPage clickCameraMenuButton() {
        find(cameraMenuButton).click();
        return new CameraProductsPage();
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

}
