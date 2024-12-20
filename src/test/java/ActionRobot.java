import SetUp.SetUp;
import Steps.ActionRobot.ActionSteps;
import Steps.ActionRobot.RobotSteps;
import Steps.ActionRobot.TableSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.awt.*;

public class ActionRobot extends SetUp {
    TableSteps tableSteps = new TableSteps(driver);
    ActionSteps actionSteps = new ActionSteps(driver, actions);
    RobotSteps robotSteps = new RobotSteps(driver, new Robot());

    public ActionRobot() throws AWTException {
    }

    @Test(priority = 1)
    public void table () {
        tableSteps.openPageHerokuApp();
        tableSteps.tableAssert();

    }

    @Test(priority = 2)
    public void actionTest () throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        actionSteps.openPageHover();
        js.executeScript("arguments[0].scrollIntoView({block: 'center' });", actionSteps.hoverButton());
        actionSteps.moveToElement();
        actionSteps.getHoverButtonMessageAssert("buttonToolTip");
    }

    @Test(priority = 3)
    public void robotTest () throws AWTException, InterruptedException {

        robotSteps.openPageGoogle();
        robotSteps.searchBox();
        robotSteps.sendText();
        Thread.sleep(1000);
        robotSteps.sendTab();
        robotSteps.sendKeyEnter();
        robotSteps.titleAssert();
    }

}