package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        // go to syntax project /checkbox demo
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        // find the checkBoxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='color']"));
// what does this list contains?
        //it contains all the web elements
        for( WebElement checkBx:checkboxes){
          String color =checkBx.getAttribute("value");
            if(color.equalsIgnoreCase("blue")){
                checkBx.click();
                break;
            }

        }










    }
}