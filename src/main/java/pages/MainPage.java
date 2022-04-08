package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends BasePage {
    private final By accountIconButton = By.xpath("//a[@title='My Account']");
    private final By registerButton = By.xpath("//a[text()='Register']");
    private final By loginButton = By.xpath("//a[text()='Login']");

    public MainPage clickMyAccountIcon(){
       getDriver().findElement(accountIconButton).click();
return this;

    }
    public RegisterAccountPage clickRegisterButton(){
        getDriver().findElement(registerButton).click();
        return new RegisterAccountPage();
    }
    public  LoginPage clickLoginButton(){
        getDriver().findElement(loginButton).click();
        return new LoginPage();
    }

}
