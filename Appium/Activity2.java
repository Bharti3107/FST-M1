package Activity;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
public class Activity2 {
    //Driver Declaration
    AndroidDriver driver;

    //setup methode
    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");

        //server address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        //Driver initialization
        driver = new AndroidDriver(serverURL,options);

    }

    @Test
    public void test()
    {
        //open the URL
        driver.get("https://v1.training-support.net/");
        //locate and print the heading of the page
        String pageTitle = driver.findElement(AppiumBy.xpath("//android.view.View[@text = 'Training Support']")).getText();
        System.out.println(pageTitle);
        //click on About Us
        WebElement aboutUsPageTitle = driver.findElement(AppiumBy.id("about-link"));
        aboutUsPageTitle.click();
        System.out.println(aboutUsPageTitle.getText());
    }

    @AfterClass
    public void closeDrvier()
    {
        driver.quit();
    }
}
