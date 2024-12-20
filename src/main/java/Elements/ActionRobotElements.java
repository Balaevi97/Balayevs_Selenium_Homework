package Elements;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

public class ActionRobotElements {

    public By hoverButton = By.id("toolTipButton");
    public By hoverAttribute = By.xpath("//*//button [@id = 'toolTipButton' and @aria-describedby = 'buttonToolTip']");
    public By searchBox = By.id("APjFqb");
    public String text = "Selenium Robot Class example";


}
