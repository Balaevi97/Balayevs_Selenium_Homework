import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PageScroll {



    @Test
    public void scrollThreeTimes () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        Thread.sleep(1000);
        Long topScrollBar = (Long)js.executeScript("return document.documentElement.scrollTop");

        js.executeScript("window.scrollBy(0, 500)");
        Double firstScrollLocation = (Double) js.executeScript("return window.scrollY;");
        Assert.assertNotSame(topScrollBar, firstScrollLocation);

        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0, 500)");
        Double secondScrollLocation = (Double) js.executeScript("return window.scrollY;");
        Assert.assertNotSame(secondScrollLocation, topScrollBar );
        Assert.assertNotSame(secondScrollLocation, firstScrollLocation);

        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0, 500)");
        Double thirdScrollLocation = (Double) js.executeScript("return window.scrollY;");
        Assert.assertNotSame(thirdScrollLocation, topScrollBar);
        Assert.assertNotSame(thirdScrollLocation, firstScrollLocation);
        Assert.assertNotSame(thirdScrollLocation, secondScrollLocation);
        driver.close();
    }

    @Test
    public void submit () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://demoqa.com/text-box");
        WebElement submit = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].scrollIntoView(true);", submit);
        boolean submitIsDisplayed = submit.isDisplayed();
        Assert.assertTrue(String.valueOf(true), submitIsDisplayed);
        driver.close();
    }
    @Test
    public void scrollHeight () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://demoqa.com/text-box");
        js.executeScript("window.scrollTo(0, document.documentElement.scrollHeight)");
        WebElement element = driver.findElement(By.xpath("//footer/span[text() = '© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.']"));
        Assert.assertTrue(element.isDisplayed());

        driver.close();
    }

}
