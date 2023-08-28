package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
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
    public void countNoofCourses()
    {
        //click the Contact Link
        WebElement contactElement = driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
        contactElement.click();
        System.out.println("contact Element clicked");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Contact Form WebElements
        WebElement firstname = driver.findElement(By.xpath("//*[contains(text(),'Full Name')]//following-sibling::input"));
        WebElement email = driver.findElement(By.xpath("//*[contains(text(),'Email')]//following-sibling::input"));
        WebElement subject = driver.findElement(By.xpath("//*[contains(text(),'Subject')]//following-sibling::input"));
        WebElement comment = driver.findElement(By.xpath("//*[contains(text(),'Comment or Message ')]//following-sibling::textarea"));
        WebElement submit = driver.findElement(By.xpath("//button[contains(text(), 'Send Message')]"));

        //Input the Contact Form
        firstname.sendKeys("Bharath");
        email.sendKeys("bharath.velu@ibm.com");
        subject.sendKeys("LMS Practice test");
        comment.sendKeys("submit the contact form");

        //Submit the Contact Form
        submit.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Getting the Confirmation Message
        WebElement confirmMessage = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p"));
        String confirm = confirmMessage.getText();
        System.out.println("Confirmation Message displayed as:" +confirm);

    }

}
