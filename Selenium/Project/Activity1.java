package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Activity1 {
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
    public void testHomePageTitle()
    {

            // Get the Title of the Page
            String actualTitle = driver.getTitle();
           // System.out.println("The Title of the Page is: "+actualTitle);
           // String expectedTitle= "Alchemy LMS – An LMS Application";

            //Verify the title of the page
            assertEquals(driver.getTitle(),"Alchemy LMS – An LMS Application");
            System.out.println("The Title of the Page is: "+actualTitle);

           /* if (expectedTitle.equals(actualTitle)) {
                System.out.println("Title is as expected.");
                driver.quit();
            } else {
                System.out.println("Title is not as expected.");
                System.out.println("Expected title: " + expectedTitle);
                System.out.println("Actual title: " + actualTitle);
            }*/


        }
    }
