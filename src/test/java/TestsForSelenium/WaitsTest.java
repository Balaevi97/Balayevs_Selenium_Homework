package TestsForSelenium;

import SetUp.SetUp;
import Steps.WaitsTestSteps;
import org.testng.annotations.Test;


public class WaitsTest extends SetUp {
    WaitsTestSteps waitsTestSteps = new WaitsTestSteps(driver);
    @Test (priority = 1)
    public void waitProgressBar () {

        waitsTestSteps.openPage();
        waitsTestSteps.startStopButton();
        waitsTestSteps.AssertVolumeValue("100");
    }
}
