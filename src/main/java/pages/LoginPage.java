package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private final By email = By.id("input-email");
    private final By password = By.id("input-password");
    private final By loginButton = By.xpath("//input[@type='submit']");
    private final By myAccountTitle = By.xpath("//div[@id='content']/h2[contains(text(),'My Account')]");

    public LoginPage enterEmail(){
        getDriver().findElement(email).sendKeys("gordiienko_ievgenii@hotmail.com");
        return this;
    }
    public LoginPage enterPassword(){
        getDriver().findElement(password).sendKeys("07ujin15gopro");
        return this;
    }
    public LoginPage clickOnLoginButton(){
        getDriver().findElement(loginButton).click();
        return this;
    }
    public String titleOfMyAccount(){
       return getDriver().findElement(myAccountTitle).getText();
    }
}
