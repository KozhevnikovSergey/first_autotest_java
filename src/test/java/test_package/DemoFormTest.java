package test_package;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;
import pages.MainGooglePage;
import pages.OpenPage;
import pages.ResultGooglePage;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DemoFormTest extends BasicTest {
    @Test
    public void singleInputeTest() throws InterruptedException, ParserConfigurationException, SAXException, IOException {
        MainGooglePage mainGooglePage = new MainGooglePage().open();
//        ResultGooglePage resultGooglePage = mainGooglePage.inputInSearch("Selenium");
//
//        OpenPage openPage = resultGooglePage.clickOnLine(3);
//
//        Assertions.assertThat(openPage.driver.getPageSource().toLowerCase().contains("время от времени")).isTrue();

    }
}