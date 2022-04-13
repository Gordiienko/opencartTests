package pages;

import org.openqa.selenium.By;

public class PersonalAccountPage extends BasePage {
    private final By confirmMassage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    private final By myAccountTextTitle = By.xpath("//div[@id='content']/h2[contains(text(),'My Account')]");
    private final By componentsButton = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Components')]");
    private final By monitorsSubMenuButton = By.xpath("//a[contains(text(),'Monitors')]");

    public PersonalAccountPage hoverMouseOverComponentsButton() {
        hoverMouseOverElementWithLocator(componentsButton);
        return this;
    }

    public MonitorsPage clickMonitorsSubMenuButton() {
        find(monitorsSubMenuButton).click();
        return new MonitorsPage();
    }
    public String getTitleText() {
        return find(myAccountTextTitle).getText();
    }

    public String getSuccessMessage() {
        return find(confirmMassage).getText();

    }
}
