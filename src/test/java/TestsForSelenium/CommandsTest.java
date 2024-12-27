package TestsForSelenium;

import SetUp.SetUp;
import Steps.CommandsTestSteps;
import org.testng.annotations.Test;

public class CommandsTest extends SetUp {
    CommandsTestSteps commandsTestSteps = new CommandsTestSteps(driver);


    @Test (priority = 1)
    public void Test() throws InterruptedException {

        commandsTestSteps.openPage();
        commandsTestSteps.enableButton();
        Thread.sleep(5000);
        commandsTestSteps.textField("It's enabled!");
        commandsTestSteps.enableItemArray();
        commandsTestSteps.buttonNameEnable();
        commandsTestSteps.messageTextEnabledAssert();
        commandsTestSteps.clearTextbox();
        commandsTestSteps.textField("Bootcamp");
        commandsTestSteps.disableButton();
        Thread.sleep(5000);
        commandsTestSteps.disableItemArray();
        commandsTestSteps.buttonDisableAssert();
        commandsTestSteps.messageTextDisabledAssert();
        driver.navigate().to("http://the-internet.herokuapp.com/drag_and_drop");
        Thread.sleep(3000);
        commandsTestSteps.columnAssert();

    }
}
