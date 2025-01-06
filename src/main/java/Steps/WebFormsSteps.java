package Steps;

import ElementsForSelenium.WebFormsElements;
import URL.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class WebFormsSteps extends WebFormsElements {
    WebDriver driver;
    URL url = new URL();
    public WebFormsSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(url.webdriveruniversity);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void dropdownMenu () {
        driver.findElement(dropdownMenu).click();
    }

    public void python () {
        driver.findElement(python).click();
    }
    public String getString () {
        return   driver.findElement(dropdownMenu).getAttribute("value");

    }

    public void assertPython () {
        Assert.assertEquals("python",getString ());
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void checkboxe () {
        List<WebElement> checkboxLocator = driver.findElements(checkbox);
        for (WebElement checkboxes : checkboxLocator) {
            if (checkboxes.getAttribute("checked") == null) {
                checkboxes.click();
            }
        }
    }

    public void yellowButtonClick () {
        driver.findElement(yellowCheck).click();
    }


    public String getYellowString () {
        return driver.findElement(yellowCheck).getAttribute("value");
    }

    public void getYellowAssert () {
        Assert.assertEquals(getYellowString(), "yellow");
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void fruitsMenu () {
        driver.findElement(fruitsMenu).click();
    }

    public String getAttributeDisabled () {
        return driver.findElement(disabledOrange).getAttribute("disabled");
    }

    public void disabledOrange () {
        Assert.assertEquals("true", getAttributeDisabled());
    }

}
