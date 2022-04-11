package pageTests;


import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ProductsPage;
import pages.WishListPage;

public class WishListTest extends BaseTest {
    @Test
    public void checkExistItemsInWishList() {
        String expectedSamsungMonitor = "Samsung SyncMaster 941BW";
        String expectedAppleMonitor = "Apple Cinema 30\"";
        MainPage mainPage = new MainPage();
        ProductsPage productsPage = new ProductsPage();
        mainPage.clickMyAccountIcon()
                .clickLoginButton()
                .enterEmail("gordiienko_ievgenii@hotmail.com")
                .enterPassword("07ujin15gopro")
                .clickOnLoginButton();
        productsPage
                .hoverMouseOverComponentsButton()
                .clickMonitorsSubMenuButton()
                .clickAppleMonitorWishListButton()
                .clickSamsungMonitorWishListButton()
                .clickWishListButton();
        WishListPage wishListPage = new WishListPage();
        String actualAppleMonitor = wishListPage.getTextAppleMonitorInWishList();
        String actualSamsungMonitor = wishListPage.getTextSamsungMonitorInWishList();
        Assertions.assertThat(actualSamsungMonitor).as("in wish list must be: Samsung SyncMaster 941BW")
                .isEqualTo(expectedSamsungMonitor);
        Assertions.assertThat(actualAppleMonitor).as("in wish list must be: Apple Cinema 30\"")
                .isEqualTo(expectedAppleMonitor);

    }
}

