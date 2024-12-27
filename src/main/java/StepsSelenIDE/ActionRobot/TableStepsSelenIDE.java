package StepsSelenIDE.ActionRobot;

import ElementsForSelenIDE.ActionRobotSelenIDEElements;
import URL.URL;

import static com.codeborne.selenide.Selenide.open;

public class TableStepsSelenIDE extends ActionRobotSelenIDEElements {
    URL url = new URL();

    public void tableLink () {
        open(url.tableLink);
    }

    public boolean tables () {
        boolean isFrankFound = false;
        for (var cell : table) {
            String data = cell.getText();
            System.out.println("მონაცემები: " + data);

            if (data.equals("Frank")) {
                isFrankFound = true;
            }
        }
        return isFrankFound;
    }
}
