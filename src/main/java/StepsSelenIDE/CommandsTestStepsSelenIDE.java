package StepsSelenIDE;

import ElementsForSelenIDE.CommandsTestSelenIDEElements;
import URL.URL;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;


public class CommandsTestStepsSelenIDE extends CommandsTestSelenIDEElements {
    URL url = new URL();

    public CommandsTestStepsSelenIDE openPage() {
        open(url.dynamic_controls);
        return this;
    }

    public CommandsTestStepsSelenIDE enableButton () {
        enableButton.click();
        return this;
    }

    public CommandsTestStepsSelenIDE textField (String text) {
        itemGetAttribute.sendKeys(text);
        return this;
    }

    public CommandsTestStepsSelenIDE itemGetAttribute () {
         itemGetAttribute.shouldNotHave(attribute("disabled"));
        return this;
    }

    public CommandsTestStepsSelenIDE   getButtonTextEnable () {
        // buttonEnable.getText();
        buttonEnable.shouldHave(text("Disable"));
        return this;
    }

    public CommandsTestStepsSelenIDE getMessageTextEnabled () {
         messageTextEnabled.shouldHave(text("It's enabled!"));
        return this;
    }

    public CommandsTestStepsSelenIDE clearTextbox () {
        itemGetAttribute.clear();
        return this;
    }

    public CommandsTestStepsSelenIDE disableButton () {
        disableButton.click();
        return this;
    }

    public CommandsTestStepsSelenIDE   buttonDisable () {
        buttonDisable.shouldHave(text("Enable"));
        return this;
    }

    public CommandsTestStepsSelenIDE getMessageTextDisabled () {
        messageTextDisabled.shouldHave(text("It's disabled!"));
        return this;
    }

    public CommandsTestStepsSelenIDE moveTo () {
        open(url.moveTo);
        return this;
    }

    public int columnALocation () {
        return columnA.getLocation().y;
    }

    public int columnBLocation () {
        return columnB.getLocation().y;
    }

    public CommandsTestStepsSelenIDE columnAssert () {
        Assert.assertEquals(columnALocation(),columnBLocation());
        return this;
    }
}
