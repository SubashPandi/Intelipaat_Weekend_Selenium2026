package runnerfile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/featurefile/AmazonE2ETest.feature"},
        glue = {"stepdefinitionfile"},
        tags = "@TCID002",
        plugin = {"pretty",
        "html:target/htmlreport.html",
         "json:target/Jsonreport.json",
          "junit:target/Xmlreport.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunnerFile {

}
