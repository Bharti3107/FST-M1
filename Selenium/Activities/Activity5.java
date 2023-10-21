package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) throws InterruptedException {
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
        //Perform left click
        builder.click().pause(10).build().perform();
      //  Thread.sleep(5000);
        String frontText = driver.findElement(By.className("active")).getText();
        System.out.println("Front after left click is: "+frontText);
        //Perform double click
        builder.doubleClick().pause(10).build().perform();
       // Thread.sleep(5000);
        String randomSide = driver.findElement(By.className("active")).getText();
        System.out.println("Front after double click is: "+randomSide);
        //perform right click
        builder.contextClick().pause(10).build().perform();
       // Thread.sleep(5000);
        String frontTextRight = driver.findElement(By.className("active")).getText();
        System.out.println("Front after right click is: "+frontTextRight);
        //Close the browser
        driver.close();

    }
}
