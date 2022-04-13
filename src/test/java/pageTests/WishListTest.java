package pageTests;


import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.WishListPage;

public class WishListTest extends BaseTest {
    @Test
    public void checkExistItemsInWishList() {
        WishListPage wishListPage = new WishListPage();
        MainPage mainPage = new MainPage();
        mainPage.loginSteps()
                .hoverMouseOverComponentsButton()
                .clickMonitorsSubMenuButton()
                .clickAppleMonitorWishListButton()
                .clickSamsungMonitorWishListButton()
                .clickWishListButton();
        Assertions.assertThat(wishListPage.getAllProductInWishList().size())
                .as("Must be 2 Products in the Wish List").isEqualTo(2);

    }
}

