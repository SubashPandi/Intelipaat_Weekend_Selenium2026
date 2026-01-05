package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserCall {
    static WebDriver d = new ChromeDriver();
    static ChromeOptions options = new ChromeOptions();
    public static WebDriver browserInvoc()
    {
        options.addArguments("--remote-allow-origins=*");
        d.manage().window().maximize();
        d.get("https://login.salesforce.com/?locale=in");
        return d;
    }
}
