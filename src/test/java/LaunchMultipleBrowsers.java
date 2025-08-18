import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchMultipleBrowsers {

    static WebDriver driver;

    public static void main(String[] args) {

            String browser = "edge";

            switch (browser.toLowerCase().trim()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    System.out.println("Please enter the correct driver. " + browser);
                    break;
            }

            driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
            String title = driver.getTitle();
            System.out.println("The title of the page is: " + title);

            if (title.equals("Account Login"))
            {
                System.out.println("The title of page is correct ----- PASS");
            }
            else {
                System.out.println("Title of the page is wrong ----- FAIL");
            }

            String pageUrl = driver.getCurrentUrl();
            System.out.println("Current page url is: " +pageUrl);

            if (pageUrl.contains("naveenautomationlabs"))
            {
                System.out.println("The url is correct ----- PASS");
            }
            else {
                System.out.println("The url is incorrect ----- FAIL");
            }
    }

}
