package StepsSelenIDE;

import ElementsForSelenIDE.CommandsTestSelenIDEElements;
import URL.URL;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.not;


public class CommandsTestStepsSelenIDE extends CommandsTestSelenIDEElements {
    WebDriver driver;
    URL url = new URL();
    public CommandsTestStepsSelenIDE (WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(url.dynamic_controls);
    }

    public void enableButton () {
        enableButton.click();
    }

    public void textField (String text) {
        itemGetAttribute.sendKeys(text);
    }

    public void itemGetAttribute () {
         itemGetAttribute.shouldHave(attribute("disabled"), not(null));
    }

//    public void enableItemArray () {
//        Assert.assertNull(itemGetAttribute() );
//    }
    public void   getButtonTextEnable () {
        // buttonEnable.getText();
        buttonEnable.getText().equals("Disable");
    }

//    public void buttonNameEnable () {
//        Assert.assertEquals(getButtonTextEnable(), "Disable");
//    }

    public void getMessageTextEnabled () {
         messageTextEnabled.getText();
        messageTextEnabled.getText().equals("It's enabled!");
    }

//    public void messageTextEnabledAssert () {
//        Assert.assertEquals(getMessageTextEnabled(), "It's enabled!");
//    }

    public void clearTextbox () {
        itemGetAttribute.clear();
    }

    public void disableButton () {
        disableButton.click();
    }

//    public void disableItemArray () {
//        Assert.assertEquals("true", itemGetAttribute());
//    }

    public void   buttonDisable () {
        // buttonDisable.getText();
        buttonDisable.getText().equals("Enable");
    }

//    public void buttonDisableAssert () {
//        Assert.assertEquals(buttonDisable(), "Enable");
//    }

    public void getMessageTextDisabled () {
        //return messageTextDisabled.getText();
        messageTextDisabled.getText().equals("It's disabled!");
    }

//    public void messageTextDisabledAssert () {
//        Assert.assertEquals(getMessageTextDisabled(), "It's disabled!");
//    }

    public int columnALocation () {
        return columnA.getLocation().y;
    }

    public int columnBLocation () {
        return columnB.getLocation().y;
    }

    public void columnAssert () {
        Assert.assertEquals(columnALocation(),columnBLocation());
    }
}
