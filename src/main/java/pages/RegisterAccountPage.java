package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterAccountPage extends BasePage {
    private final By validFirstNameField = By.id("input-firstname");
    private final By validLastNameField = By.id("input-lastname");
    private final By validEmailField = By.id("input-email");
    private final By validPhoneNumberField = By.id("input-telephone");
    private final By validPasswordField = By.id("input-password");
    private final By validConfirmPasswordField = By.id("input-confirm");
    private final By clickPrivacyPolicy = By.xpath("//input[@name='agree']");
    private final By continueButton = By.xpath("//input[@value='Continue']");
    private final By confirmMassage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    private final By messageAfterClick = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");

    public RegisterAccountPage enterFirstName(String firstName) {
        getDriver().findElement(validFirstNameField).click();
        getDriver().findElement(validFirstNameField).sendKeys(firstName);
        return this;

    }

    public RegisterAccountPage enterLastName(String lastName) {
        getDriver().findElement(validLastNameField).click();
        getDriver().findElement(validLastNameField).sendKeys(lastName);
        return this;
    }
    public RegisterAccountPage enterEmail(String email) {
        getDriver().findElement(validEmailField).click();
        getDriver().findElement(validEmailField).sendKeys(email);
        return this;
    }
    public RegisterAccountPage enterPhoneNumber(String phoneNumber) {
        getDriver().findElement(validPhoneNumberField).click();
        getDriver().findElement(validPhoneNumberField).sendKeys(phoneNumber);
        return this;
    }
    public RegisterAccountPage enterPassword() {
        getDriver().findElement(validPasswordField).click();
        getDriver().findElement(validPasswordField).sendKeys("password");
        return this;
    }
    public RegisterAccountPage enterConfirmPassword() {
        getDriver().findElement(validConfirmPasswordField).click();
        getDriver().findElement(validConfirmPasswordField).sendKeys("password");
        return this;
    }
    public RegisterAccountPage clickPrivacyPolicy() {
        getDriver().findElement(clickPrivacyPolicy).click();
        return this;
    }
    public RegisterAccountPage clickContinueButton() {
        getDriver().findElement(continueButton).click();
        return this;
    }
    public String messageAfterRegister(){
        return getDriver().findElement(confirmMassage).getText();

    }
    public String messageAfterClickConfirm(){
        return getDriver().findElement(messageAfterClick).getText();
    }
}
