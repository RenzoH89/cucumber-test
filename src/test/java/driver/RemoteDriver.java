package driver; /**
 * Created by dto21215 on 25-11-2016.
 */

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteDriver {
    public static RemoteWebDriver driver;
    public String node;

    @Before
    public void launchbrowser() throws MalformedURLException {

            node = "http://localhost:5555/wd/hub";
            DesiredCapabilities cap = DesiredCapabilities.chrome();
            cap.setBrowserName("chrome");
            cap.setVersion("56");
            cap.setPlatform(Platform.UNIX);
            driver = new RemoteWebDriver(new URL(node), cap);

            // puts an Implicit wait, Will wait for 10 seconds before throwing an exception
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}