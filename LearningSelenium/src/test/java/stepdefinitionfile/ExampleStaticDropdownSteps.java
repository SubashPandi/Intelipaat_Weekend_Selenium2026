package stepdefinitionfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ExampleStaticDropdownSteps {

    WebDriver driver = new ChromeDriver();
    WebElement staticIDEElement;
    ChromeOptions options = new ChromeOptions();

    @Given("User launch Example url navigate to currency Dropdown")
    public void exampleStaticDropdown()
    {
        options.addArguments("--remote-allow-origins=*");
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
    }

    @When("Select any of one course name")
    public void selectAnyOfOneCourseName() {
        WebElement staticCourseElement = driver.findElement(By.xpath("//select[@id='course']"));
        Select selectCoursedropdown = new Select(staticCourseElement);

        //selectCoursedropdown.selectByIndex(2);
        selectCoursedropdown.selectByValue("net");
        //selectCoursedropdown.selectByVisibleText("Python");
    }

    @When("Select any of one IDE")
    public void selectAnyOfOneIDE() {
        staticIDEElement = driver.findElement(By.xpath("//select[@id='ide']"));
        Select selectIDEdropdown = new Select(staticIDEElement);
        selectIDEdropdown.selectByValue("ij");

    }

    @And("Get count of values in dropdown")
    public void getCountOfValuesInDropdown() {

        int optioncount = staticIDEElement.findElements(By.tagName("option")).size();

        for(int i=0;i<optioncount;i++){
            String optionvalue = staticIDEElement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(optionvalue);
            System.out.println("--Completed--");
        }
    }
}
