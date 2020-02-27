package test_package;

import driver.Browser;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
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

//    protected static  WebDriver driver;
//    private Logger logger = Logger.getLogger(test_package.BasicTest.class);

//    @BeforeMethod
//    protected static void setup(){
//      driver = new FirefoxDriver();
//    }

//    @AfterMethod
//    protected static void close(){
//        driver.close();
//    }
}
