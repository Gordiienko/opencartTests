package pageTests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.IphonePage;
import pages.MainPage;

public class IphonePriseTest extends BaseTest {
    @Test
    public void checkPriseOfIphone() {
        String exceptedDollarPrise = "$123.20";
        String exceptedEuroPrise = "106.04€";
        String exceptedPoundSterlingPrise = "£92.93";
        MainPage mainPage = new MainPage();
        String expectedCurrency = "USD";
        mainPage.selectCurrency(expectedCurrency)
                .clickIphoneProductButton();
        IphonePage iphonePage = new IphonePage();
        String actualDollarPrise = iphonePage
                .checkDollarPrise();
        Assertions.assertThat(actualDollarPrise).as("Dollar prise of Iphone must be: $123.20")
                .isEqualTo(exceptedDollarPrise);
        String actualEuroPrise = iphonePage
                .clickCurrencyButton()
                .clickEuroButton()
                .checkEuroPrise();
        Assertions.assertThat(actualEuroPrise).as("Euro prise of Iphone must be: 123.20")
                .isEqualTo(exceptedEuroPrise);
        String actualPoundSterling = iphonePage
                .clickCurrencyButton()
                .clickPoundSterlingButton()
                .checkPoundSterlingPrise();
        Assertions.assertThat(actualPoundSterling).as("Pound Sterling prise of Iphone must be: 123.20")
                .isEqualTo(exceptedPoundSterlingPrise);
    }
}
