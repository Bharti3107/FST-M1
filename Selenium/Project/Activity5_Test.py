from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.by import By

def test_navigateToMyAccountPage():
    # setup Firefoxdriver with WebDriverManager
    service = FirefoxService(GeckoDriverManager().install())

    # start the driver
    with webdriver.Firefox(service=service) as driver:
        # Access the URL
        driver.get("https://alchemy.hguy.co/lms")
        # print header of the page
        print("Title of the home page is : ", driver.title)
        myAccount = driver.find_element(By.XPATH,"//a[contains(text(),'My Account')]")
        myAccount.click()
        accountTitle = driver.find_element(By.XPATH,"//h1")
        myAccountTitle = accountTitle.text
        print("Title of the current page is " , myAccountTitle)
