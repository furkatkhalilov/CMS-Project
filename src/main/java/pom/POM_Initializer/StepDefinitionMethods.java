package pom.POM_Initializer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StepDefinitionMethods extends CommonMethods {

    public void clickOn(String elementName){
        waitScrollClickFunction(pomPage.getWebElement(elementName));
    }

    public void sendKeys(String elementName, String text) {
        waitClearSendKeysFunction(pomPage.getWebElement(elementName), text);
    }

    public String getElementText(String elementName) {
        return pomPage.getWebElement(elementName).getText();
    }

    public void selectRandomFromDropDown(String elementName) {
        selectRandomDropDown(pomPage.getWebElement(elementName));
    }

    //This function is currently related to My Addresses page
    public void clickBtnUnderAddressBlock(String parentElement, String childElement) {

//        WebElement element = driver.findElement(By.xpath("//h3[text()='New Address']//ancestor::ul//a[@title='Update']"));

        WebElement element = driver.findElement(By.xpath("//h3[text()='" + parentElement +
                "']//ancestor::ul//a[@title='" + childElement + "']"));

        waitScrollClickFunction(element);
    }

    public List<WebElement> getListOfWebelement(String elementName){
        return pomPage.getListOfWebelement(elementName);
    }




}
