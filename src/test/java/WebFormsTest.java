import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebFormsTest {
    @Test
    public void WebFormsTest () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.findElement(By.xpath("//select [@id = 'dropdowm-menu-1']")).click();
        driver.findElement(By.xpath("//*//select [@id = 'dropdowm-menu-1']/ option[@value = 'python']")).click();
        WebElement dropDownMenu = driver.findElement(By.xpath("//select [@id = 'dropdowm-menu-1']"));
        String getAttribute = dropDownMenu.getAttribute("value");
        if (getAttribute.equals("python")) {
            System.out.println("Here We Go! Test Passed");
        } else {
            System.out.println("Try Again");
        }

        driver.findElement(By.xpath("//*[@id = 'checkboxes']//input[@value = 'option-1']")).click();
        driver.findElement(By.xpath("//*[@id = 'checkboxes']//input[@value = 'option-2']")).click();
        driver.findElement(By.xpath("//*[@id = 'checkboxes']//input[@value = 'option-4']")).click();


        driver.findElement(By.xpath("//*//input[@value = 'yellow']")).click();
        WebElement radioButton = driver.findElement(
                By.xpath("//*//form [@id = 'radio-buttons']/input [@value = 'yellow']"));

        if (radioButton.isSelected()) {
            System.out.println("Here We Go! Test Passed");
        } else {
            System.out.println("Try Again");
        }

        driver.findElement(By.xpath("//*//select[@id= 'fruit-selects']")).click();

                                                 // შემოწმება #1
//        WebElement  orange= driver.findElement(
//                By.xpath("//*//select[@id= 'fruit-selects']/option[@value = 'orange']"));
//        String isDisabled = orange.getAttribute("disabled");
//        if (isDisabled != null) {
//            System.out.println("Here We Go! Test Passed");
//        } else {
//            System.out.println("Try Again");
//        }

                                                 // შემოწმება #2
        WebElement isDisabled1 = driver.findElement(
                By.xpath("//*//select[@id= 'fruit-selects']/option [@value = 'orange' and @disabled= 'disabled']"));
        if (isDisabled1.isDisplayed()) {
            System.out.println("Here We Go! Test Passed");
        } else {
            System.out.println("Try Again");
        }
        driver.close();
    }
}
