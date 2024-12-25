package StepsSelenIDE.ActionRobot;

import ElementsForSelenIDE.ActionRobotSelenIDEElements;
import URL.URL;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.open;

public class RobotStepsSelenIDE extends ActionRobotSelenIDEElements {
    Robot robot = new Robot();
    URL url = new URL();

    public RobotStepsSelenIDE() throws AWTException {
    }

    public void openGooglePage() {
        open(url.google);
    }

    public void senText () {
        searchBox.setValue(text).sendKeys(Keys.ENTER);
    }

    public void useTab () throws InterruptedException {
        for (int i = 0; i<=25; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(300);
            actions().sendKeys(Keys.ENTER);
        }
    }
}
