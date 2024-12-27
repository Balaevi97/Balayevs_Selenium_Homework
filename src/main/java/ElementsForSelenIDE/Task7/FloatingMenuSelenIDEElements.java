package ElementsForSelenIDE.Task7;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FloatingMenuSelenIDEElements {

    public SelenideElement floating= $(byXpath("//*//a [text() = 'Floating Menu']"));
    public SelenideElement pageFooter = $(byId("page-footer"));
    public ElementsCollection getFloating = $$(byXpath("//*//li // a "));

}
