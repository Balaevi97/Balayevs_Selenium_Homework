package StepsSelenIDE.Task7;

import ElementsForSelenIDE.Task7.ToDoApplicationSelenIDEElements;
import URL.URL;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ToDoApplicationSelenIDESteps extends ToDoApplicationSelenIDEElements {
    URL url = new URL();

    public ToDoApplicationSelenIDESteps openPageOne () {
        open(url.toDoApplication);
        return this;
    }

    public ToDoApplicationSelenIDESteps clickToDo () {
        toDo.click();
        return this;
    }

    public ToDoApplicationSelenIDESteps moveToToDo () {
        switchTo().window(1);
            return this;
    }

    public ToDoApplicationSelenIDESteps addTasks (String addText) {
        inputForText.setValue(addText).sendKeys(Keys.ENTER);
        return this;
    }

    public ToDoApplicationSelenIDESteps checkAddedTask (String checkText) {
        toDoContainer.shouldHave(texts(checkText));
        return this;
    }

    public ToDoApplicationSelenIDESteps deleteTask (String textForDelete) {
        $(Selectors.byText(textForDelete)).hover();
        $(Selectors.byXpath("//*//li[text()=' დავალება 2']//i[@class='fa fa-trash']")).shouldBe(clickable).click();
        return this;
    }

    public ToDoApplicationSelenIDESteps checkDeletedTask (String text) {
        toDoContainer.find(text(text)).shouldNotBe(visible);
        return this;
    }
}
