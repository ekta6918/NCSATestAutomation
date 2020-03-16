package stepdefs;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import util.Browser;

public class Hooks {


    @Before
    public void beforeHook() {

        Browser.launch("https://github.com/rails");

    }


    @After
    public void afterHook(Scenario scenario) {

        if(scenario.isFailed()) {
            System.out.println("Scenario is failed :"+ scenario.getName());
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) Browser.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }

        Browser.close();

    }

}
