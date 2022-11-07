import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingbrowser {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        //use the get() function to open up required website
        driver.get("https://www.google.com/");
        // get the url from website\
        String url = driver.getCurrentUrl();
        //print the url
        System.out.println(url);
        // get title
        String title = driver.getTitle();
        //print the title
        System.out.println(title);
        // close the chrome
        driver.quit();

    }
}