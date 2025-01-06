package TestsForSelenIDE;

import StepsSelenIDE.WaitsTestStepsSelenIDE;
import org.testng.annotations.Test;

public class WaitsTestSelenIDE {
    WaitsTestStepsSelenIDE waitsTestStepsSelenIDE = new WaitsTestStepsSelenIDE();

    @Test
    public void waitProgressBar () {
        waitsTestStepsSelenIDE
                                .openPage()
                                .startStopButton()
                                .getText("100");
    }
}
