package test_package;

import driver.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BasicTest {
    static WebDriver driver;

    @BeforeMethod
    protected static void initDriver(){
        driver = Browser.getDriver();
    }

    @AfterMethod
    protected static void quitDriver(){
        driver.quit();
    }

}
