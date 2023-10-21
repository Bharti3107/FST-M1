package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Activity15 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("Title of the page is: " + driver.getTitle());
        WebElement username = driver.findElement(By.xpath("//input[starts-with(@class,'username')])"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@class,'password')]"));
        password.sendKeys("password");
        WebElement login = driver.findElement(By.xpath("//button[@onclick='signIn()']"));
        login.click();
        WebElement pageload = driver.findElement(By.id("action-confirmation"));
        pageload.getText();
        System.out.println("Login message is: "+pageload);
        driver.quit();
    }
}
