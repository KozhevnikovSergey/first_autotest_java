package pages;

import driver.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.Closeable;

public abstract class Page {
    public WebDriver driver = Browser.getDriver() ;

    protected Page() {
        // Эта штука заменяет явное ожидание?
        PageFactory.initElements(driver, this);
//        this.driver = driver;
    }

}
