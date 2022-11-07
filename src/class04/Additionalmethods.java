package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Additionalmethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        // go to syntax get form demo
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        // find the element
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));
        // get text from weebelemt
        String text= btn.getText();
        //print it in console
        System.out.println(text);

        // get the value of the attribute id of this element

        String idvalue = btn.getAttribute("id");
        // print in console
        System.out.println("the value of this id is "+idvalue);


    }
}
