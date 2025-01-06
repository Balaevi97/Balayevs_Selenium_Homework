package Steps;
import ElementsForSelenium.CommandsTestElements;
import URL.URL;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class CommandsTestSteps extends CommandsTestElements {
    WebDriver driver;
    URL url = new URL();
    public CommandsTestSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(url.dynamic_controls);
    }

    public void enableButton () {
        driver.findElement(enableButton).click();
    }

    public void textField (String text) {

        driver.findElement(itemGetAttribute).sendKeys(text);
    }

    public String itemGetAttribute () {

        return driver.findElement(itemGetAttribute).getAttribute("disabled");
    }

    public void enableItemArray () {
        Assert.assertNull(itemGetAttribute() );
    }
    public String  getButtonTextEnable () {
        return driver.findElement(buttonEnable).getText();

    }

    public void buttonNameEnable () {
        Assert.assertEquals(getButtonTextEnable(), "Disable");
    }

    public String getMessageTextEnabled () {
       return driver.findElement(messageTextEnabled).getText();
    }

    public void messageTextEnabledAssert () {
        Assert.assertEquals(getMessageTextEnabled(), "It's enabled!");
    }

    public void clearTextbox () {
        driver.findElement(itemGetAttribute).clear();
    }

    public void disableButton () {
        driver.findElement(disableButton).click();
    }

    public void disableItemArray () {

        Assert.assertEquals("true", itemGetAttribute());
    }

    public String  buttonDisable () {
        return driver.findElement(buttonDisable).getText();

    }

    public void buttonDisableAssert () {
        Assert.assertEquals(buttonDisable(), "Enable");
    }

    public String getMessageTextDisabled () {
        return driver.findElement(messageTextDisabled).getText();
    }

    public void messageTextDisabledAssert () {
        Assert.assertEquals(getMessageTextDisabled(), "It's disabled!");
    }

    public int columnALocation () {
        return driver.findElement(columnA).getLocation().y;
    }

    public int columnBLocation () {
       return driver.findElement(columnB).getLocation().y;
    }

    public void columnAssert () {
        Assert.assertEquals(columnALocation(),columnBLocation());
    }
}
