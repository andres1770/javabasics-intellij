package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdowndemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        // go to syntax project /checkbox demo
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        // find the dropdown
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='select-demo']"));
// use select class
        Select select=new Select(dropdown);
        //select an option by index
        select.selectByIndex(5);
        Thread.sleep(3000);
        // select by visible text
        select.selectByVisibleText("Saturday");
        Thread.sleep(3000);
        //select by value
        select.selectByValue("Sunday");
        // get all options available on the dropdown
        List<WebElement> options = select.getOptions();
        // traverse through this options
        for(int i=0;i<options.size();i++){
            WebElement option = options.get(i);
           String text=  option.getText();
           if(text.equalsIgnoreCase("Friday")){
               select.selectByIndex(i);
           }

        }


    }
}