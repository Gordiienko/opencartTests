package pages;

import org.openqa.selenium.By;

public class WishListPage extends BasePage{
    private final By samsungMonitorInWishList = By.xpath("//tr//a[text()='Samsung SyncMaster 941BW']");
    private final By appleMonitorInWishList = By.xpath("//tr//a[contains(text(),'Apple Cinema 30')]");

    public String getTextSamsungMonitorInWishList(){
        return find(samsungMonitorInWishList).getText();
    }
    public String getTextAppleMonitorInWishList(){
        return find(appleMonitorInWishList).getText();
    }
}
