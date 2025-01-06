package StepsSelenIDE.Task7;

import ElementsForSelenIDE.Task7.FloatingMenuSelenIDEElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class FloatingMenuSelenIDSteps extends FloatingMenuSelenIDEElements {

    public FloatingMenuSelenIDSteps openURL () {
        open("https://the-internet.herokuapp.com/");
        return this;
    }

    public FloatingMenuSelenIDSteps clickFloating () {
        floating.click();
        return this;
    }

    public FloatingMenuSelenIDSteps scrollToEnd () {
        pageFooter.scrollTo();
        return this;
    }

    public FloatingMenuSelenIDSteps checkMenu () {
        getFloating.get(0).shouldHave(text("Home"));
        getFloating.get(1).shouldHave(text("News"));
        getFloating.get(2).shouldHave(text("Contact"));
        getFloating.get(3).shouldHave(text("About"));
        return this;
    }


}
