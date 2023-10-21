package Project;

import dev.failsafe.Timeout;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Activity1 {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException
    {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
    }
@Test
    public void addNewGoogleTask()
{
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 //click the button to add new task
    WebElement newTaks = driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/tasks_fab\")"));
    newTaks.click();
    //Add task1
    WebElement addTask = driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/add_task_title\")"));
    addTask.sendKeys("Complete Activity with Google Tasks");
    //click on Save button
    WebElement saveTask = driver.findElement(AppiumBy.androidUIAutomator("text(\"Save\")"));
    saveTask.click();
    //Add task2
    newTaks.click();
    addTask.sendKeys("Complete Activity with Google Keep");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    saveTask.click();
    //Add task3
    newTaks.click();
    addTask.sendKeys("Complete the second Activity Google Keep");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    saveTask.click();
    //verify added task
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    List<WebElement> taskList = driver.findElements(AppiumBy.androidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/task_name\")"));
    System.out.println(taskList.size());
    for (WebElement textItem : taskList) {
        System.out.println(textItem.getText());
    }

}
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}
