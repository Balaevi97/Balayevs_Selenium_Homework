package SetUp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class SetUp {
    public WebDriver driver;
    public Actions actions;
    public JavascriptExecutor js;
    @BeforeTest
    public void setDriver () {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            js = (JavascriptExecutor) driver;
            actions = new Actions(driver);
        }
    }
        @AfterTest
        public void closeDriver() {
            if (driver != null) {
                driver.quit(); // Close the entire session
            }
        }

    public SetUp() {
            setDriver();
        }
    }

