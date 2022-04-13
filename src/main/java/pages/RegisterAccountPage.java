package pages;

import org.openqa.selenium.By;

public class RegisterAccountPage extends BasePage {
    private final By validFirstNameField = By.id("input-firstname");
    private final By validLastNameField = By.id("input-lastname");
    private final By validEmailField = By.id("input-email");
    private final By validPhoneNumberField = By.id("input-telephone");
    private final By validPasswordField = By.id("input-password");
    private final By validConfirmPasswordField = By.id("input-confirm");
    private final By clickPrivacyPolicy = By.xpath("//input[@name='agree']");
    private final By continueButton = By.xpath("//input[@value='Continue']");
    private final By messageAfterClick = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");


    public RegisterAccountPage enterFirstName(String firstName) {

        find(validFirstNameField).sendKeys(firstName);
        return this;

    }

    public RegisterAccountPage enterLastName(String lastName) {

        find(validLastNameField).sendKeys(lastName);
        return this;
    }

    public RegisterAccountPage enterEmail(String email) {

        find(validEmailField).sendKeys(email);
        return this;
    }

    public RegisterAccountPage enterPhoneNumber(String phoneNumber) {

        find(validPhoneNumberField).sendKeys(phoneNumber);
        return this;
    }

    public RegisterAccountPage enterPassword(String newPassword) {

        find(validPasswordField).sendKeys(newPassword);
        return this;
    }

    public RegisterAccountPage enterConfirmPassword(String confirmPassword) {
        find(validConfirmPasswordField).sendKeys(confirmPassword);
        return this;
    }

    public RegisterAccountPage clickPrivacyPolicy() {
        find(clickPrivacyPolicy).click();
        return this;
    }

    public String getErrorMessage() {
        return find(messageAfterClick).getText();
    }

    public PersonalAccountPage clickContinueButton() {
        find(continueButton).click();
        return new PersonalAccountPage();
    }

    public RegisterAccountPage clickButtonForCheckInvalidMessage() {
        find(continueButton).click();
        return this;
    }


}
