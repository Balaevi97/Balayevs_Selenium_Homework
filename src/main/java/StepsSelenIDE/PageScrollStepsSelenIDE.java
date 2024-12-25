package StepsSelenIDE;

import ElementsForSelenIDE.PageScrollSelenIDEElements;
import URL.URL;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;

public class PageScrollStepsSelenIDE extends PageScrollSelenIDEElements {
    URL url = new URL();

    public void openPage() {
        open(url.scrollURL);
    }

    public void openSecondPage() {
        open(url.scrollToSubmit);
    }

    public Object getTopScrollBar () {
        return    executeJavaScript("return document.documentElement.scrollTop");
    }

    public void scrollDown () {
        executeJavaScript("window.scrollBy(0, 500)");
    }

    public Object firstScrollLocation () {
        return executeJavaScript("return window.scrollY;");
    }

    public void firstAssert () {
        Assert.assertNotSame(firstScrollLocation(), getTopScrollBar());
    }

    public Object secondScrollLocation () {
        return executeJavaScript("return window.scrollY;");
    }

    public void secondAssert () {
        Assert.assertNotSame(secondScrollLocation(), getTopScrollBar());
        Assert.assertNotSame(secondScrollLocation(), firstScrollLocation());
    }

    public Object thirdScrollLocation () {
        return  executeJavaScript("return window.scrollY;");
    }

    public void thirdAssert () {
        Assert.assertNotSame(thirdScrollLocation(), getTopScrollBar());
        Assert.assertNotSame(thirdScrollLocation(), firstScrollLocation());
        Assert.assertNotSame(thirdScrollLocation(), secondScrollLocation());
    }

    //////////////////////////////////////////////////////////////////////////

    public WebElement getSubmitButton () {
        return submitButton;
    }

    public void scrollToSubmitButton () {
        executeJavaScript("arguments[0].scrollIntoView(true);", getSubmitButton());
    }

    public void getSubmitButtonAssert () {
        Assert.assertTrue(getSubmitButton().isDisplayed());
        Assert.assertTrue(getSubmitButton().isDisplayed());
    }
///////////////////////////////////////////////////////////////////////////////

    public void scrollToEnd () {
        executeJavaScript("window.scrollTo(0, document.documentElement.scrollHeight)");
    }

    public  WebElement scrollToBottomElement () {
        return bottomElement;
    }

    public void bottomElementAsset () {
        Assert.assertTrue(scrollToBottomElement().isDisplayed());
    }
}
