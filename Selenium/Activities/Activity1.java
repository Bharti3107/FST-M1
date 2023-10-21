package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        //setting up the driver
        WebDriverManager.firefoxdriver().setup();
        //Initializing Webdriver
        WebDriver driver = new FirefoxDriver();
        //Access the URL
        driver.get("http://v1.training-support.net/");
        //Get the title of the page and print in
        System.out.println("Title of the page is: "+driver.getTitle());
        //locate the Webelement
        WebElement element = driver.findElement(By.id("about-link"));
        //click on button
        element.click();
        //get the title of the new page and print
        System.out.println("Title of the new page is: "+driver.getTitle());
        //close the browser
        driver.close();

    }
}
