package Steps.ActionRobot;

import Elements.ActionRobotElements;
import URL.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class TableSteps extends ActionRobotElements {
    WebDriver driver;

    URL url = new URL();

    public TableSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void openPageHerokuApp () {
        driver.get(url.herokuApp);
    }

    public boolean printTable () {
        boolean isFrankFound = false;
        for (int tableRows = 1; tableRows <= 4; tableRows ++) {
            for (int tableColumns : new int[]{2, 4}) {
                String data = driver.findElement(By.xpath
                        ("//*//table [@id = 'table1']/tbody/tr[" + tableRows + "]/td["+tableColumns+"]")).getText();
                System.out.println("მონაცემი " + data);
                if (data.equals("Frank")) {
                    isFrankFound = true;
                }
            }
        }
        return isFrankFound;
    }

    public void tableAssert () {
        Assert.assertTrue(printTable());
    }


}
