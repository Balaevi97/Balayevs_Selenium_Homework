package ElementsForSelenIDE.Task7;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DynamicContentSelenIDEElements {

    public SelenideElement dynamicContent= $(byXpath("//*//a [text() = 'Dynamic Content']"));
    public SelenideElement clickForRefresh = $(byXpath("//*//a [text()='click here']"));
    public SelenideElement firstPicture = $(byXpath("(//*//div[@id='content']/div[@class='row']/div/img)[1]"));
    public SelenideElement secondPicture = $(byXpath("(//*//div[@id='content']/div[@class='row']/div/img)[2]"));
    public SelenideElement thirdPicture = $(byXpath("(//*//div[@id='content']/div[@class='row']/div/img)[3]"));
    public SelenideElement firstText = $(byXpath(("(//*//div[@id='content']/div[@class='row']/div [@class='large-10 columns'])[1]")));
    public SelenideElement secondText = $(byXpath(("(//*//div[@id='content']/div[@class='row']/div [@class='large-10 columns'])[2]")));
    public SelenideElement thirdText = $(byXpath(("(//*//div[@id='content']/div[@class='row']/div [@class='large-10 columns'])[3]")));




}
