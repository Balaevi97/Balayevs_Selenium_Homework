package StepsSelenIDE;

import ElementsForSelenIDE.PageScrollSelenIDEElements;
import URL.URL;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageScrollStepsSelenIDE extends PageScrollSelenIDEElements {
    WebDriver driver;
    JavascriptExecutor js;
    URL url = new URL();

    public PageScrollStepsSelenIDE (WebDriver driver, JavascriptExecutor js) {
        this.driver = driver;
        this.js = js;
    }

    public void openPage() {
        driver.get(url.scrollURL);
    }

    public void openSecondPage() {
        driver.get(url.scrollToSubmit);
    }


    public Object getTopScrollBar () {
        return    js.executeScript("return document.documentElement.scrollTop");
    }

    public void ScrollDown () {
        js.executeScript("window.scrollBy(0, 500)");
    }

    public Object firstScrollLocation () {
        return js.executeScript("return window.scrollY;");
    }

    public void firstAssert () {

        Assert.assertNotSame(firstScrollLocation(), getTopScrollBar());
    }

    public Object secondScrollLocation () {
        return js.executeScript("return window.scrollY;");
    }

    public void secondAssert () {

        Assert.assertNotSame(secondScrollLocation(), getTopScrollBar());
        Assert.assertNotSame(secondScrollLocation(), firstScrollLocation());
    }

    public Object thirdScrollLocation () {
        return  js.executeScript("return window.scrollY;");
    }

    public void thirdAssert () {
        Assert.assertNotSame(thirdScrollLocation(), getTopScrollBar());
        Assert.assertNotSame(thirdScrollLocation(), firstScrollLocation());
        Assert.assertNotSame(thirdScrollLocation(), secondScrollLocation());
    }

    public WebElement getSubmitButton () {
        return submitButton;

    }

    public void scrollToSubmitButton () {
        js.executeScript("arguments[0].scrollIntoView(true);", getSubmitButton());
    }

    public void getSubmitButtonAssert () {
        Assert.assertTrue(getSubmitButton().isDisplayed());
        Assert.assertTrue(getSubmitButton().isDisplayed());
    }

    public void scrollToEnd () {
        js.executeScript("window.scrollTo(0, document.documentElement.scrollHeight)");
    }

    public  WebElement scrollToBottomElement () {
        return bottomElement;
    }

    public void bottomElementAsset () {
        Assert.assertTrue(scrollToBottomElement().isDisplayed());
    }
}
