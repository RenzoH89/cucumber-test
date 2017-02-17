/**
 * Created by dto21215 on 25-11-2016.
 */

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class GridClass {
    public WebDriver driver;
    public String node;

    @Parameters("browser")
    @BeforeTest
    public void launchbrowser(String browser) throws MalformedURLException {

        if (browser.equalsIgnoreCase("chrome")) {
            node = "http://localhost:5555/wd/hub";
            DesiredCapabilities cap = DesiredCapabilities.chrome();
            cap.setBrowserName("chrome");
            cap.setVersion("56");
            cap.setPlatform(Platform.UNIX);
            driver = new RemoteWebDriver(new URL(node), cap);

            // puts an Implicit wait, Will wait for 10 seconds before throwing an exception
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }
}