import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

/**
 * Created by dto21215 on 25-11-2016.
 */
public class GoToPageStepdefs {

    GridClass grid = new GridClass();

    @Before
    public void setup() throws MalformedURLException {
        grid.launchbrowser("chrome");
    }

    @Given("^User is on Home Page$")
    public void userIsOnHomePage() throws Throwable {
        grid.driver.navigate().to("https://www.google.nl");
        grid.driver.manage().window().maximize();
        Assert.assertEquals("Google", grid.driver.getTitle());
    }

    @When("^the users searches for \"([^\"]*)\"$")
    public void theUsersSearchesFor(String searchString) throws Throwable {
        WebElement q = grid.driver.findElement(By.name("q"));
        q.sendKeys(searchString);
        q.submit();
    }

    @Then("^the system displays results on \"([^\"]*)\"$")
    public void theSystemDisplaysResultsOn(String searchString) throws Throwable {
        Thread.sleep(2000);
        Assert.assertEquals(searchString +" - Google zoeken", grid.driver.getTitle());
    }

    @After()
    public void tearDown() {
        // quit driver
        grid.driver.quit();
    }
}
