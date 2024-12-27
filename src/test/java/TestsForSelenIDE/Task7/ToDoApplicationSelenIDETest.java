package TestsForSelenIDE.Task7;

import StepsSelenIDE.Task7.ToDoApplicationSelenIDESteps;
import org.testng.annotations.Test;

public class ToDoApplicationSelenIDETest {
    ToDoApplicationSelenIDESteps toDoApplicationSelenIDESteps = new ToDoApplicationSelenIDESteps();

    @Test
    public void toDoApplication () throws InterruptedException {
        toDoApplicationSelenIDESteps.openPageOne()
                                    .clickToDo()
                                    .moveToToDo()
                                    .addTasks("დავალება 1")
                                    .checkAddedTask("დავალება 1")
                                    .addTasks("დავალება 2")
                                    .checkAddedTask("დავალება 2")
                                    .addTasks("დავალება 3")
                                    .checkAddedTask("დავალება 3")
                                    .deleteTask("დავალება 2")
                                    .checkDeletedTask("დავალება 2");

    }

}
