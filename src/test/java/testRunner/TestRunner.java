package testRunner;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
              ( features= ".//Features/Login.feature",
                glue= "stepDefinitions",
                dryRun=false,
                monochrome=true,
                plugin= {"pretty","html:test-output"}
              )

public class TestRunner {

}
