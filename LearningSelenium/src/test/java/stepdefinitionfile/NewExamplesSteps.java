package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.Homepage;
import reusable.BrowserCall;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Set;

public class NewExamplesSteps extends BrowserCall {
    private static final Logger logger = LogManager.getLogger(NewExamplesSteps.class);
    public static void searchAutoDropDown(){
        //getDriver().findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div/div[1]/div/div/input"))
    }
    @Given("User Mouse hover and select babies wish list")
    public static void mouseHoverBabyList(){
        Homepage.hoverMouse();
    }

    @Then("User select Baby wish List")
    public void userSelectBabyWishList() {
        Homepage.babyList();
    }

    @When("Switch to Frame")
    public void switchToFrame() {
        getDriver().switchTo().frame(getDriver().findElement(By.className("demo-frame")));
    }

    @Then("Drag and Drop the file")
    public void dragAndDropTheFile() {
        WebElement draggable = getDriver().findElement(By.id("draggable"));
        WebElement droppable = getDriver().findElement(By.id("droppable"));
        Actions DD= new Actions(getDriver());
        DD.dragAndDrop(draggable,droppable);
        getDriver().switchTo().defaultContent();
    }

    @Given("Open multiple windows")
    public void openMultipleWindows() {

        WebElement getToKnow = getDriver().findElement(By.cssSelector(".navFooterLinkCol.navAccessibility"));
        int tagSize = getToKnow.findElements(By.tagName("a")).size();
        for(int i=0;i<tagSize;i++){
            String chord = Keys.chord(Keys.CONTROL, Keys.ENTER);
            WebElement getToKnowElements =getToKnow.findElements(By.tagName("a")).get(i);
            getToKnowElements.sendKeys(chord);
        }
    }

    @Then("Switch to windows")
    public void switchToWindows() {
        Set<String> windowHandles = getDriver().getWindowHandles();
        for(String h:windowHandles){
            String title = getDriver().switchTo().window(h).getTitle();
            //System.out.println(title);
            logger.info(title);
            if (title.equalsIgnoreCase("About Amazon India - About Amazon India"))
            {
                getDriver().findElement(By.className("Page-header-search-input")).sendKeys("Sample");
                break;
            }
                getDriver().switchTo().defaultContent();
        }
    }
}
