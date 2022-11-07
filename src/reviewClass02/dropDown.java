package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        // go to syntax project /checkbox demo
        driver.get("https://www.facebook.com/");
        // find the create new account button
        WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
createAccount.click();
// sleep for 3 seconds to wait for the window to open up
        Thread.sleep(3000);
        //select out date from the dropdown
        //approach to use select class
        // 1. find the web element that contains the select tag
        // 2.use select class-> Select sel=new Select(WebElement);

        //1.find the web element that contains the select tag

        WebElement day = driver.findElement(By.xpath("//select[@id='Day']"));
        // 2.use select class-> Select sel=new Select(WebElement);

        Select sel=new Select(day);

        //we have now three methods
        //1. select by index
        sel.selectByIndex(4);
        Thread.sleep(2000);
        //2. select by visible text
        sel.selectByVisibleText("31");
        Thread.sleep(2000);
        //3.select by value
        sel.selectByValue("16");
        Thread.sleep(2000);
        //.............................

        //1. find the web element
        WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
        //2. use select class to initiate an instance
        Select selMonth=new Select(month);
        selMonth.selectByVisibleText("Aug");
        // print all the available month in the console
        // get all the available options in the dropdown

        List<WebElement> options = selMonth.getOptions();
        //traverse through the loop and print each webelement
        for(int i =0;i<options.size();i++){
           String months =options.get(i).getText();
            System.out.println(months);
        }






    }
}