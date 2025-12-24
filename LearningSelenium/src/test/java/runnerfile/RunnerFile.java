package runnerfile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/featurefile/DropdownValidation.feature"},
        glue = {"stepdefinitionfile"},
        tags = "@SelectIDE"
)
public class RunnerFile {

}
