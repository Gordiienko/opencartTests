package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private final By email = By.id("input-email");
    private final By password = By.id("input-password");
    private final By loginButton = By.xpath("//input[@type='submit']");


    public LoginPage enterEmail(String newEmail) {
        find(email).sendKeys(newEmail);
        return this;
    }

    public LoginPage enterPassword(String newPassword) {
        find(password).sendKeys(newPassword);
        return this;

    }

    public LoginPage clickOnLoginButton() {
        find(loginButton).click();
        return this;
    }

}
