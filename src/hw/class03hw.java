package hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class03hw {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/");

        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();
        //click on demo
       driver.findElement(By.xpath("//a[@class='list-group-item'and @href='basic-first-form-demo.php']")).click();
       driver.findElement(By.id("user-message")).sendKeys("la bestia el animal ");
       driver.findElement(By.xpath("//button[text()='Show Message']")).click();




    }
}