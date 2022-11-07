package hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hwclass04task1 {
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
// send keys to password
        password.sendKeys("Hum@nhrm123");

        // find element for login button
        WebElement login = driver.findElement(By.cssSelector("input[name='Submit']"));
// click operation on login button
        login.click();

        // find element for message "welcome admin"
        WebElement welcome = driver.findElement(By.cssSelector("a[id='welcome']"));
        // check if "welcome admin" message is displayed
        boolean displaystatus = welcome.isDisplayed();
        // print
        System.out.println("the Welcome Admin message is displayed = "+displaystatus);





    }
}