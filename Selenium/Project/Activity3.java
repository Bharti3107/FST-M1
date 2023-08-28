package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Activity3 {
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
    public void verifyTitleoffirstinfobox()
    {
        // Get the First Box Title
        WebElement firstbox = driver.findElement(By.xpath("(//h3[@class=\"uagb-ifb-title\"])[1]"));
        /* other way for the xpath://h3[contains(text()," Actionable Training ")] */
        String currentFirstBoxTitle = firstbox.getText();
        //verify the title
        assertEquals(currentFirstBoxTitle,"Actionable Training");
        System.out.println("First Box Title is " + currentFirstBoxTitle);

    }
}
