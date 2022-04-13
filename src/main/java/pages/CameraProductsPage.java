package pages;

import blocks.ProductBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.String.format;

public class CameraProductsPage extends BasePage {
    private final By product = By.cssSelector(".product-thumb");

    public List<WebElement> getAllProduct() {
        return findAll(product);
    }

    public ProductBlock findProduct(String productName) {
        return new ProductBlock(find(By.xpath(format("//img[@alt='%s']/../../..", productName))));
    }
}
