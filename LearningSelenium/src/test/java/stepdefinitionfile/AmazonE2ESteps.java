package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobjects.Homepage;
import pageobjects.SignInPage;
import reusable.BrowserCall;

import java.io.IOException;

public class AmazonE2ESteps {
    @Given("Launch Browser and navigate to signInpage")
    public void launchUrl() throws IOException, InterruptedException {
        BrowserCall.browserInvoc();
        Thread.sleep(2000);
        Homepage.navigateSignInPage();
    }

    @When("Enter Username {string} and password {string}")
    public void enterUsernameAndPassword(String username, String pwd) {
        SignInPage.enterEmail(username);
        SignInPage.clickContinue();
        SignInPage.enterPwd(pwd);
        SignInPage.signIn();
    }

    @Then("Validate user able to login")
    public void validateUserAbleToLogin() {
        System.out.println("--Invalid Access---");
    }
}
