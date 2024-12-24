package ElementsForSelenIDE;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CommandsTestSelenIDEElements {

    public SelenideElement enableButton = $(byXpath("//*[@id='input-example']/button"));
    public SelenideElement itemGetAttribute = $(byXpath("//*[@id='input-example']/input"));
    public SelenideElement buttonEnable = $(byXpath("//*[@id='input-example']//button[text()='Disable']"));
    public SelenideElement messageTextEnabled = $(byXpath("//*[@id = 'message' and text() = concat('It', \"'\", 's enabled!')]\n"));
    public SelenideElement disableButton = $(byXpath("//*[@id=\"input-example\"]/button"));
    public SelenideElement buttonDisable = $(byXpath("//*[@id='input-example']//button[text()='Enable']"));
    public SelenideElement messageTextDisabled = $(byXpath("//*[@id = 'message' and text() = concat('It', \"'\", 's disabled!')]\n"));
    public SelenideElement columnA = $(byId("column-a"));
    public SelenideElement columnB = $(byId("column-b"));

}
