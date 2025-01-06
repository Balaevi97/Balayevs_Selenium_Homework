package TestsForSelenIDE;

import StepsSelenIDE.PageScrollStepsSelenIDE;
import org.testng.annotations.Test;

public class PageScrollTestSelenIDE  {
    PageScrollStepsSelenIDE pageScrollStepsSelenIDE = new PageScrollStepsSelenIDE();

    @Test (priority = 1)
    public void scrollThreeTimes () throws InterruptedException {
        pageScrollStepsSelenIDE.openPage();
        Thread.sleep(1000);
        pageScrollStepsSelenIDE.getTopScrollBar();
        pageScrollStepsSelenIDE.scrollDown();
        pageScrollStepsSelenIDE.firstAssert();
        Thread.sleep(1000);
        pageScrollStepsSelenIDE.scrollDown();
        pageScrollStepsSelenIDE.secondAssert();
        Thread.sleep(1000);
        pageScrollStepsSelenIDE.thirdAssert();
    }

    @Test (priority = 2)
    public void submit () {
        pageScrollStepsSelenIDE.openSecondPage();
        pageScrollStepsSelenIDE.scrollToSubmitButton();
        pageScrollStepsSelenIDE.getSubmitButtonAssert();
    }

    @Test (priority = 3)
    public void scrollHeight ()  {
        pageScrollStepsSelenIDE.openSecondPage();
        pageScrollStepsSelenIDE.scrollToEnd();
        pageScrollStepsSelenIDE.bottomElementAsset();
    }

}
