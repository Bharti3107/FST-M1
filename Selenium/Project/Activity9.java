package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.Assert;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class Activity9 {
    WebDriver driver;

    @BeforeClass
    public void openBrowser()
    {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @AfterClass
    public void closeBrowser()
    {
        driver.close();
    }

    @Test(priority = 1)
    public void login()
    {
        //click on My account
        driver.findElement(By.xpath("//a[contains(text(), 'My Account')]")).click();
        //click on Login
        driver.findElement(By.xpath("//a[contains(text(), 'Login')]")).click();
        //provide username
        driver.findElement(By.xpath("//input[@id = 'user_login']")).sendKeys("root");
        //provide password
        driver.findElement(By.xpath("//input[@id = 'user_pass']")).sendKeys("pa$$w0rd");
        //click on Submit
        WebElement element = driver.findElement(By.xpath("//input[@id = 'wp-submit']"));
        element.click();
        System.out.println(driver.getTitle());
        //verify title of the page
        assertEquals(driver.getTitle(),"My Account – Alchemy LMS");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//h1[contains(text(), 'My Account')]")));
    }
    @Test(priority = 2)
     public void completeTheCourse() throws InterruptedException {
        //locate the navigation bar "About Courses" and click it
        driver.findElement(By.xpath("//a[contains(text(), 'All Courses')]")).click();
        //select a course and open it
        WebElement coursePage = driver.findElement(By.xpath("//a[@class = ('btn btn-primary') and (@href = 'https://alchemy.hguy.co/lms/courses/social-media-marketing/')]"));
        coursePage.click();
        Thread.sleep(2000);
        // click on any course to see Details
        driver.findElement(By.xpath("//div[contains(text(), 'Developing Strategy')]")).click();
        System.out.println(driver.getTitle());

        //assert the title
        assertEquals(driver.getTitle(), "Developing Strategy – Alchemy LMS");
    }

}
