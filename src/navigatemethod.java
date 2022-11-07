import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatemethod {
    public static void main(String[] args) throws InterruptedException {
        //go to google.com
        //go to fb.com
        //go back to google.com
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        //create web browser instance
        WebDriver driver=new ChromeDriver();
        //go to google.com
        driver.get("https://www.google/com");
        //go to fb.com
        driver.navigate().to("https://www.facebook.com/");
        //introduce some sleep
        Thread.sleep(2000);
        //go back to google.com
        driver.navigate().back();
        //introduce some sleep
        Thread.sleep(2000);
        // go back to fb.com
        driver.navigate().forward();
        //introduce some sleep
        Thread.sleep(2000);
        // refresh page
        driver.navigate().refresh();
        // quit
        driver.quit();
    }
}
