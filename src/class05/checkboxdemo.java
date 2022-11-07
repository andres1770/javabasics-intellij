package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxdemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        // go to syntax project /checkbox demo
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        // find the checkbox
        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
        // click on it
        checkBox.click();

    }
}