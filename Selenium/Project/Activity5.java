package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
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
    public void navigateToMyAccountPage()
    {
        WebElement myAccount = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
        myAccount.click();
        WebElement accountTitle = driver.findElement(By.xpath("//h1"));
        String myAccountTitle = accountTitle.getText();
        System.out.println("Title of the current page is " + myAccountTitle);

    }

}
