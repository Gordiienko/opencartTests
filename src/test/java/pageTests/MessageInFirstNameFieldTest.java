package pageTests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.MainPage;

import static utils.TestDataFaker.*;

public class MessageInFirstNameFieldTest extends BaseTest {
    @Test
    public void checkMessageFields() {
        String exceptedMessageRegister = "First Name must be between 1 and 32 characters!";
        MainPage mainPage = new MainPage();
        String actualMessage = mainPage.clickMyAccountIcon()
                .clickRegisterButton()
                .enterLastName(getLastName())
                .enterEmail(getEmail())
                .enterPhoneNumber(getPhoneNumber())
                .enterPassword("password")
                .enterConfirmPassword("password")
                .clickPrivacyPolicy()
                .clickContinueButton()
                .getErrorMessage();
        Assertions.assertThat(actualMessage)
                .as("FirstName field is empty:First Name must be between 1 and 32 characters! ")
                .isEqualTo(exceptedMessageRegister);


    }
}
