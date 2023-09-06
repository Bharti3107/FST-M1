from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.by import By


def test_logintoWebsit():
    # setup Firefoxdriver with WebDriverManager
    service = FirefoxService(GeckoDriverManager().install())

    # start the driver
    with webdriver.Firefox(service=service) as driver:
        # Access the URL
        driver.get("https://alchemy.hguy.co/lms")
        # print header of the page
        print("Title of the home page is : ", driver.title)
        # ccount Link
        myAccount = driver.find_element(By.XPATH, "//a[contains(text(),'My Account')]")
        myAccount.click()
        accountTitle = driver.find_element(By.XPATH, "//h1")
        myAccountTitle = accountTitle.text
        print("Title of the current page is ", myAccountTitle)

        # Click Login Button
        loginBtn = driver.find_element(By.XPATH, "//a[contains(text(),'Login')]")
        loginBtn.click()

        # Login Form
        userName = driver.find_element(By.XPATH, "//input[@id=\"user_login\"]")
        password = driver.find_element(By.XPATH, "//input[@id=\"user_pass\"]")
        loginButton = driver.find_element(By.XPATH, "//input[@id=\"wp-submit\"]")

        # sending the input values
        userName.clear()
        userName.send_keys("root")
        password.clear()
        password.send_keys("pa$$w0rd")
        loginButton.click()

        # ifying the Login was successful
        urcourses = driver.find_element(By.XPATH, "//h3[contains(text(),'Your Courses')]")
        if urcourses.is_displayed():
            print("Your Course section was displayed")
            print("Logged in Successfully")
        else:
            print("User not logged in")
