from selenium import webdriver
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
    driver.get("https://v1.training-support.net/selenium/target-practice")
    # print header of the page
    print("Title of the home page is : ", driver.title)
    # find 3rd header of the page and print the text
    thirdheader = driver.find_element(By.XPATH,"//h3[@id='third-header']")
    print("Text of the third header is : ", thirdheader.text)
    # find 5th header of the page and print its color
    fifthHeader = driver.find_element(By.XPATH,"//h5[contains(text(), 'Fifth header')]")
    print("Color of the fifth header is: " + fifthHeader.value_of_css_property("color"))
    # locate the violet button and print its classed
    violetButton = driver.find_element(By.XPATH,"//button[contains(text(), 'Violet')]")
    print("Class of violet button is: " + violetButton.get_attribute("class"))
    # locate the grey button and print text
    greyButton = driver.find_element(By.XPATH,"//button[@class = 'ui grey button']")
    print("Text of grey button is: " + greyButton.text)
    # close the browser
    driver.close()
