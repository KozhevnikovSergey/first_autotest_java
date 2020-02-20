import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import pages.MainGooglePage;
import pages.ResultGooglePage;

public class DemoFormTest extends BasicTest {
    @Test
    public void singleInputeTest() throws InterruptedException {
        MainGooglePage mainGooglePage = new MainGooglePage(driver).open();
        ResultGooglePage resultGooglePage = mainGooglePage.inputInSearch("Selenium");

        resultGooglePage.clickOnLine(3);

        Assertions.assertThat(driver.getPageSource().toLowerCase().contains("что такое selenium?")).isTrue();

    }
}
