import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ConfirmationPage;
import pages.FormPage;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/yelenaportnaya/Downloads/Ex_Files_Selenium_EssT/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formpage = new FormPage();
        formpage.submitForm(driver);

        ConfirmationPage confirmationpage = new ConfirmationPage();
        confirmationpage.waitForAlertBanner(driver);
        assertEquals("The form was successfully submitted!", confirmationpage.getAlertBannerText(driver));

        driver.quit();
    }
}

