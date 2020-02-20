package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainGooglePage extends Page{

    @FindBy(name = "q")
    private WebElement element;

    public MainGooglePage(WebDriver driver){
        super(driver);
    }

    public MainGooglePage open(){
        driver.get(SAXExample2);
        return this;
    }

    public ResultGooglePage inputInSearch(String inputMessage){

        element.sendKeys(inputMessage);
        element.submit();

        return new ResultGooglePage(driver);
    }
}
