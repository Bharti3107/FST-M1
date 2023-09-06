from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.by import By

def test_countNoofCourses():
    # setup Firefoxdriver with WebDriverManager
    service = FirefoxService(GeckoDriverManager().install())

    # start the driver
    with webdriver.Firefox(service=service) as driver:
        # Access the URL
        driver.get("https://alchemy.hguy.co/lms")
        # print header of the page
        print("Title of the home page is : ", driver.title)
        #Identify No of Course
        list = driver.find_elements(By.XPATH,"(//div[@class= 'caption'])")
        print("No of Courses Available is: ", list.count("//div[@class= 'caption']"))
