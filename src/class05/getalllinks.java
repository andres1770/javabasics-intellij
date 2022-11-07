package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class getalllinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        // go to ebay
        driver.get("https://www.ebay.com/");
        //get all the links i.e archor tags from website
       List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));
       //print the size of the list
        System.out.println("the size of the linkslist is :"+ebayLinks.size());
        // implementing a for loop to traverse through the list of webelements
        for(WebElement ebayLink:ebayLinks){
            //extracting the value of attribute href because it contains the links
            String link= ebayLink.getAttribute("href");
            //print the link
            System.out.println(link);

        }


    }
}