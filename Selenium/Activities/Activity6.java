package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {
    public static void main(String[] args) {
        //setting up system property
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        //setting up Webdrivermanager
        WebDriverManager.firefoxdriver().setup();
        //Initializing webdriver
        WebDriver driver = new FirefoxDriver();
        //Access the URL
        driver.get("https://v1.training-support.net/selenium/input-events");
        //print header of the page
        System.out.println("Title of the home page is : "+driver.getTitle());
        //initializing object of Action class
        Actions builder = new Actions(driver);
        //press the Key first letter of name
        builder.sendKeys("B").build().perform();
        //press and hold Ctrl key and press the 'a' key and 'v'
        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        //close the browser
        driver.close();

    }
}
