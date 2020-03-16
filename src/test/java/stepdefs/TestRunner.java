package stepdefs;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue= {"stepdefs"},plugin = {"pretty","html:output/report"})
public class TestRunner {


}
