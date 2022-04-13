package pages;

import org.openqa.selenium.By;

public class MonitorsPage extends BasePage {
    private final By appleMonitorWishListButton = By.xpath(
            "//img[contains(@title,'Apple Cinema 30')]/../../..//button[@data-original-title='Add to Wish List']");
    private final By samsungMonitorWishListButton = By.xpath(
            "//img[@title='Samsung SyncMaster 941BW']/../../..//button[@data-original-title='Add to Wish List']");
    private final By wishListButton = By.xpath("//a[text()='wish list']");

    public MonitorsPage clickAppleMonitorWishListButton() {
        find(appleMonitorWishListButton).click();
        return this;
    }

    public MonitorsPage clickSamsungMonitorWishListButton() {
        find(samsungMonitorWishListButton).click();
        return this;
    }

    public WishListPage clickWishListButton() {
        waitUntilVisible(wishListButton, 2).click();
        return new WishListPage();

    }
}
