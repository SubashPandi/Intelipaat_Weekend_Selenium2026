package runnerfile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/featurefile/TableHandle.feature"},
        glue = {"stepdefinitionfile"}
        //tags = "@Smoke"
)
public class RunnerFile {

}
