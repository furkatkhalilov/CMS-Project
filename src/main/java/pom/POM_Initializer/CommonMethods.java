package pom.POM_Initializer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverSingleton;

import java.util.Random;

public class CommonMethods {
    WebDriver driver = DriverSingleton.getWebDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    protected Pom_AbstractPage pomPage = PomPageFactory.getPomPage();


    ////////////////////////////////////////////////////
    // Local Reusable Methods
    ///////////////////////////////////////////////////

    protected void scrollIntoElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    protected void waitScrollClickFunction(WebElement elementName){
        wait.until(ExpectedConditions.elementToBeClickable(elementName));
        scrollIntoElement(elementName);
        elementName.click();
    }

    protected void waitClearSendKeysFunction(WebElement elementName, String text){
        wait.until(ExpectedConditions.visibilityOf(elementName));
        scrollIntoElement(elementName);
        elementName.clear();
        elementName.sendKeys(text);
    }

    protected void selectRandomDropDown(WebElement elementName){
        Select dropDown = new Select(elementName);
        Random random = new Random();
        dropDown.selectByIndex(random.nextInt(dropDown.getOptions().size()-1)+1);
    }
}
