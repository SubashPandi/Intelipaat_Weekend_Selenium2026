package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import reusable.BrowserCall;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EYTableExample {
    WebDriver d;

    @Given("User launch browser and navigate to the EY Wiki page")
    public void launchEYsite() throws IOException, InterruptedException {
        d = BrowserCall.browserInvoc();
    }

    @When("Extract data from table")
    public void extractDataFromTable() {

        WebElement eyTable = d.findElement(By.xpath("//table [@class ='infobox ib-company vcard']"));
        int rowSize = eyTable.findElements(By.tagName("th")).size();
        for (int i = 1; i < rowSize; i++) {
            String headervalue = eyTable.findElements(By.tagName("th")).get(i).getText();
            System.out.println(headervalue);
        }
        int columnSize = eyTable.findElements(By.tagName("td")).size();
        for (int j = 1; j < columnSize; j++) {
            String value = eyTable.findElements(By.tagName("td")).get(j).getText();
            System.out.println(value);

        }


    }

    @Then("Iterate Revenue table data")
    public void iterateRevenueTableData() {
    }
}
