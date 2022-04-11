package pages;

import org.openqa.selenium.By;


public class ProductsPage extends BasePage {
    private final By myAccountTextTitle = By.xpath("//div[@id='content']/h2[contains(text(),'My Account')]");
    private final By componentsButton = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Components')]");
    private final By monitorsSubMenuButton = By.xpath("//a[contains(text(),'Monitors')]");

    public String checkMessage() {
        return find(myAccountTextTitle).getText();
    }

    public ProductsPage hoverMouseOverComponentsButton() {
        hoverMouseOverElementWithLocator(componentsButton);
        return this;
    }

    public MonitorsPage clickMonitorsSubMenuButton() {
        find(monitorsSubMenuButton).click();
        return new MonitorsPage();
    }
}
