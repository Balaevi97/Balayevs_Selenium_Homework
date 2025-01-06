package StepsSelenIDE.ActionRobot;

import ElementsForSelenIDE.ActionRobotSelenIDEElements;
import URL.URL;

import java.awt.*;

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

}

