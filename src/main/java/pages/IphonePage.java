package pages;

import org.openqa.selenium.By;

public class IphonePage extends BasePage{
    private final By poundSterlingPrise = By.xpath("//h2[text()='£92.93']");
    private final By euroPrise = By.xpath("//h2[text()='106.04€']");
    private final By dollarPrise = By.xpath("//h2[text()='$123.20']");
    private final By euroButton = By.xpath("//li//button[contains(text(),'Euro')]");
    private final By poundSterlingButton = By.xpath("//li//button[contains(text(),'Pound Sterling')]");
    private final By currencyButton = By.xpath("//i[@class='fa fa-caret-down']");

    public String checkDollarPrise(){
        return find(dollarPrise).getText();
    }
    public  IphonePage clickCurrencyButton(){
        find(currencyButton).click();
        return this;
    }
    public IphonePage clickEuroButton(){
        find(euroButton).click();
        return this;
    }
    public String checkEuroPrise(){
        return find(euroPrise).getText();
    }
    public IphonePage clickPoundSterlingButton(){
        find(poundSterlingButton).click();
        return this;
    }
    public String checkPoundSterlingPrise(){
        return find(poundSterlingPrise).getText();
    }
}
