import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizewindow {
    public static void main(String[] args) {
        // go to google.com
        //maximize ur window
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //create a web driver instance
        WebDriver driver=new ChromeDriver();
        //go to google.com
        driver.get("https://www.google.com/");
        //maximize
        driver.manage().window().maximize();
        //fullscreen
        //driver.manage().window().fullscreen();
        //quit
        driver.quit();
    }
}
