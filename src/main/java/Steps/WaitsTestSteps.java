package Steps;
import ElementsForSelenium.WaitsTestElements;
import URL.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class WaitsTestSteps extends WaitsTestElements {
  WebDriver driver;
    URL url = new URL();
    public WaitsTestSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(url.demoqa);
    }
    public void startStopButton () {
        driver.findElement(startStopButton).click();
    }

    public String getText () {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.textToBe(hundredPercentage, "100%"));
         return  driver.findElement(hundredPercentage).getDomAttribute("aria-valuenow");
    }
    public void AssertVolumeValue (String value) {
        Assert.assertEquals(value,getText());
    }
}
