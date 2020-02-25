package driver;

import com.google.common.base.internal.Finalizer;
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

    public static WebDriver getBrowser(){
        // Проблема. Берет null
        String browser = System.getProperty("BROWSER");
        if (browser == null){
            return new FirefoxDriver();
        }
        switch(browser){
            case "CHROME":
                return new ChromeDriver();
            case "FF":
                return new FirefoxDriver();
        }
        return new FirefoxDriver();
    }
}
