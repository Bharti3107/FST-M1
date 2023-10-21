from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.firefox.webdriver import WebDriver
from selenium.webdriver.support import expected_conditions
from webdriver_manager.firefox import GeckoDriverManager

# setup Firefoxdriver with WebDriverManager
service = FirefoxService(GeckoDriverManager().install())

# start the drive
with webdriver.Firefox(service=service) as driver:
    # Access the URL
    driver.get("http://v1.training-support.net/")
    # print title of the page
    print("Title of the page is: ", driver.title)

    # locate the webelement
    driver.find_element(By.ID, "about-link").click()
    # print the title of new page
    print("Title of the new page is: ", driver.title)
    # close the browser
    driver.close()
