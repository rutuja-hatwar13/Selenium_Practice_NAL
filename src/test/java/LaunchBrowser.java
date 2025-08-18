import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

    public static void main(String[] args) {

//        WebDriver driver = new ChromeDriver();
//        driver = new ChromeDriver();
//
//        WebDriver driver1 = new FirefoxDriver();
//
//        driver.get("https://www.google.com");
//        driver1.get("https://www.amazon.com");
//
//        driver.quit();
//        driver1.quit();

        //case1 : quit:

        // 1. Open browser: chrome
        WebDriver driver = new ChromeDriver();//sid=123

        // 2. enter the url
        driver.get("https://www.google.com");//sid=123

        // 3. get the page title
        String title = driver.getTitle();//sid=123
        System.out.println("page title : " + title);//Google,

        //4.
        String url = driver.getCurrentUrl();//sid=123
        System.out.println("page url : " + url);

        //5.
        //driver.quit();// close browser:  //sid=123
        driver.close();//close browser: sid=123

    }
}
