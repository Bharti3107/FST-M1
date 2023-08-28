package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @AfterClass
    public void closeBrowser() {
        driver.close();
    }
    @Test
    public void logintoWebsit()
    {
        //MyAccount Link
        WebElement myAccount = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
        myAccount.click();
        WebElement accountTitle = driver.findElement(By.xpath("//h1"));
        String myAccountTitle = accountTitle.getText();
        System.out.println("Title of the current page is " + myAccountTitle);

        //Click Login Button
        WebElement loginBtn= driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        loginBtn.click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Login Form
        WebElement userName = driver.findElement(By.xpath("//input[@id=\"user_login\"]"));
        WebElement password = driver.findElement(By.xpath("//input[@id=\"user_pass\"]"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"wp-submit\"]"));


        //passing the input values
        userName.clear();
        userName.sendKeys("root");
        password.clear();
        password.sendKeys("pa$$w0rd");
        loginButton.click();

        //Verifying the Login was successful
        WebElement  urcourses= driver.findElement(By.xpath("//h3[contains(text(),'Your Courses')]"));
        if(urcourses.isDisplayed()) {
            System.out.println("Your Course section was displayed");
            System.out.println("Logged in Successfully");
        }else{
            System.out.println("User not logged in");
        }

    }

}
