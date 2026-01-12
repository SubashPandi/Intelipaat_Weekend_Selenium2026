package stepdefinitionfile;

import org.junit.After;
import org.junit.Before;
import reusable.BrowserCall;

import java.io.IOException;

public class Hooks extends BrowserCall {
    @Before()
    public void setup() throws IOException, InterruptedException {
        BrowserCall.browserInvoc();
    }

    @After()
    public void tearDown(){
      getDriver().close();
    }
}
