from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.by import By

def test_Contact():
    # setup Firefoxdriver with WebDriverManager
    service = FirefoxService(GeckoDriverManager().install())

    # start the driver
    with webdriver.Firefox(service=service) as driver:
        # Access the URL
        driver.get("https://alchemy.hguy.co/lms")
        # print header of the page
        print("Title of the home page is : ", driver.title)
        //click the Contact Link
    WebElement contactElement = driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
    contactElement.click();
    System.out.println("contact Element clicked");
    try {
    Thread.sleep(500);
    } catch (InterruptedException e) {
    throw new RuntimeException(e);
    }

    //Contact Form WebElements
    WebElement firstname = driver.findElement(By.xpath("//*[contains(text(),'Full Name')]//following-sibling::input"));
    WebElement email = driver.findElement(By.xpath("//*[contains(text(),'Email')]//following-sibling::input"));
    WebElement subject = driver.findElement(By.xpath("//*[contains(text(),'Subject')]//following-sibling::input"));
    WebElement comment = driver.findElement(By.xpath("//*[contains(text(),'Comment or Message ')]//following-sibling::textarea"));
    WebElement submit = driver.findElement(By.xpath("//button[contains(text(), 'Send Message')]"));

    //Input the Contact Form
    firstname.sendKeys("Bharath");
    email.sendKeys("bharath.velu@ibm.com");
    subject.sendKeys("LMS Practice test");
    comment.sendKeys("submit the contact form");

    //Submit the Contact Form
    submit.click();
    try {
    Thread.sleep(500);
    } catch (InterruptedException e) {
    throw new RuntimeException(e);
    }

    //Getting the Confirmation Message
    WebElement confirmMessage = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p"));
    String confirm = confirmMessage.getText();
    System.out.println("Confirmation Message displayed as:" +confirm);
