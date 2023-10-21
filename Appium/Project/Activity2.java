package Project;

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
import java.util.List;

public class Activity2 {
    // Driver Declaration
    AndroidDriver driver;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException
    {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
    }
    // Test method
    @Test
    public void createNewNote() {
        // click on Create New Note
        driver.findElement(AppiumBy.accessibilityId("New text note")).click();
        driver.findElement(AppiumBy.id("editable_title")).sendKeys("Appium Test");
        driver.findElement(AppiumBy.id("edit_note_text")).sendKeys("Appium Mobile Test Activity");
        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
        // Find added note
        List<WebElement> textItems = driver.findElements(AppiumBy.id("browse_note_interior_content")
        );
        System.out.println(textItems.size());
        for (WebElement textItem : textItems) {
            System.out.println(textItem.getText());
        }

      String note = driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Appium Mobile Test Activity')]")).getText();
        // Assertion
        Assert.assertEquals(note, "Appium Mobile Test Activity");
        System.out.println("Note is added");
    }


    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }

}
