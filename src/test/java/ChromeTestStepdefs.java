import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by dto21215 on 25-11-2016.
 */
public class ChromeTestStepdefs {
    @Given("^User is on Home Page$")
    public void userIsOnHomePage() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/Users/dvt/git/repos/java-cucumber-project/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("http://otwn.nl/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        Assert.assertEquals("otwn – Werkgroep testautomatisering", driver.getTitle());
        driver.findElement(By.xpath("//a[@href='http://otwn.nl']")).click();
        Thread.sleep(2000);
        //throw new PendingException();

        // quit driver
        driver.quit();
    }
}
