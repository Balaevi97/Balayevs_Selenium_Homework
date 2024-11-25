import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommandsTest {
    WebDriverWait wait;
    @Test
    public void Test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_controls ");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
        Thread.sleep(5000);

        WebElement itemGetAttribute = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
        String disableItem = itemGetAttribute.getAttribute("disabled");
        if (disableItem == null) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        WebElement buttonEnable = driver.findElement(By.xpath("//*[@id='input-example']//button[text()='Disable']"));
        if (buttonEnable.isDisplayed()) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        WebElement itIsEnabled = driver.findElement(By.xpath("//*[@id = 'message' and text() = concat('It', \"'\", 's enabled!')]\n"));
        if (itIsEnabled.isDisplayed()) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        WebElement sendKeys = driver.findElement(By.xpath("//*[@id='input-example']//input"));
        sendKeys.sendKeys("Bootcamp");
        sendKeys.clear();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                        // დამატებით წავივარჯიშე //
        Thread.sleep(3000);
        sendKeys.sendKeys("Bootcamp");
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
        Thread.sleep(5000);

        boolean disableItem1 = Boolean.parseBoolean(itemGetAttribute.getAttribute("disabled"));
        if (disableItem1) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        WebElement buttonEnable1 = driver.findElement(By.xpath("//*[@id='input-example']//button[text()='Enable']"));
        if (buttonEnable1.isDisplayed()) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        WebElement itIsEnabled1 = driver.findElement(By.xpath("//*[@id = 'message' and text() = concat('It', \"'\", 's disabled!')]\n"));
        if (itIsEnabled1.isDisplayed()) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        driver.navigate().to("http://the-internet.herokuapp.com/drag_and_drop");
        int columnA = driver.findElement(By.id("column-a")).getLocation().y;
        int columnB = driver.findElement(By.id("column-b")).getLocation().y;
        if (columnA == columnB) {
            System.out.println("A და B კვადრატები ერთი და იგივე Y კოორდინატზე მდებარეობს /Test Passed/");
        } else {
            System.out.println("A და B კვადრატები სხვადასხვა Y კოორდინატზე მდებარეობს /Test Failed/");
        }
        driver.close();
    }
}
