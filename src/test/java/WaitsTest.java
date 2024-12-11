import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WaitsTest {
    @Test
    public void waitProgressBar () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoqa.com/progress-bar");
        driver.findElement(By.xpath("//button [@id = 'startStopButton']")).click();
        WebElement hundredPercentage = driver.findElement(By.xpath("//div [@aria-valuenow= '100']"));
        if (hundredPercentage.isDisplayed()) {
            System.out.println("Here We Go! Test Passed");
        } else {
            System.out.println("Try Again");
        }
        driver.close();
    }
}
