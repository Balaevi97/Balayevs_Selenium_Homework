package ElementsForSelenIDE.Task7;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DataTableSelenIDEElements {

    public SelenideElement floating = $(byXpath("//*//a [text() = 'Sortable Data Tables']"));
    public SelenideElement lastName = $(byXpath("//*//table [@id='table2']//tbody//td [contains (text(), 'Doe')]"));
    public ElementsCollection fullTable = $$(byXpath("//table[@id='table2']//td[@class='first-name']"));

}
