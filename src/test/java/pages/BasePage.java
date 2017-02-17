package pages;

import driver.RemoteDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by renzohoogendoorn on 17-02-17.
 */
public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = RemoteDriver.driver;
    }

    public void navigatoTo(String address) {
        driver.navigate().to(address);
        driver.manage().window().maximize();
    }

    public void verifyTitle(String title) {
        Assert.assertEquals(title, driver.getTitle());
    }

    public void searchFor(String searchString){
        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys(searchString);
        q.submit();

    }
}