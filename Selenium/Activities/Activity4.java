package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) throws InterruptedException {
        //setting up system property
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        //setting up Webdrivermanager
        WebDriverManager.firefoxdriver().setup();
        //Initializing webdriver
        WebDriver driver = new FirefoxDriver();
        //Access the URL
        driver.get("https://v1.training-support.net/selenium/target-practice");
        //print header of the page
        System.out.println("Title of the home page is : "+driver.getTitle());
        //find 3rd header of the page and print the text
        WebElement thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']"));
        System.out.println("Text of the third header is : "+thirdHeader.getText());
        //find 5th header of the page and print its color
        WebElement fifthHeader = driver.findElement(By.xpath("//h5[contains(text(), 'Fifth header')]"));
        System.out.println("Color of the fifth header is: "+fifthHeader.getCssValue("color"));
        //locate the violet button and print its classed
        WebElement violetButton = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]"));
        System.out.println("Class of violet button is: "+violetButton.getAttribute("class"));
        //locate the grey button and print text
        WebElement greyButton = driver.findElement(By.xpath("//button[@class = 'ui grey button']"));
        System.out.println("Text of grey button is: "+greyButton.getText());
        //close the browser
        driver.close();

} }
