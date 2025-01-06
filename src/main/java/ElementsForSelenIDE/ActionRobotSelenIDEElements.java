package ElementsForSelenIDE;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ActionRobotSelenIDEElements {

    public SelenideElement hoverButton =  $(byId("toolTipButton"));


    public SelenideElement searchBox = $(byId("APjFqb"));
    public String text = "Selenium Robot Class example";

    public ElementsCollection table = $$(byXpath("//table[@id='table1']/tbody/tr/td[position()=2 or position()=4]"));
}
