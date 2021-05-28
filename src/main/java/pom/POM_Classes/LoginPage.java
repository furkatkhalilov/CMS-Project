package pom.POM_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.POM_Initializer.Pom_AbstractPage;

import java.util.HashMap;
import java.util.List;

public class LoginPage extends Pom_AbstractPage {
    protected HashMap<String, List<WebElement>> mapOfListOfWebElements = new HashMap<>();
    protected HashMap<String, WebElement> mapOfWebElements = new HashMap<>();

    public LoginPage() {
        PageFactory.initElements(driver, this);
        initMap();
    }

    //=====================Login Page Elements==================//
    @FindBy(css = "input[value='I Agree']")       private WebElement iAgreeButton;
    @FindBy(id = "un")                            private WebElement userName;
    @FindBy(id = "pw")                            private WebElement password;
    @FindBy(css = "input[type=submit]")           private WebElement submitButton;

    //====================Abstract Methods code==================//

    private WebElement webElement;

    @Override
    public void initMap() {
        mapOfWebElements.put("I AGREE", iAgreeButton);
        mapOfWebElements.put("Username", userName);
        mapOfWebElements.put("Password", password);
        mapOfWebElements.put("SIGN IN", submitButton);
    }

    @Override
    public WebElement getWebElement(String elementName) {
        if(!mapOfWebElements.containsKey(elementName)){
            throw new RuntimeException("Element not found " + elementName);
        }
        return mapOfWebElements.get(elementName);
    }

    @Override
    public List<WebElement> getListOfWebelement(String elementName) {
        if(!mapOfListOfWebElements.containsKey(elementName)){
            throw new RuntimeException("List of Web Element not found " + elementName);
        }
        return mapOfListOfWebElements.get(elementName);
    }


}
