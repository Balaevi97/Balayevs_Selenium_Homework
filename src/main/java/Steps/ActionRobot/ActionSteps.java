package Steps.ActionRobot;

import ElementsForSelenium.ActionRobotElements;
import URL.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class ActionSteps extends ActionRobotElements {
    WebDriver driver;
    Actions actions;
    URL url = new URL();

    public ActionSteps(WebDriver driver, Actions actions) {
        this.driver = driver;
        this.actions = actions;
    }
    public void openPageHover() {
        driver.get(url.hover);
    }

    public WebElement hoverButton () {
        return driver.findElement(hoverButton);

    }
    public void moveToElement () {
        actions.moveToElement(hoverButton()).perform();
    }

    public String getHoverButtonMessage () {
       return driver.findElement(hoverAttribute).getAttribute("aria-describedby");
    }

    public boolean getHoverButtonMessageBoolean (String Message) {
        String actualMessage = getHoverButtonMessage();
        return actualMessage.equals(Message);

    }

    public void getHoverButtonMessageAssert (String expectedMessage) {
        Assert.assertTrue(getHoverButtonMessageBoolean(expectedMessage));
    }

}
