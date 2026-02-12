package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import pageobjects.Homepage;
import pageobjects.SearchResultPage;
import pageobjects.SignInPage;
import reusable.BrowserCall;
import reusable.ReadExcel;

import java.io.IOException;

public class AmazonE2ESteps {
    private String userSearchData = null;

    @Given("Launch Browser and navigate to signInpage")
    public void launchUrl() throws IOException, InterruptedException {
        //BrowserCall.browserInvoc();
        // Thread.sleep(4000);
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
        String ExpectedErrormsg = "Your password is incorrect";
        String ActaulErrormsg = SignInPage.getErrorMessage();
        Assert.assertEquals(ExpectedErrormsg, ActaulErrormsg);
    }

    @Given("User search the specific product in search box as product")
    public void lunchHomepage() throws IOException, InterruptedException, InvalidFormatException {
        //BrowserCall.browserInvoc();
        Homepage.searchKeyword(ReadExcel.fetchFile("product", 1, 0));
        Homepage.clickSearchButton();
    }

    @Then("Validate should display for the search result")
    public void validateSearchResult() {
        //String expectedsearchresult="Amazon.in : Electric cooker";
        switch (userSearchData.toLowerCase()) {
            case "electric cooker":
                Assert.assertEquals("Amazon.in : Electric cooker", SearchResultPage.getSearchTitle());
                break;
            case "iphone":
                Assert.assertEquals("Amazon.in : iphone", SearchResultPage.getSearchTitle());
                break;
            default:
                throw new InvalidArgumentException("--Invalid Data---");

        }


    }

    @Given("User search the specific product in search box as product {string}")
    public void userSearchTheSpecificProductInSearchBoxAsProduct(String product) throws InterruptedException {
        userSearchData = product;
        Homepage.searchKeyword(product);
        Homepage.clickSearchButton();

    }

    @Then("Validate should display for the search result {string}")
    public void validateShouldDisplayForTheSearchResult(String ExpectedResult) {
        Assert.assertEquals(ExpectedResult, SearchResultPage.getSearchTitle());
    }

}
