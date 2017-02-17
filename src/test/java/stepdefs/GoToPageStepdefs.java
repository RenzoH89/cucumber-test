package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import grid.RemoteDriver;

/**
 * Created by dto21215 on 25-11-2016.
 */
public class GoToPageStepdefs {
    WebDriver driver;

    public GoToPageStepdefs(){
        driver = RemoteDriver.driver;
    }

    @Given("^User is on Home Page$")
    public void userIsOnHomePage() throws Throwable {
        driver.navigate().to("https://www.google.nl");
        driver.manage().window().maximize();
        Assert.assertEquals("Google", driver.getTitle());
    }

    @When("^the users searches for \"([^\"]*)\"$")
    public void theUsersSearchesFor(String searchString) throws Throwable {
        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys(searchString);
        q.submit();
    }

    @Then("^the system displays results on \"([^\"]*)\"$")
    public void theSystemDisplaysResultsOn(String searchString) throws Throwable {
        Thread.sleep(2000);
        Assert.assertEquals(searchString +" - Google zoeken", driver.getTitle());
    }
}
