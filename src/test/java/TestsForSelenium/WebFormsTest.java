package TestsForSelenium;

import SetUp.SetUp;
import Steps.WebFormsSteps;
import org.testng.annotations.Test;

public class WebFormsTest extends SetUp {
    WebFormsSteps webFormsSteps = new WebFormsSteps(driver);

    @Test (priority = 1)
    public void dropdownMenu () {
        webFormsSteps.openPage();
        webFormsSteps.dropdownMenu();
        webFormsSteps.python();
        webFormsSteps.assertPython();
    }

    @Test (priority = 2)
    public void checkboxe () {
        webFormsSteps.checkboxe();
    }

    @Test (priority = 3)
    public void radioButton () {
        webFormsSteps.yellowButtonClick();
        webFormsSteps.getYellowAssert();
    }

    @Test (priority = 4)
    public void selectedDisabled () {
        webFormsSteps.fruitsMenu();
        webFormsSteps.disabledOrange();
    }
}