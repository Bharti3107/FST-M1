from selenium import webdriver
from selenium.webdriver import Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.firefox.webdriver import WebDriver
from selenium.webdriver.support import expected_conditions
from webdriver_manager.firefox import GeckoDriverManager

# setup Firefox driver with WebDriverManager
service = FirefoxService(GeckoDriverManager().install())

# start the driver
with webdriver.Firefox(service=service) as driver:
    # Access the URL
    driver.get("https://v1.training-support.net/selenium/drag-drop")
    # print header of the page
    print("Title of the home page is : ", driver.title)

