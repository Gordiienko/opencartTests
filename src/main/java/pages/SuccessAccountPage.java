package pages;

import org.openqa.selenium.By;

public class SuccessAccountPage extends BasePage {
    private final By confirmMassage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");

    public String getSuccessMessage() {
        return find(confirmMassage).getText();

    }

}
