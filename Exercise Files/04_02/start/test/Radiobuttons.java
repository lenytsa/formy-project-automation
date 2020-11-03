import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/yelenaportnaya/Downloads/Ex_Files_Selenium_EssT/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
        radiobutton1.click();
        WebElement radiobutton2 = driver.findElement(By.xpath("//input[@value='option2']"));
        radiobutton2.click();
        WebElement radiobuton3 = driver.findElement(By.xpath("//input[contains(@value,'option3')]"));
        radiobuton3.click();

        driver.quit();
    }
}
