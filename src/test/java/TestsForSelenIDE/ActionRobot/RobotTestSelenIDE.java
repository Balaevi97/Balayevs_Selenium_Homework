package TestsForSelenIDE.ActionRobot;


import StepsSelenIDE.ActionRobot.RobotStepsSelenIDE;
import org.testng.annotations.Test;

import java.awt.*;

public class RobotTestSelenIDE {
    RobotStepsSelenIDE robotStepsSelenIDE = new RobotStepsSelenIDE();

    public RobotTestSelenIDE() throws AWTException {
    }

    @Test
    public void google () throws InterruptedException {
        robotStepsSelenIDE.openGooglePage();
        robotStepsSelenIDE.senText();
        robotStepsSelenIDE.useTab();

    }
}
