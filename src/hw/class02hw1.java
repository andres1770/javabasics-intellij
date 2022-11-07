package hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class02hw1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        WebDriver driver = new ChromeDriver();


        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("andres");
        driver.findElement(By.id("customer.lastName")).sendKeys("castro");
        driver.findElement(By.id("customer.address.street")).sendKeys("my street");
        driver.findElement(By.id("customer.address.city")).sendKeys("my city");
        driver.findElement(By.id("customer.address.state")).sendKeys("NJ");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("00000");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("000-000-0000");
        driver.findElement(By.id("customer.ssn")).sendKeys("000-00-000");
        driver.findElement(By.id("customer.username")).sendKeys("andres1770");
        driver.findElement(By.id("customer.password")).sendKeys("Andres123456");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Andres123456");
        driver.findElement(By.className("button")).click();
        driver.quit();



    }
}