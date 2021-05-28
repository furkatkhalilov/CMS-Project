package step_definitions;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import pom.POM_Initializer.PomPageFactory;
import pom.POM_Initializer.StepDefinitionMethods;
import utilities.DriverSingleton;

import java.util.Locale;
import java.util.Map;
public class LoginSteps {
    private StepDefinitionMethods function;
    private WebDriver driver = DriverSingleton.getWebDriver();

    @Given("^Login as \"([^\"]*)\"$")
    public void navigate_to(String user) {
        driver.get("https://cmpdev2.dol.gov/suite/");
        driver.manage().window().maximize();
        PomPageFactory.setPomPage("Login Page");
        function = new StepDefinitionMethods();
        function.clickOn("I AGREE");
        String[] userNameAndPassword = getUserNameAndPassword(user);
        function.sendKeys("Username", userNameAndPassword[0]);
        function.sendKeys("Password", userNameAndPassword[1]);
        function.clickOn("SIGN IN");
   }


    private String[] getUserNameAndPassword(String user){
        String[] userNameAndPassword = new String[2];
        user = user.toUpperCase();
        switch(user) {
            case "DORO" : userNameAndPassword[0] = "newyorkdoro@dol.gov"; userNameAndPassword[1] = "DOLDev#3"; break;
            case "DD" : userNameAndPassword[0] = "newyorkdd@dol.gov"; userNameAndPassword[1] = "DOLDev#3"; break;
            case "CO" : userNameAndPassword[0] = "newyorkco@dol.gov"; userNameAndPassword[1] = "DOLDev#3"; break;
            case "ADD" : userNameAndPassword[0] = "newyorkadd@dol.gov"; userNameAndPassword[1] = "DOLDev#3"; break;
            case "MGMT" : userNameAndPassword[0] = "nobesmgmt@dol.gov"; userNameAndPassword[1] = "DOLDev#3"; break;

        }
        return userNameAndPassword;
    }

}

