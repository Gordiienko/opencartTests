package pageTests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.MainPage;

public class LoginAccountTest extends BaseTest{
    @Test
    public void checkAccountTitle(){
        String exceptedMyAccountBy = "My Account";
        MainPage mainPage = new MainPage();
        String actualResulOfMyAccount = mainPage.clickMyAccountIcon()
                .clickLoginButton()
                .enterEmail()
                .enterPassword()
                .clickOnLoginButton()
                .titleOfMyAccount();
        Assertions.assertThat(actualResulOfMyAccount)
                .as("My Account title is not appears on the left menu")
                .isEqualTo(exceptedMyAccountBy);
    }
}
