package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingelements {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        // go to fb .com

        driver.get("https://www.facebook.com/");
        //maximize window
        driver.manage().window().maximize();
        //locate the element and send keys

        driver.findElement(By.id("email")).sendKeys("andres la cabra el animal");
        // enter password in text box
        driver.findElement(By.name("pass")).sendKeys("the best");
        //clickl the login
        driver.findElement(By.name("login")).click();

        //task2
        //click opn forgot password
        //driver.findElement(By.linkText("Forgot password?")).click();

        //task 3
        //click on forgot password using partial linktext locator
        //driver.findElement(By.partialLinkText("Forgot")).click();


    }
}
