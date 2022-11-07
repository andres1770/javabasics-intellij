package hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class04hw2 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");

// find element of username
        WebElement username = driver.findElement(By.cssSelector("input[name='txtUsername']"));
// send keys for username
        username.sendKeys("Admin");
        //find password element
        WebElement password = driver.findElement(By.cssSelector("input[name='txtPassword']"));
        // find element for login button
        WebElement login = driver.findElement(By.cssSelector("input[name='Submit']"));
// click operation on login button
        login.click();
        // find error message
        WebElement errormessage = driver.findElement(By.cssSelector("span[id='spanMessage']"));
        // verify error message
        boolean displaystatus = errormessage.isDisplayed();
        // check for message display status

        if(displaystatus){
            System.out.println("Password cannot be empty message displayed = "+displaystatus);
        }
    }
}