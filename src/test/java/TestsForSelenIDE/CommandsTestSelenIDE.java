package TestsForSelenIDE;

import StepsSelenIDE.CommandsTestStepsSelenIDE;
import org.testng.annotations.Test;

public class CommandsTestSelenIDE {
    CommandsTestStepsSelenIDE commandsTestStepsSelenIDE = new CommandsTestStepsSelenIDE();

        @Test (priority = 1)
        public void Test() throws InterruptedException {
            commandsTestStepsSelenIDE
                                        .openPage()
                                        .enableButton()
                                        .textField("Bootcamp")
                                        .itemGetAttribute()
                                        .getButtonTextEnable()
                                        .getMessageTextEnabled()
                                        .clearTextbox()
                                        .disableButton()
                                        .buttonDisable()
                                        .getMessageTextDisabled()
                                        .moveTo()
                                        .columnAssert();

        }
}
