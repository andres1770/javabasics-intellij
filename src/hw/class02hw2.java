package hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class02hw2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        // go to fb .com

        driver.get("https://www.facebook.com/");
        //maximize window
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("andres");
        driver.findElement(By.name("lastname")).sendKeys("castro");
        driver.findElement(By.name("reg_email__")).sendKeys("215-554-6844");
        driver.findElement(By.id("password_step_input")).sendKeys("Abc1234");
        driver.findElement(By.id("month")).click();
        driver.findElement(By.id("day")).click();
        driver.findElement(By.id("year")).sendKeys("2001");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
    }
}