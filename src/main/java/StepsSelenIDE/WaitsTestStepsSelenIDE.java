package StepsSelenIDE;

import ElementsForSelenIDE.WaitsTestSelenIDEElements;
import URL.URL;

import java.time.Duration;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.open;

public class WaitsTestStepsSelenIDE extends WaitsTestSelenIDEElements {
    URL url = new URL();
    public WaitsTestStepsSelenIDE openPage() {
        open(url.demoqa);
        return this;
    }

    public WaitsTestStepsSelenIDE startStopButton () {
        startStopButton.scrollIntoCenter().click();
        return this;
    }

    public WaitsTestStepsSelenIDE getText (String value) {
        hundredPercentage.shouldHave(attribute("aria-valuenow", value), Duration.ofSeconds(15));
        return this;
    }

}
