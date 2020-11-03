package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {
    public static void waitForAlertBanner (WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,10);
        //this line fails
        //WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert alert-success"))));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-success']"))));
    }
    public static String getAlertBannerText (WebDriver driver){
        return driver.findElement(By.xpath("//div[@role='alert']")).getText();
    }
}
