package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class WishListPage extends BasePage {
    private final By productContainer = By.xpath("//tbody/tr");

    public List<WebElement> getAllProductInWishList() {
        return findAll(productContainer);
    }
}

