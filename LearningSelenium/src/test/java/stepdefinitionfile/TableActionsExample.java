package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import reusable.BrowserCall;

import java.io.IOException;

public class TableActionsExample {
    WebDriver d;

    @Given("User launch table actions practice url")
    public void launchTableTestPage() throws IOException, InterruptedException {
        d = BrowserCall.browserInvoc();
    }

    @Then("Table hearders should be displayed")
    public void tableHeardersShouldBeDisplayed() {
        System.out.println("Header is displayed");

    }

    @When("I check if header is present in the  table")
    public void iCheckIfHeaderIsPresentInTheTable() {
        String Headername[] = {"#", "Task", "Assignee", "Status"};
        for (String a : Headername) {
            WebElement tableHeader = d.findElement(By.xpath("//table[@id='task-table']/thead/tr//th[text()='" + Headername + "']"));
            Assert.assertTrue("Header is not Displayed", tableHeader.isDisplayed());
        }

    }
}
