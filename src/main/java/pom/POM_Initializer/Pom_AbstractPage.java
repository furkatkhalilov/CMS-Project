package pom.POM_Initializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverSingleton;

import java.util.HashMap;
import java.util.List;

// creating abstract POM class in order to be able to reuse in Steps definitions and to switch between
// pages.
public abstract class Pom_AbstractPage {
    protected WebDriver driver = DriverSingleton.getWebDriver();


    //This class provides access to the functions and actions below which are called from the step definitions.
    //The webelements are taken from the child classes.
    public abstract void initMap();

    public abstract List<WebElement> getListOfWebelement(String elementName);

    public abstract WebElement getWebElement(String elementName);
}
