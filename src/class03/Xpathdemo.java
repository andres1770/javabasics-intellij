package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {
    public static void main(String[] args) {
//idetify xpath by attribute
        //imput[@id='box']

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        //enter username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("andres el animal the best");
// identify by attribute
        //tagname[@attribute='attribute value']
        //example = // inpu[@id='text']

        // to identify xpath by text
        //tagname[text()='text value']
        // example= //a[text()='Forgot password?']"



        // click on forgot password
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
// to identidy xpath by contains method
        //tagname[contains(@attribute,'partial attribute value')]
        // example //button[contains(@type,'sub')]

        // to identify by contains text
        //syntax //tagname[contains(text(),'partial text value')]
        // example //a[contains(text(),'Forgot')]

// using xpath toidentify by starts with
        //syntax = //tagname[starts-with(@attribute,'partial starting attribute value')]
//       example = //input[starts-with(@name,'pa')]


    }
}
