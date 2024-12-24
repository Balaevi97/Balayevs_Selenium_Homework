package TestsForSelenIDE;

import SetUp.SetUpForSelenIDE;
import StepsSelenIDE.WebFormsStepsSelenIDE;
import org.testng.annotations.Test;

public class WebFormsTestForSelenIDE extends SetUpForSelenIDE {
    WebFormsStepsSelenIDE webFormsStepsSelenIDE = new WebFormsStepsSelenIDE();

    @Test (priority = 1)
    public void dropdownMenu () {
        webFormsStepsSelenIDE.openPage();
        webFormsStepsSelenIDE.selectPython();
    }

    @Test (priority = 2)
    public void radioButton () {
        webFormsStepsSelenIDE.openPage();
        webFormsStepsSelenIDE.checkbox();
    }

    @Test (priority = 3)
    public void yellowButtonClick () throws InterruptedException {
        webFormsStepsSelenIDE.openPage();
        webFormsStepsSelenIDE.yellowButtonClick();
        Thread.sleep(5000);
    }

    @Test (priority = 4)
    public void disabledOrange () {
        webFormsStepsSelenIDE.openPage();
        webFormsStepsSelenIDE.disabledOrange();
    }

}