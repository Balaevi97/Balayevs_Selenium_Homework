import SetUp.SetUp;
import Steps.PageScrollSteps;
import org.testng.annotations.Test;


public class PageScroll extends SetUp {

    PageScrollSteps pageScrollSteps = new PageScrollSteps(driver, js);


    @Test (priority = 1)
    public void scrollThreeTimes () throws InterruptedException {

        pageScrollSteps.openPage();
        Thread.sleep(1000);
        pageScrollSteps.getTopScrollBar();
        pageScrollSteps.ScrollDown();
        pageScrollSteps.firstAssert();
        Thread.sleep(1000);
        pageScrollSteps.ScrollDown();
        pageScrollSteps.secondAssert();
        Thread.sleep(1000);
        pageScrollSteps.thirdAssert();

    }

    @Test (priority = 2)
    public void submit () {

        pageScrollSteps.openSecondPage();
        pageScrollSteps.scrollToSubmitButton();
        pageScrollSteps.getSubmitButtonAssert();
    }


    @Test (priority = 3)
    public void scrollHeight ()  {

        pageScrollSteps.openSecondPage();
        pageScrollSteps.scrollToEnd();
        pageScrollSteps.bottomElementAsset();
    }

}
