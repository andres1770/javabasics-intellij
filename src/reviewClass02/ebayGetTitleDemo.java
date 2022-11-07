package reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebayGetTitleDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        // go to ebay
        driver.get("https://www.ebay.com/");
        // select from the dropdown
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));

        Select sel=new Select(dropDown);

        sel.selectByValue("58058");

        driver.findElement(By.xpath("//input[@type='submit']")).click();


        //verify the title


     //   WebElement title = driver.findElement(By.xpath("//title"));
        //String titleText = title.getText();

      String title =  driver.getTitle();

      if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
          System.out.println("the title is verified ");
      }
      else {
          System.out.println("the title is incorrect");
      }







    }
}