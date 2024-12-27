package TestsForSelenIDE.Task7;

import StepsSelenIDE.Task7.DataTableSelenIDESteps;
import org.testng.annotations.Test;

public class DataTableSelenIDETest {
    DataTableSelenIDESteps dataTableSelenIDESteps = new DataTableSelenIDESteps();

    @Test
    public void Table () {
        dataTableSelenIDESteps.openURL();
        dataTableSelenIDESteps.openFloating();
        dataTableSelenIDESteps.findEmail("jdoe@hotmail.com");
        dataTableSelenIDESteps.orderFullTable("Frank");
    }
}
