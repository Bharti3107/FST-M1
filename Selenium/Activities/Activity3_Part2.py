from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.firefox.webdriver import WebDriver
from selenium.webdriver.support import expected_conditions
from webdriver_manager.firefox import GeckoDriverManager

# setup Firefox driver with WebDriverManager
service = FirefoxService(GeckoDriverManager().install())

# start the drive
with webdriver.Firefox(service=service) as driver:
    # Access the URL
    driver.get("https://v1.training-support.net/selenium/login-form")
    # print title of the page
    print("Title of the page is: ", driver.title)
    # locate the username field and enter username as Admin
    driver.find_element(By.XPATH,"//input[@id = 'username']").send_keys("admin")
    # locate the username field and enter username as Admin
    driver.find_element(By.XPATH,"//input[@id = 'password']").send_keys("password")
    # locate the login button and click it
    driver.find_element(By.XPATH,"//button[@class='ui button']").click()
    # confirmation on login
    driver.find_element(By.ID,"action-confirmation")
    driver.implicitly_wait(3000)
    # close the drive
    driver.close()


