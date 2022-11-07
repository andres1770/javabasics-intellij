package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrder {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();
        // go ot smart bear
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        // maximize window
        driver.manage().window().maximize();
// find element and type imput on the username
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("tester");
// enter passsword
driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
// click login
        driver.findElement(By.className("button")).click();
// make sure that title is correct i.e web orders
// get title of the page
    String title = driver.getTitle();
        System.out.println(title);

        if(title.equalsIgnoreCase("web Orders")){
            System.out.println("the title is correct "+title);
        }else {
            System.out.println("the title is incorrect"+title);
        }
        driver.quit();


    }
}