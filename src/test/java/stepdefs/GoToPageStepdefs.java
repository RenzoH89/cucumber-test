package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import driver.RemoteDriver;
import pages.BasePage;

/**
 * Created by dto21215 on 25-11-2016.
 */
public class GoToPageStepdefs extends BasePage {

    @Given("^User is on Home Page$")
    public void userIsOnHomePage() throws Throwable {
        navigatoTo("http://www.google.nl");
        verifyTitle("Google");
    }

    @When("^the users searches for \"([^\"]*)\"$")
    public void theUsersSearchesFor(String searchString) throws Throwable {
        searchFor(searchString);
    }

    @Then("^the system displays results on \"([^\"]*)\"$")
    public void theSystemDisplaysResultsOn(String searchString) throws Throwable {
        Thread.sleep(2000);
        verifyTitle(searchString +" - Google zoeken");
    }
}
