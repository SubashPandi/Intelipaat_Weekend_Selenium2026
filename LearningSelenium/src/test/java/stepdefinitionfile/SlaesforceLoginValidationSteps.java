package stepdefinitionfile;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SlaesforceLoginValidationSteps {
    WebDriver d = new ChromeDriver();
    ChromeOptions options = new ChromeOptions();

    @Given("User launch browser and navigate to the login page")
    public void launchURL() {
        options.addArguments("--remote-allow-origins=*");
        d.manage().window().maximize();
        d.get("https://login.salesforce.com/?locale=in");
    }

    @When("User enter valid username {string} and valid password {string}")
    public void enterUsernameandPwd(String username, String password) {
        d.findElement(By.id("username")).sendKeys(username);
        //Absolute Xpath
        //d.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(username);
        //Class name
        //d.findElement(By.className("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys(username);
        d.findElement(By.name("pw")).sendKeys(password);
    }

    @And("User click login button")
    public void ClickLoginButton() {
        d.findElement(By.id("Login")).click();
    }

    @Then("User navigate to Salesforce HomePage")
    public void NavigateToSalesforceHomePage() {
        System.out.println("Login Success");
        d.close();
    }

    @When("User enter invalid username {string} and invalid password {string}")
    public void EnterInvalidUsernameAndInvalidPassword(String username, String password) {
        d.findElement(By.id("username")).sendKeys(username);
        d.findElement(By.name("pw")).sendKeys(password);

    }

    @Then("Validate error message")
    public void validateErrorMessage() {
        String ActualResult = d.findElement(By.id("error")).getText();
        String ExpectedResult = "Error: Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        if (ExpectedResult.equals(ActualResult)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        d.close();
    }

}
