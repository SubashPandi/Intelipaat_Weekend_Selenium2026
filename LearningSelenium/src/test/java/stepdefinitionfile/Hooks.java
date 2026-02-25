package stepdefinitionfile;

import io.cucumber.java.Scenario;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pageobjects.Homepage;
import reusable.BrowserCall;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Hooks extends BrowserCall {
    private static final Logger logger = LogManager.getLogger(Hooks.class);
    @Before(order = 1)
    public void setup() throws IOException, InterruptedException {
        System.out.println("Thread ID in Before: " + Thread.currentThread().getId());
        logger.info("Thread ID in Before: {}", Thread.currentThread().getId());
        BrowserCall.browserInvoc();
        System.out.println("Driver after setup: " + BrowserCall.getDriver());
    }

    @Before(order = 0, value = "@TCID001")
    public void specificHooks() {
        System.out.println("--Scenario specific hook--");
    }

    @After()
    public void tearDown() {
        getDriver().close();
    }

    @BeforeStep()
    public void m1() {
        System.out.println("----Before step----");
    }

    @AfterStep()
    public void takeScrenshot(Scenario sc) {
        byte[] b = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        sc.attach(b, "image/png", sc.getName());
    }
}
