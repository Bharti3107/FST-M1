from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.firefox.webdriver import WebDriver
from selenium.webdriver.support import expected_conditions
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Open the browser to the URL
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")

    # initializing wait condition
   # wait = WebDriver(driver, 10)

    # print title of the page
    print("Page title is:" + driver.title)

    # find the dynamic checkbox and click it
checkBox =driver.find_element(By.ID, "dynamicCheckbox")
# find toggle checkbox
checkboxToggle = driver.find_element(By.NAME, "toggled")

# click on the checkbox
checkboxToggle.click()
print("checkbox clicked")

# wait till checkbox disapper
#wait.untill(expected_conditions.invisibility_of_element(checkBox))
#print("check box is not visible")
