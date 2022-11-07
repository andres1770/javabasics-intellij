package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkboxdemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        // go to syntax project /checkbox demo
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        // find all the checkboxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        // traverse through the checkboxes to find desired one
        for(WebElement checkBox:checkBoxes){
            //get the attribute value to check if this the right option to select
         String  optionName = checkBox.getAttribute("value");
         //if condition to select the right option
            if(optionName.equalsIgnoreCase("Option-3")){
                // if passed click on it
                checkBox.click();
            }
        }
    }
}