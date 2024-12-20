package Elements;

import org.openqa.selenium.By;

public class WebFormsElements {

    public By dropdownMenu = By.xpath("//select [@id = 'dropdowm-menu-1']");
    public By python = By.xpath("//*//select [@id = 'dropdowm-menu-1']/ option[@value = 'python']");
    public By checkboxe = By.xpath("//*[@id = 'checkboxes']//input");
    public By yellowCheck = By.xpath("//*//input[@value = 'yellow']");
    public By fruitsMenu = By.xpath("//*//select[@id= 'fruit-selects']");
    public By disabledOrange = By.xpath("//*//select[@id= 'fruit-selects']/option [@value = 'orange']");

}
