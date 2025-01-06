package Steps.ActionRobot;

import ElementsForSelenium.ActionRobotElements;
import URL.URL;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotSteps extends ActionRobotElements {
    WebDriver driver;
    URL url = new URL();
    Robot robot;

    public RobotSteps (WebDriver driver, Robot robot) {
        this.driver = driver;
        this.robot = robot;
    }


    public void openPageGoogle () {
        driver.get(url.google);
    }

    public void  searchBox () {
        driver.findElement(searchBox).click();
    }

    public void sendText () throws AWTException {

        for (char c : text.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            if (keyCode != KeyEvent.CHAR_UNDEFINED) {
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
            }
        }
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    public void sendTab () throws InterruptedException {
        for (int i = 0; i<=25; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(300);

        }
    }

    public void sendKeyEnter () {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void titleAssert () {
        Assert.assertTrue(driver.getTitle().contains("Selenium"));
    }
}
