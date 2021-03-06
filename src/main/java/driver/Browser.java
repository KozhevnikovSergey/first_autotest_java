package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null) {
            driver = getBrowser();
            return driver;
        } else {
            return driver;
        }
    }

    private static WebDriver getBrowser(){
        String browser = System.getProperty("BROWSER");
        if (browser == null){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        switch(browser){
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "FF":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
        }
        WebDriverManager.chromedriver().setup();
        return new FirefoxDriver();
    }
}
