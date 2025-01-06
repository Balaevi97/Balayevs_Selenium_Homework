package ElementsForSelenIDE;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebFormsSelenIDEElements {

    public SelenideElement dropdownMenu = $(byXpath("//select [@id = 'dropdowm-menu-1']"));
    public SelenideElement python = $(byXpath("//option[@value = 'python']"));
    public ElementsCollection checkbox = $$(byXpath("//*[@id = 'checkboxes']//input"));
    public ElementsCollection radioButtons = $$(byXpath("//*//form[@id= 'radio-buttons']//input"));
    public SelenideElement yellowCheck = $(byXpath("//*//form[@id= 'radio-buttons']//input[@value='yellow']"));
    public SelenideElement disabledOrange = $(byXpath("//*//select[@id= 'fruit-selects']/option [@value = 'orange']"));

}
