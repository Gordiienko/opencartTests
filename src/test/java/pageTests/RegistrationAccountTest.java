package pageTests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.MainPage;

import static utils.TestDataFaker.*;

public class RegistrationAccountTest extends BaseTest {

    @Test(priority = 2)
    public void userDateInputTest() {
        String exceptedMessageRegister = "Your Account Has Been Created!";
        MainPage mainPage = new MainPage();
        String actualRegisterMessage = mainPage.registrationSteps()
                .enterFirstName(getFirstName())
                .enterLastName(getLastName())
                .enterEmail(getEmail())
                .enterPhoneNumber(getPhoneNumber())
                .enterPassword("password")
                .enterConfirmPassword("password")
                .clickPrivacyPolicy()
                .clickContinueButton()
                .getSuccessMessage();
        Assertions.assertThat(actualRegisterMessage)
                .as("message after registration should beat: Your Account Has Been Created!")
                .isEqualTo(exceptedMessageRegister);
    }
    @Test(priority = 1)
    public void checkMessageUnderFirstNameField() {
        String exceptedMessageUnderFirstNameField = "First Name must be between 1 and 32 characters!";
        MainPage mainPage = new MainPage();
        String actualMessage = mainPage.registrationSteps()
                .enterLastName(getLastName())
                .enterEmail(getEmail())
                .enterPhoneNumber(getPhoneNumber())
                .enterPassword("password")
                .enterConfirmPassword("password")
                .clickPrivacyPolicy()
                .clickButtonForCheckInvalidMessage()
                .getErrorMessage();
        Assertions.assertThat(actualMessage)
                .as("FirstName field is empty:First Name must be between 1 and 32 characters! ")
                .isEqualTo(exceptedMessageUnderFirstNameField);


    }
}
