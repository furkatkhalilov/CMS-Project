package feature_files.pomold;

import cucumber.api.DataTable;


import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import pom.POM_Initializer.PomPageFactory;
import pom.POM_Initializer.StepDefinitionMethods;
import utilities.DriverSingleton;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Stp_CommonStepsOLD {
//
//    private StepDefinitionMethods function;
//    private WebDriver driver = DriverSingleton.getWebDriver();
//
//    @Given("navigate to {string}")
//    public void navigate_to(String url) {
//        driver.get(url);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//
//    @Then("user is on {string}")
//    public void userIsOn(String pageName) {
//        PomPageFactory.setPomPage(pageName);
//        function = new StepDefinitionMethods();
//    }
//
//    @When("user clicks on {string}")
//    public void click_on(String element) {
//        function.clickOn(element);
//    }
//
//    @And("randomly select an option from the {string} dropdown list")
//    public void randomlySelectAnOptionFromTheDropdownList(String elementName) {
//        function.selectRandomFromDropDown(elementName);
//    }
//
//    @When("fill the form text fields as below:")
//    public void fill_the_form_text_fields_as_below(DataTable dataTable) {
//
//        Map<String, String> elementsAndValue = dataTable.asMap(String.class, String.class);
//
//        for (Map.Entry<String, String> element: elementsAndValue.entrySet()) {
//            function.sendKeys(element.getKey(), element.getValue());
//        }
//    }
}
