import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class ActionRobot {

    @Test(priority = 1)
    public void table () {
        boolean isFrankFound = false;
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/tables");

        for (int tableRows = 1; tableRows <= 4; tableRows ++) {
            for (int tableColumns : new int[]{2, 4}) {
                String data = driver.findElement(By.xpath
                        ("//*//table [@id = 'table1']/tbody/tr[" + tableRows + "]/td["+tableColumns+"]")).getText();
                System.out.println("მონაცემი " + data);
                if (data.equals("Frank")) {
                    isFrankFound = true;
                }
            }
        }
        Assert.assertTrue("Frank", isFrankFound);
        driver.close();
    }

    @Test(priority = 2)
    public void actionTest () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/tool-tips");
        WebElement buttonButton = driver.findElement(By.id("toolTipButton"));
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView({block: 'center' });", buttonButton);
        actions.moveToElement(buttonButton).perform();
        WebElement button = driver.findElement(By.xpath("//*//button [@id = 'toolTipButton' and @aria-describedby = 'buttonToolTip']"));
        Assert.assertTrue(button.isDisplayed());
        driver.close();
    }

    @Test(priority = 3)
    public void robotTest () throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Robot robot = new Robot();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.google.com");
        WebElement search = driver.findElement(By.id("APjFqb"));
        search.click();
        String text = "Selenium Robot Class example";
        for (char c : text.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            if (keyCode != KeyEvent.CHAR_UNDEFINED) {
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
            }
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        for (int i = 0; i<=25; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(300);

        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Assert.assertEquals("How to use Robot Class in Selenium? Step-by-step Tutorial.", driver.getTitle());
        driver.close();

    }


}
