import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/yelenaportnaya/Downloads/Ex_Files_Selenium_EssT/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropdow = driver.findElement(By.id("dropdownMenuButton"));
        dropdow.click();
        WebElement autocomlplte =driver.findElement(By.xpath("(//a[@href='/modal'])[2]"));
        autocomlplte.click();

        driver.quit();
    }
}
