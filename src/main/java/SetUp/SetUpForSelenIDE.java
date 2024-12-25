package SetUp;

import com.codeborne.selenide.Configuration;

public class SetUpForSelenIDE {
    public void SetUp () {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 10000;
        Configuration.holdBrowserOpen = true;
    }

}
