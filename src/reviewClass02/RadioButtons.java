package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        // go to syntax project /checkbox demo
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        // find the radio button
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        //traverse through the list of web elements

        for( WebElement radioBtn :radioButtons){
            // find the desire radio button
           String  option  = radioBtn.getAttribute("value");
            if(option.equalsIgnoreCase("5 - 15")){
                radioBtn.click();
            }

        }






    }
}