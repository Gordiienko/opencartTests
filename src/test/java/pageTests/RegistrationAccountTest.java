package pageTests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SuccessAccountPage;

import static utils.TestDataFaker.*;

public class RegistrationAccountTest extends BaseTest {
    @Test
    public void userDateInputTest() {
        String exceptedMessageRegister = "Your Account Has Been Created!";
        MainPage mainPage = new MainPage();
        SuccessAccountPage successAccountPage = new SuccessAccountPage();
        mainPage.clickMyAccountIcon()
                .clickRegisterButton()
                .enterFirstName(getFirstName())
                .enterLastName(getLastName())
                .enterEmail(getEmail())
                .enterPhoneNumber(getPhoneNumber())
                .enterPassword("password")
                .enterConfirmPassword("password")
                .clickPrivacyPolicy()
                .clickContinueButton();
        String actualRegisterMessage = successAccountPage.getSuccessMessage();
        Assertions.assertThat(actualRegisterMessage)
                .as("message after registration should beat: Your Account Has Been Created!")
                .isEqualTo(exceptedMessageRegister);
    }
}
