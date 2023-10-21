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
    driver.get("https://v1.training-support.net/selenium/input-events")
    # print header of the page
    print("Title of the home page is : ", driver.title)
    # setup the object of Action class
    actions = webdriver.ActionChains(driver)
    # Perform left click
    actions.click().pause(10).perform()
    frontText = driver.find_element(By.CLASS_NAME,"active")
    print("Front after left click is: ",frontText.text)
    #Perform double click
    actions.double_click().pause(10).perform()
    randomSide = driver.find_element(By.CLASS_NAME,"active")
    print("Front after double click is: ",randomSide.text)
    #perform right click
    actions.context_click().pause(10).perform()
    frontTextRight = driver.find_element(By.CLASS_NAME,"active")
    print("Front after right click is: ",frontTextRight.text)
    #Close the browser
    driver.close()

