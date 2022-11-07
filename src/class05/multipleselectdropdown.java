package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multipleselectdropdown {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        // go to syntax project /checkbox demo
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        // find element that contains the select class
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));
        //using select class
        Select sel=new Select(DD);
         // by index
        sel.selectByIndex(3);
        // by visible text
        sel.selectByVisibleText("Texas");
        // deselect by index
        sel.deselectByIndex(3);
        // write down a code to select all the options in the dropdown
        List<WebElement> options = sel.getOptions();
        for(int i=0;i<options.size();i++){
            sel.selectByIndex(i);

        }
Thread.sleep(3000);
        sel.deselectAll();
        // how can you check if the drop-down is multi select
        boolean multiselect = sel.isMultiple();
        System.out.println(multiselect);


    }
}