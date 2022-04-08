package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    private static WebDriver driver;

    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }
    public static  WebDriver getDriver(){
        return driver;
    }
   /* protected WebElement find(By locator){
        return getDriver().findElement(locator);
    }
    protected  WebElement waitUntilVisible(By locator, int seconds){
        return  new WebDriverWait(getDriver(),seconds)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
*/

}
