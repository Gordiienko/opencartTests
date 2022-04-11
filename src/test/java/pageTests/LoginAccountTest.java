package pageTests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ProductsPage;

public class LoginAccountTest extends BaseTest {
    @Test
    public void checkAccountTitle() {
        String exceptedMyAccountBy = "My Account";
        MainPage mainPage = new MainPage();
        ProductsPage productsPage = new ProductsPage();
        mainPage.clickMyAccountIcon()
                .clickLoginButton()
                .enterEmail("gordiienko_ievgenii@hotmail.com")
                .enterPassword("07ujin15gopro")
                .clickOnLoginButton();
        String actualMessage =productsPage.checkMessage();
                Assertions.assertThat(actualMessage)
                .as("My Account title is not appears on the left menu")
                .isEqualTo(exceptedMyAccountBy);
    }
}
