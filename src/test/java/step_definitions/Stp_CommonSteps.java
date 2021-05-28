package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import pom.POM_Initializer.PomPageFactory;
import pom.POM_Initializer.StepDefinitionMethods;
import utilities.DriverSingleton;

import java.util.Map;

public class Stp_CommonSteps {

    private StepDefinitionMethods function;
    private WebDriver driver = DriverSingleton.getWebDriver();

    @Given("^navigate to \"([^\"]*)\"$")
    public void navigate_to(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Then("^user is on \"([^\"]*)\"$")
    public void userIsOn(String pageName) {
        PomPageFactory.setPomPage(pageName);
        function = new StepDefinitionMethods();
//        pomPage.wait.until(webDriver -> ((JavascriptExecutor) driver)
//                .executeScript("return document.readyState").toString().equals("complete"));
    }

    @When("^user clicks on \"([^\"]*)\"$")
    public void click_on(String element) {
        function.clickOn(element);
    }

    @And("^randomly select an option from the \"([^\"]*)\" dropdown list$")
    public void randomlySelectAnOptionFromTheDropdownList(String elementName) {
        function.selectRandomFromDropDown(elementName);
    }

    @When("^user fills the text input fields as below:$")
    public void fill_the_form_text_fields_as_below(DataTable dataTable) {

        Map<String, String> elementsAndValue = dataTable.asMap(String.class, String.class);

        for (Map.Entry<String, String> element: elementsAndValue.entrySet()) {
            function.sendKeys(element.getKey(), element.getValue());
        }
    }

    @And("^click on \"([^\"]*)\" on alert$")
    public void clickOnOnAlert(String arg)  {
        if (arg.equalsIgnoreCase("yes") || arg.equalsIgnoreCase("ok")){
            driver.switchTo().alert().accept();
        }
        else driver.switchTo().alert().dismiss();
    }
}