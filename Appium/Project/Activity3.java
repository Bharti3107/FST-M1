package Project;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Activity3 {
    // Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException
    {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //open the page in chrom
        driver.get("https://v1.training-support.net/selenium");
    }
    // Test method
    @Test
    public void openToDOList() {
        // scroll to find todo list option
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        // Wait for the page to load
       // wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("android.widget.TextView[contains(@text,'A page in a page in a page.')]")));
        // Just scroll
        //driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".flingForward()"));
        // Locate element
        //driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Tab opener']")).click();
        // Scroll and locate elements
       WebElement element =  driver.findElement(AppiumBy.androidUIAutomator(
        UiScrollable + ".scrollTextIntoView(\"To-Do List\")"));
       element.click();
       System.out.println(element.getText());
        // Wait for the page to load
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[contains(@text,'To-Do List')]")));
        System.out.println("To DO list page is loaded");
        //Find size of list before adding To Do list
        List<WebElement> textItems1 = driver.findElements(AppiumBy.className("android.widget.TextView"));
        System.out.println(textItems1.size());

        //adding 1st To do list
        WebElement element1 = driver.findElement(AppiumBy.className("android.widget.EditText"));
        element1.click();
        element1.sendKeys("Appium Test To-Do list1");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[contains(@text,'Add Task')]")).click();
        System.out.println("1st task is added");
       // wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Appium Test To Do list1')]")));

        //adding 2nd To do list
        //WebElement element2 = driver.findElement(AppiumBy.className("android.widget.EditText"));
        element1.click();
        element1.sendKeys("Appium Test To-Do list2");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[contains(@text,'Add Task')]")).click();
        System.out.println("2nd task is added");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Appium Test To Do list2')]")));

        //adding 3rd To do list
        //WebElement element3 = driver.findElement(AppiumBy.className("android.widget.EditText"));
        element1.click();
        element1.sendKeys("Appium Test To-Do list3");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[contains(@text,'Add Task')]")).click();
        System.out.println("3rd task is added");

        // Find added to do list
        List<WebElement> textItems = driver.findElements(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Appium Test')]"));
        System.out.println(textItems.size());
        for (WebElement textItem : textItems) {
            System.out.println(textItem.getText());
        }
        //Find size of list after adding the To Do list
        List<WebElement> textItems3= driver.findElements(AppiumBy.className("android.widget.TextView"));
        System.out.println(textItems3.size());

        //Strike out the added to do list
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Appium Test To-Do list1')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Appium Test To-Do list2')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Appium Test To-Do list3')]")).click();

        //clear the list
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Clear List')]")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Appium Test To-Do list1')]")));
        System.out.println("To do list has been cleared");

        //Find size of list after clearing the To Do list
        List<WebElement> textItems2 = driver.findElements(AppiumBy.className("android.widget.TextView"));
        System.out.println(textItems2.size());

        //assert
        Assert.assertNotEquals(textItems3.size(),textItems2.size());
        System.out.println("Test is Pass");


       /** WebElement clearList = driver.findElement(AppiumBy.androidUIAutomator("text(\"Add more tasks to this list.\")"));
                //driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Add more tasks to this list')]"));
        String text = clearList.getText();
        Assert.assertEquals(text, "Add more tasks to this list.");
        System.out.println("Test is Pass");**/
    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }

}


