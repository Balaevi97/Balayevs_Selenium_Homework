package StepsSelenIDE;

import ElementsForSelenIDE.WaitsTestSelenIDEElements;
import URL.URL;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;

public class WaitsTestStepsSelenIDe extends WaitsTestSelenIDEElements {
    WebDriver driver;
    URL url = new URL();

    public WaitsTestStepsSelenIDe(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(url.demoqa);
    }

    public void startStopButton () {
        startStopButton.click();
    }

    public void getText (String value) {
        hundredPercentage.shouldHave(text("100%"), Duration.ofSeconds(15));
        hundredPercentage.shouldHave(attribute("aria-valuenow", value));
    }

}
