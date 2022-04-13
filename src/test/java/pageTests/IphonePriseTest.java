package pageTests;


import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.IphoneProductPage;
import pages.MainPage;

public class IphonePriseTest extends BaseTest {
    @Test
    public void checkPriseOfIphone() {
        String exceptedDollarPrise = "$123.20";
        String exceptedEuroPrise = "106.04€";
        String exceptedPoundSterlingPrise = "£92.93";
        MainPage mainPage = new MainPage();
        String actualDollarPrise = mainPage
                .checkCurrencyIcon()
                .checkDollarPrise();
        Assertions.assertThat(actualDollarPrise).as("Prise in Dollar of Iphone must be: $123.20")
                .isEqualTo(exceptedDollarPrise);

        IphoneProductPage iphoneProductPage = new IphoneProductPage();
        String actualEuroPrise = iphoneProductPage
                .clickCurrencyButton()
                .clickEuroButton()
                .getEuroPrise();

        Assertions.assertThat(actualEuroPrise).as("Prise in Euro of Iphone must be: 106.04€")
                .isEqualTo(exceptedEuroPrise);

        String actualPoundSterling = iphoneProductPage
                .clickCurrencyButton()
                .clickPoundSterlingButton()
                .checkPoundSterlingPrise();

        Assertions.assertThat(actualPoundSterling).as("Pris in Pound Sterling must be: £92.93")
                .isEqualTo(exceptedPoundSterlingPrise);
    }
}
