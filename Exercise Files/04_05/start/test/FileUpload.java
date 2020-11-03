import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/yelenaportnaya/Downloads/Ex_Files_Selenium_EssT/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        WebElement fileupload = driver.findElement(By.id("file-upload-field"));
        fileupload.sendKeys("file-to-upload.png");

        driver.quit();
    }
}
