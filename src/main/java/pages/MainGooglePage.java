package pages;

import environment.SAXExample2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class MainGooglePage extends Page{

    @FindBy(name = "q")
    private WebElement element;

    public MainGooglePage open() throws IOException, SAXException, ParserConfigurationException {
        driver.get(SAXExample2.getUrl());
        return this;
    }

    public ResultGooglePage inputInSearch(String inputMessage){

        element.sendKeys(inputMessage);
        element.submit();

        return new ResultGooglePage();
    }
}
