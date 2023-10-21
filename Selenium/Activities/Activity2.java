package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        //setting up the driver
        WebDriverManager.firefoxdriver().setup();
        //Initializing Webdriver
        WebDriver driver = new FirefoxDriver();
        //Access the URL
        driver.get("https://v1.training-support.net/selenium/login-form");
        //Get the title of the page and print in
        System.out.println("Title of the page is: " + driver.getTitle());
        //locate the username field and enter username as Admin
        driver.findElement(By.id("username")).sendKeys("admin");
        //locate the username field and enter username as Admin
        driver.findElement(By.id("password")).sendKeys("password");
        //locate the login button and click it
        driver.findElement((By.xpath("//button[@class='ui button']"))).click();
        //confirmation on login
        driver.findElement(By.id("action-confirmation"));
        Thread.sleep(2000);
        //close the drive
        driver.close();


    }
}
