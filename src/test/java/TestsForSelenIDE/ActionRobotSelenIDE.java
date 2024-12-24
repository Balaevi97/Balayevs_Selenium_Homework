package TestsForSelenIDE;

import SetUp.SetUpForSelenIDE;
import StepsSelenIDE.ActionRobot.ActionStepsSelenIDE;
import org.testng.annotations.Test;

import java.awt.*;

public class ActionRobotSelenIDE extends SetUpForSelenIDE {
    ActionStepsSelenIDE actionStepsSelenIDE = new ActionStepsSelenIDE();

    public ActionRobotSelenIDE() throws AWTException {
    }

    @Test (priority = 1)

    public void actionTest () {
        actionStepsSelenIDE.openPageHover();
        actionStepsSelenIDE.hoverButton();
        actionStepsSelenIDE.hoverButtonAssert();
    }

    @Test (priority = 2)

    public void google () throws InterruptedException {
        actionStepsSelenIDE.openGooglePage();
        actionStepsSelenIDE.senText();
        actionStepsSelenIDE.useTab();
        actionStepsSelenIDE.asserts();
    }

    @Test (priority = 3)
    public void table () {
        actionStepsSelenIDE.tableLink();
        actionStepsSelenIDE.table();
    }
}
