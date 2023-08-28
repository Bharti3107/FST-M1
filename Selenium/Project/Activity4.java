package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Activity4 {
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
    public void verifyTitleofSecondpopularCourse()
    {
        // Finding the Top Course
        WebElement secondTopCourse=driver.findElement(By.xpath("(//div[@class=\"caption\"])[2]//h3[@class=\"entry-title\"]"));
        String secondPopularCourse= secondTopCourse.getText();
        // assert the title
        assertEquals(secondPopularCourse,"Email Marketing Strategies");
        System.out.println("Second Popular Course was: "+secondPopularCourse);
    }

}
