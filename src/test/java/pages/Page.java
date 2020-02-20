package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {
    protected WebDriver driver;

    protected Page(WebDriver driver) {
        // Эта штука заменяет явное ожидание?
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
