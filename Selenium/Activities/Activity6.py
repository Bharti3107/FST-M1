from selenium import webdriver
from selenium.webdriver import Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.firefox.webdriver import WebDriver
from selenium.webdriver.support import expected_conditions
from webdriver_manager.firefox import GeckoDriverManager

# setup Firefoxdriver with WebDriverManager
service = FirefoxService(GeckoDriverManager().install())

# start the driver
with webdriver.Firefox(service=service) as driver:
    # Access the URL
    driver.get("https://v1.training-support.net/selenium/input-events")
    # print header of the page
    print("Title of the home page is : ", driver.title)
    # setup the object of Action class
    actions = webdriver.ActionChains(driver)
    # press the Key first letter of name
    actions.send_keys("B")
    # press and hold Ctrl key and press the 'a' key
    actions.key_down(Keys.CONTROL)
    actions.send_keys("a")
    # press the v' key
    actions.send_keys("v")
    # release the key
    actions.key_up(Keys.CONTROL)
    # perform the action
    actions.perform()
    driver.close()



