package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        //setting up system property
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        //setting up Webdrivermanager
        WebDriverManager.firefoxdriver().setup();
        //Initializing webdriver
        WebDriver driver = new FirefoxDriver();
        //Access the URL
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        //print header of the page
        System.out.println("Title of the home page is : " + driver.getTitle());
        //initializing object of Action class
        Actions builder = new Actions(driver);
        //locate the ball
        WebElement football = driver.findElement(By.id("draggable"));
        //locate the dropzone1
        WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
        //locate the dropzone2
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        //move to ball in dropzone1
        builder.clickAndHold(football).moveToElement(dropzone1).release().build().perform();
        // drag and drop ball from dropzone1 to dropzone2
        builder.dragAndDrop(football,dropzone2).build().perform();
        //Close the browser
        driver.close();
    }
}
