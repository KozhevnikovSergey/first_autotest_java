package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class ResultGooglePage extends Page{

    public OpenPage clickOnLine(Integer numberLine){
        WebElement line = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//div[@class='srg']/div[" + numberLine + "]//a[@href]")));

        String oldTab = driver.getWindowHandle();
        line.click();
        driver.close();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        return new OpenPage();
    }
}
