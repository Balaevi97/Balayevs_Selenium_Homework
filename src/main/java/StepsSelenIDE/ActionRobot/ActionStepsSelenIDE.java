package StepsSelenIDE.ActionRobot;

import ElementsForSelenIDE.ActionRobotSelenIDEElements;
import URL.URL;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

public class ActionStepsSelenIDE extends ActionRobotSelenIDEElements {
Robot robot = new Robot();
    URL url = new URL();

    public ActionStepsSelenIDE() throws AWTException {
    }

    public void openPageHover() {
        open(url.hover);
    }

    public void hoverButton () {
        hoverButton.scrollIntoCenter().hover().shouldHave(attribute("aria-describedby"));
    }

    public void hoverButtonAssert () {
        hoverButton.getAttribute("aria-describedby").equals("buttonToolTip");
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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

    public void asserts () {

        title().contains("selenium");
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void tableLink () {
        open("https://the-internet.herokuapp.com/tables");
    }

    public boolean table () {
        boolean isFrankFound = false;
        for (var cell : table) {
            String data = cell.getText();
            System.out.println("მონაცემები: " + data);

            if (data.equals("Frank")) {
                isFrankFound = true;
            }
        }
        return isFrankFound;
    }
}

