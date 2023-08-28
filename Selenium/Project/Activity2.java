package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Activity2 {

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
     public void verifyWebsiteHeading()
    {
        // Get the Title of the Page
        String actualTitle = driver.getTitle();
        System.out.println("The Title of the Page is: " + actualTitle);

        //Finding Header Element
        WebElement headerElement = driver.findElement(By.xpath("//h1[contains(text(),' Learn from Industry Experts ')]"));
        String currentHeader = headerElement.getText();
        //assert the title
        assertEquals(currentHeader,"Learn from Industry Experts");
        System.out.println("The Title of the Page is: "+currentHeader);


       /* //Verify the HeaderElement
        if (actualHeader.equals(currentHeader)) {
            System.out.println("Header was matched");
            driver.quit();
        } else {
            System.out.println("Header was not matched");
            System.out.println("Actual Header is" + actualHeader);
            System.out.println("Current Header is" + currentHeader);

        }*/
    }
}