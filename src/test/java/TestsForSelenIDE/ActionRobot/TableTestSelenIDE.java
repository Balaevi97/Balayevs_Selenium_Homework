package TestsForSelenIDE.ActionRobot;

import SetUp.SetUpForSelenIDE;
import StepsSelenIDE.ActionRobot.TableStepsSelenIDE;
import org.testng.annotations.Test;

public class TableTestSelenIDE extends SetUpForSelenIDE {
    TableStepsSelenIDE tableStepsSelenIDE = new TableStepsSelenIDE();

    @Test
    public void table () {
        tableStepsSelenIDE.tableLink();
        tableStepsSelenIDE.tables();
    }
}
