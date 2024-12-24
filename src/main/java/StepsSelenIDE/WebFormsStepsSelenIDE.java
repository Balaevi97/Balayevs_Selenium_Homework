package StepsSelenIDE;

import ElementsForSelenIDE.WebFormsSelenIDEElements;
import URL.URL;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.selected;
import static com.codeborne.selenide.Selenide.open;

public class WebFormsStepsSelenIDE extends WebFormsSelenIDEElements {
    URL url = new URL();

    public void openPage() {
        open(url.webdriveruniversity);
    }

    public void selectPython () {
        dropdownMenu.selectOptionByValue("python");
        python.shouldHave(selected);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void checkbox () {
        checkbox.forEach(elem -> {
            if (!elem.isSelected()) {
                elem.click();
            }
        });
    }

    public void yellowButtonClick () {
        radioButtons.forEach(elem -> {
            if (elem.getAttribute("value").equals("yellow")) {
                elem.selectRadio("yellow");
            }
        });
        yellowCheck.shouldBe(selected);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void disabledOrange () {
        disabledOrange.shouldBe(disabled);
    }

}