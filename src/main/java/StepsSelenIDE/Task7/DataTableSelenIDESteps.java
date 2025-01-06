package StepsSelenIDE.Task7;

import ElementsForSelenIDE.Task7.DataTableSelenIDEElements;
import URL.URL;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class DataTableSelenIDESteps extends DataTableSelenIDEElements {
    URL url = new URL();

    public void openURL () {
        open(url.dynamicContent);
    }

    public DataTableSelenIDESteps openFloating () {
        floating.click();
        return this;
    }

    public DataTableSelenIDESteps findEmail (String matchEmail) {
        lastName.sibling(1).shouldHave(text(matchEmail));
        return this;
    }

    public DataTableSelenIDESteps orderFullTable (String matchFirstItem) {
        boolean isFirstFrank = fullTable.texts()
                                        .stream()
                                        .sorted()
                                        .findFirst()
                                        .orElse("")
                                        .equals(matchFirstItem);
                                        Assert.assertTrue(isFirstFrank);
        return this;
    }


}
