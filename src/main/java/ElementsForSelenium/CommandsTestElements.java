package ElementsForSelenium;

import org.openqa.selenium.By;

public class CommandsTestElements {
    public By enableButton = By.xpath("//*[@id='input-example']/button");
    public By itemGetAttribute = By.xpath("//*[@id='input-example']/input");
    public By buttonEnable = By.xpath("//*[@id='input-example']//button[text()='Disable']");
    public By messageTextEnabled = By.xpath("//*[@id = 'message' and text() = concat('It', \"'\", 's enabled!')]\n");
    public By disableButton = By.xpath("//*[@id=\"input-example\"]/button");
    public By buttonDisable = By.xpath("//*[@id='input-example']//button[text()='Enable']");
    public By messageTextDisabled = By.xpath("//*[@id = 'message' and text() = concat('It', \"'\", 's disabled!')]\n");
    public By columnA = By.id("column-a");
    public By columnB = By.id("column-b");


}
