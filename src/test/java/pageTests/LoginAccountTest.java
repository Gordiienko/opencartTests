package pageTests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.MainPage;

public class LoginAccountTest extends BaseTest {
    @Test
    public void checkAccountTitle() {
        String exceptedTitleText = "My Account";
        MainPage mainPage = new MainPage();
        String actualTitleText = mainPage
                .loginSteps()
                .getTitleText();

        Assertions.assertThat(actualTitleText)
                .as("My Account title is not appears on the left menu")
                .isEqualTo(exceptedTitleText);
    }
}
