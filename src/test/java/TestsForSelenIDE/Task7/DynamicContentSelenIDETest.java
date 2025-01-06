package TestsForSelenIDE.Task7;

import StepsSelenIDE.Task7.DynamicContentSelenIDESteps;
import org.testng.annotations.Test;

public class DynamicContentSelenIDETest {
    DynamicContentSelenIDESteps dynamicContentSelenIDESteps = new DynamicContentSelenIDESteps();
    @Test
    public void first () {
        dynamicContentSelenIDESteps.openURL()
                                    .dynamicContent();
        for (int i=0; i<3; i++){
            dynamicContentSelenIDESteps.getPictureList()
                                        .refreshData()
                                        .comparePicture();

        }
    }
}
