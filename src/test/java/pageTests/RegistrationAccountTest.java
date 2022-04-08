package pageTests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegisterAccountPage;

import static utils.TestDataFaker.*;

public class RegistrationAccountTest extends BaseTest {
    @Test
    public void userDateInputTest(){
        String exceptedMessageRegister = "Your Account Has Been Created!";
        MainPage mainPage = new MainPage();
        String actualRegisterMessage = mainPage.clickMyAccountIcon()
                .clickRegisterButton()
                .enterFirstName(getFirstName())
                .enterLastName(getLastName())
                .enterEmail(getEmail())
                .enterPhoneNumber(getPhoneNumber())
                .enterPassword()
                .enterConfirmPassword()
                .clickPrivacyPolicy()
                .clickContinueButton()
                .messageAfterRegister();
        Assertions.assertThat(actualRegisterMessage)
                .as("message after registration should beat: Your Account Has Been Created!")
                .isEqualTo(exceptedMessageRegister);
    }
}
