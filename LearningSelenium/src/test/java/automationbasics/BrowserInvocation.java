package automationbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserInvocation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        d.manage().window().maximize();
        d.get("https://login.salesforce.com/?locale=in");
        d.findElement(By.id("username")).sendKeys("Testuser");
        d.findElement(By.name("pw")).sendKeys("Test@123");
        d.findElement(By.id("Login")).click();
        //Thread.sleep(10000);
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

