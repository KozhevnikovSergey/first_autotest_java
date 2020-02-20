import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BasicTest {
    protected static  WebDriver driver;

    @BeforeMethod
    protected static void setup(){
      driver = new FirefoxDriver();
    }

    @AfterMethod
    protected static void close(){
        driver.close();
    }
}
