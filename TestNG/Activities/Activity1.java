package Activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;
        @BeforeMethod
       public void openBrowser()
        {

            driver = new FirefoxDriver();
            driver.get("https://v1.training-support.net/");
        }
        @AfterMethod
                public void closeBrowser()
            {
                driver.close();
            }

    @Test(priority = 1)
            public void getTitle()
        {
            System.out.println("Title of the page is: "+driver.getTitle());
            assert driver.getTitle() == "Training Support";
        }

    @Test(priority = 2)
            public void getCurrentURL()
        {
            System.out.println("Current URL is: "+driver.getCurrentUrl());
        }

    @Test(priority = 3)
           public void findButton()
    {

    }

}

