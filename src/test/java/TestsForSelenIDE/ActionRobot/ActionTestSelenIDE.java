package TestsForSelenIDE.ActionRobot;

import StepsSelenIDE.ActionRobot.ActionStepsSelenIDE;
import org.testng.annotations.Test;

import java.awt.*;

public class ActionTestSelenIDE {
    ActionStepsSelenIDE actionStepsSelenIDE = new ActionStepsSelenIDE();

    public ActionTestSelenIDE() throws AWTException {
    }

    @Test (priority = 1)

    public void actionTest () {
        actionStepsSelenIDE.openPageHover();
        actionStepsSelenIDE.hoverButton();
        actionStepsSelenIDE.hoverButtonAssert();
    }


}
