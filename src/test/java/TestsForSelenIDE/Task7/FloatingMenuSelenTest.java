package TestsForSelenIDE.Task7;

import StepsSelenIDE.Task7.FloatingMenuSelenIDSteps;
import org.testng.annotations.Test;

public class FloatingMenuSelenTest {
    FloatingMenuSelenIDSteps floatingMenuSelenIDSteps = new FloatingMenuSelenIDSteps();

    @Test
    public void floatingMenu () {
        floatingMenuSelenIDSteps.openURL()
                                .clickFloating()
                                .scrollToEnd()
                                .checkMenu();
    }
}
