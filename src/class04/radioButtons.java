package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        //create a web driver instance
        WebDriver driver = new ChromeDriver();

        // go to syntax radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        // get the button male

        WebElement maleradiobtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
// chelc if the radio button is displayed
      boolean displaystatus =  maleradiobtn.isDisplayed();

      // print the display status
        System.out.println(" the radio button is displayed "+displaystatus);

        // check if male radio button is enabled
       boolean enablestatus= maleradiobtn.isEnabled();

        System.out.println("the radio button is enabled "+enablestatus);

        // check if male radio button is selected

       boolean selectstatus = maleradiobtn.isSelected();
       System.out.println(" the radio button is selected "+selectstatus);


        // check if the radio button is selected then click on it

        if(!selectstatus){
            //perform click operation on radio button
            maleradiobtn.click();
        }
        // check if male radio button is selected
        selectstatus = maleradiobtn.isSelected();
        System.out.println(" the radio button is selected "+selectstatus);




    }
}
