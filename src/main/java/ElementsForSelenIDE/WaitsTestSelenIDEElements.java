package ElementsForSelenIDE;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class WaitsTestSelenIDEElements {

    public SelenideElement startStopButton = $(byXpath("//button [@id = 'startStopButton']"));
    public SelenideElement hundredPercentage = $(byXpath("//*[@id='progressBar']/div"));

}
