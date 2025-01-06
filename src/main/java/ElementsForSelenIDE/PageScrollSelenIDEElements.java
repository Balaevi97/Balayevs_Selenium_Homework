package ElementsForSelenIDE;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PageScrollSelenIDEElements {

    public SelenideElement submitButton = $(byId("submit"));
    public SelenideElement bottomElement = $(byXpath("//footer/span[text() = '© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.']"));

}
